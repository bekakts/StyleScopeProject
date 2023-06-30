package com.example.stylescopeproject.presentation.model.company

import com.example.stylescopeproject.domain.model.company.CompanyModel
import com.example.stylescopeproject.domain.model.designer.DesignerModel

data class CompanyUI(
    val id: Int? = null,
    val image: String? = null,
    val title: String? = null,
    val summary: String? = null,
    val views: Int? = null,
    val rating: String? = null,
    val countReviews: String? = null
)

fun CompanyModel.toUI() = CompanyUI(
    id = id,
    image = image,
    title = title,
    summary = summary,
    views = views,
    rating = rating,
    countReviews = countReviews
)

data class CompanyDetailUI(
    val siteLink: String,
    val image: String,
    val title: String,
    val summary: String,
    val about: String,
    val services: List<ServicesUI>,
    val gallery: List<GalleryUI>,
    val packages: List<CompanyPackageUI>,
    val designers: List<DesignerUI>,
    val countReviews: String,
    val reviews: List<Int>,
    val phoneNumber1: String,
    val phoneNumber2: String,
    val phoneNumber3: String,
    val email1: String,
    val email2: String,
    val email3: String,
    val socialMedia1: String,
    val socialMedia2: String,
    val socialMedia3: String,
    val socialMedia4: String,
    val address: String
)

data class ServicesUI(
    val id: Int,
    val title: String,
    val description: String
)

data class GalleryUI(
    val id: Int,
    val company: Int,
    val image: String,
    val about: String
)

data class CompanyPackageUI(
    val image: String,
    val title: String,
    val description: String,
    val price: Int
)

data class DesignerUI(
    val photo: String,
    val name: String,
    val companyTitle: List<String>,
    val occupation: String,
    val rating: String,
    val countReviews: String
)

fun DesignerModel.toUI() = DesignerUI(
    photo = photo,
    name = name,
    companyTitle = companyTitle,
    occupation = occupation,
    rating= rating,
    countReviews = countReviews
)