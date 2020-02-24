package com.cherepiv.weare8.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharityDonationIncentive(
    val amount: Double,
    val charityId: String,
    val charityName: String,
    val charityLogoUri: String) : Parcelable