package com.example.stylescopeproject.domain.model.company

data class CompanyModel(
    val id: Int,
    val image: String,
    val title: String,
    val summary: String,
    val views: Int,
    val rating: String,
    val countReviews: String
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
    val designers: List<CompanyDesignerModel>,
    val countReviews: String,
    val reviews: List<Int>,
    val phoneNumber1: String,
    val email1: String,
    val socialMedia1: String,
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

data class CompanyDesignerModel(
    val photo: String,
    val name: String,
    val companyTitle: List<String>,
    val occupation: String,
    val rating: String,
    val countReviews: String
)
