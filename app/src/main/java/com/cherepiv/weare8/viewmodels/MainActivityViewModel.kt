package com.cherepiv.weare8.viewmodels

import androidx.lifecycle.ViewModel
import com.cherepiv.weare8.datasource.Data
import com.cherepiv.weare8.datasource.Repository
import com.cherepiv.weare8.model.CommunityTile

class MainActivityViewModel : ViewModel() {

    val communityTiles: Array<CommunityTile>? = Repository.getData(Data.communityTiles, Array<CommunityTile>::class.java)
}
