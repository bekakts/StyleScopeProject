package com.example.stylescopeproject.domain.model.company

data class CompanyModel(
    val id: Int? = null,
    val image: String? = null,
    val title: String? = null,
    val summary: String? = null,
    val views: Int? = null,
    val rating: String? = null,
    val countReviews: String? = null
)

data class CompanyDetailModel(
    val siteLink: String,
    val image: String,
    val title: String,
    val summary: String,
    val about: String,
    val services: List<ServicesModel>,
    val gallery: List<GalleryModel>,
    val packages: List<CompanyPackageModel>,
    val designers: List<Designer>,
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

data class ServicesModel(
    val id: Int,
    val title: String,
    val description: String
)

data class GalleryModel(
    val id: Int,
    val company: Int,
    val image: String,
    val about: String
)

data class CompanyPackageModel(
    val image: String,
    val title: String,
    val description: String,
    val price: Int
)

data class Designer(
    val photo: String,
    val name: String,
    val companyTitle: String,
    val occupation: String,
    val rating: String,
    val countReviews: String
)
