package com.cherepiv.weare8.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cherepiv.weare8.R
import com.cherepiv.weare8.view.adapters.SponsorshipFeedAdapter
import com.cherepiv.weare8.viewmodels.FeedSponsorshipsActivityViewModel

class FeedSponsorshipActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var viewModel : FeedSponsorshipsActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.community_activity)

        viewModel = ViewModelProviders.of(this).get(FeedSponsorshipsActivityViewModel::class.java)
        viewModel?.feedSponsorships?.let {
            initRecycler(SponsorshipFeedAdapter(it))
        }
    }

    private fun initRecycler(adapter: SponsorshipFeedAdapter){
        recyclerView = findViewById(R.id.container)
        recyclerView?.let {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(this@FeedSponsorshipActivity)
            it.setHasFixedSize(true)
        }
    }
}
