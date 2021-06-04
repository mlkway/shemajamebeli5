package com.raywenderlich.shemajamebeli_five.data


import android.text.BoringLayout
import com.squareup.moshi.Json
import androidx.annotation.Keep
import java.lang.StringBuilder

@Keep
data class PersonSubListItem(
    @Json(name = "field_id")
    val fieldId: Int?,
    @Json(name = "field_type")
    val fieldType: String?,
    @Json(name = "hint")
    val hint: String?,
    @Json(name = "icon")
    val icon: String?,
    @Json(name = "keyboard")
    val keyboard: String?,
)