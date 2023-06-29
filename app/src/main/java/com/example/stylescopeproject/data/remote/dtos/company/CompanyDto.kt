package com.example.stylescopeproject.data.remote.dtos.company

import com.example.stylescopeproject.data.mapper.DataMapper
import com.example.stylescopeproject.domain.model.company.CompanyDetailModel
import com.example.stylescopeproject.domain.model.company.CompanyModel
import com.example.stylescopeproject.domain.model.company.CompanyPackageModel
import com.example.stylescopeproject.domain.model.company.Designer
import com.example.stylescopeproject.domain.model.company.GalleryModel
import com.example.stylescopeproject.domain.model.company.ServicesModel
import com.google.gson.annotations.SerializedName

data class CompanyDto(
    val id: Int? = null,
    val image: String? = null,
    val title: String? = null,
    val summary: String? = null,
    val views: Int? = null,
    val rating: String? = null,
    @SerializedName("count_reviews")
    val countReviews: String? = null
) : DataMapper<CompanyModel> {
    override fun toDomain() = CompanyModel(
        id = id,
        image = image,
        title = title,
        summary = summary,
        views = views,
        rating = rating,
        countReviews = countReviews
        )
}

data class CompanyDetailDto(
    @SerializedName("site_link")
    val siteLink: String,
    val image: String,
    val title: String,
    val summary: String,
    val about: String,
    val services: List<ServicesDto>,
    val gallery: List<GalleryDto>,
    val packages: List<CompanyPackageDto>,
    val designers: List<DesignerDto>,
    @SerializedName("count_reviews")
    val countReviews: String,
    val reviews: List<Int>,
    @SerializedName("phone_number_1")
    val phoneNumber1: String,
    @SerializedName("phone_number_2")
    val phoneNumber2: String,
    @SerializedName("phone_number_3")
    val phoneNumber3: String,
    @SerializedName("email_1")
    val email1: String,
    @SerializedName("email_2")
    val email2: String,
    @SerializedName("email_3")
    val email3: String,
    @SerializedName("social_media_1")
    val socialMedia1: String,
    @SerializedName("social_media_2")
    val socialMedia2: String,
    @SerializedName("social_media_3")
    val socialMedia3: String,
    @SerializedName("social_media_4")
    val socialMedia4: String,
    val address: String
) : DataMapper<CompanyDetailModel> {
    override fun toDomain() = CompanyDetailModel(
        siteLink = siteLink,
        image = image,
        title = title,
        summary = summary,
        about = about,
        services = services.map { it.toDomain() },
        gallery = gallery.map { it.toDomain() },
        packages = packages.map { it.toDomain() },
        designers = designers.map { it.toDomain() },
        countReviews = countReviews,
        reviews = reviews,
        phoneNumber1 = phoneNumber1,
        phoneNumber2 = phoneNumber2,
        phoneNumber3 = phoneNumber3,
        email1 = email1,
        email2 = email2,
        email3 = email3,
        socialMedia1 = socialMedia1,
        socialMedia2 = socialMedia2,
        socialMedia3 = socialMedia3,
        socialMedia4 = socialMedia2,
        address = address

    )
}

data class ServicesDto(
    val id: Int,
    val title: String,
    val description: String
) : DataMapper<ServicesModel> {
    override fun toDomain() = ServicesModel(
        id = id,
        title = title,
        description = description
    )
}

data class GalleryDto(
    val id: Int,
    val company: Int,
    val image: String,
    val about: String
) : DataMapper<GalleryModel> {
    override fun toDomain() = GalleryModel(
        id = id,
        company = company,
        image = image,
        about = about
    )
}

data class CompanyPackageDto(
    val image: String,
    val title: String,
    val description: String,
    val price: Int
) : DataMapper<CompanyPackageModel> {
    override fun toDomain() = CompanyPackageModel(
        image = image,
        title = title,
        description = description,
        price = price
    )
}

data class DesignerDto(
    val photo: String,
    val name: String,
    @SerializedName("company_title")
    val companyTitle: String,
    val occupation: String,
    val rating: String,
    @SerializedName("count_reviews")
    val countReviews: String
) : DataMapper<Designer> {
    override fun toDomain() = Designer(
        photo = photo,
        name = name,
        companyTitle = companyTitle,
        occupation = occupation,
        rating = rating,
        countReviews = countReviews
    )
}
