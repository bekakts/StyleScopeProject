package com.example.stylescopeproject.data.remote.dtos.designer

import com.google.gson.annotations.SerializedName

data class Designer(
    val id: Int,
    val name: String,
    val photo: String,
    @SerializedName("company_title")
    val companyTitle: List<String>,
    val occupation: String,
    val rating: String,
    @SerializedName("count_reviews")
    val countReviews: String
)

data class DesignerDetailDto(
    val name:String,
    val surname:String,
    val photo:String,
    @SerializedName("work_EXP")
    val workEXP:String,
    val occupation:String,
    val description:String,
    @SerializedName("phone_number")
    val phoneNumber:String,
    val email:String,
    val instagram:String,
    val gallery:List<DesignerGalleryDto>,
    val rating:String,
    @SerializedName("count_reviews")
    val countReviews:String
)

data class DesignerGalleryDto(
    val about:String,
    val image:String
)