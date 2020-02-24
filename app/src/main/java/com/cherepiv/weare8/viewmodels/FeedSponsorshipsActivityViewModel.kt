package com.cherepiv.weare8.viewmodels

import androidx.lifecycle.ViewModel
import com.cherepiv.weare8.datasource.Data
import com.cherepiv.weare8.datasource.Repository
import com.cherepiv.weare8.model.FeedSponsorships

class FeedSponsorshipsActivityViewModel : ViewModel() {

    val feedSponsorships = Repository.getData(Data.feedSponsorships, Array<FeedSponsorships>::class.java)
}