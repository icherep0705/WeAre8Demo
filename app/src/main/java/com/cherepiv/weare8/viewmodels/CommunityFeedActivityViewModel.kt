package com.cherepiv.weare8.viewmodels

import androidx.lifecycle.ViewModel
import com.cherepiv.weare8.datasource.Data
import com.cherepiv.weare8.datasource.Repository
import com.cherepiv.weare8.model.CommunityFeed

class CommunityFeedActivityViewModel : ViewModel() {

    val communityFeeds: Array<CommunityFeed>? = Repository.getData(Data.communityTiles, Array<CommunityFeed>::class.java)
}
