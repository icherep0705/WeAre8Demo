package com.cherepiv.weare8.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CommunityFeed(

    val mediaImageUri: String?,
    val id: String?,
    val name: String?,
    val categoryType: String?,
    val url: String?,
    val weight: Int?) : Parcelable