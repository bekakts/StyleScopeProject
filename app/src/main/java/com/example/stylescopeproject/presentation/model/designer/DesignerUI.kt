package com.example.stylescopeproject.presentation.model.designer


data class DesignerUI(
    val id: Int,
    val name: String,
    val photo: String,
    val companyTitle: List<String>,
    val occupation: String,
    val rating: String,
    val countReviews: String
)

data class DesignerDetailUI(
    val name:String,
    val surname:String,
    val photo:String,
    val workEXP:String,
    val occupation:String,
    val description:String,
    val phoneNumber:String,
    val email:String,
    val instagram:String,
    val gallery:List<DesignerGalleryUI>,
    val rating:String,
    val countReviews:String
)

data class DesignerGalleryUI(
    val about:String,
    val image:String
)