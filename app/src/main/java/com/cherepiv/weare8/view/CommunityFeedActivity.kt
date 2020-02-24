package com.cherepiv.weare8.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cherepiv.weare8.R
import com.cherepiv.weare8.view.adapters.CommunityFeedAdapter
import com.cherepiv.weare8.viewmodels.CommunityFeedActivityViewModel

class CommunityFeedActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var viewModel : CommunityFeedActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.community_activity)

        viewModel = ViewModelProviders.of(this).get(CommunityFeedActivityViewModel::class.java)
        viewModel?.communityFeeds?.let {
            initRecycler(CommunityFeedAdapter(it))
        }
    }

    private fun initRecycler(adapter: CommunityFeedAdapter){
        recyclerView = findViewById(R.id.container)
        recyclerView?.let {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(this@CommunityFeedActivity)
            it.setHasFixedSize(true)
        }
    }
}
