package com.cherepiv.weare8.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FeedSponsorships(
    val campaignId: String,
    val sponsorshipId: String,
    val sponsorshipSetId: String,
    val brandName: String,
    val brandLogoUri: String,
    val brandInfo: String,
    val coverTileUri: String,
    val videoUriDash: String,
    val videoUriHls: String,
    val brief: String,
    val cashIncentive: CashIncentive,
    val charityDonationIncentive: CharityDonationIncentive
) : Parcelable