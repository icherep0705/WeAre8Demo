package com.cherepiv.weare8.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cherepiv.weare8.R
import com.cherepiv.weare8.view.adapters.CommunityTilesAdapter
import com.cherepiv.weare8.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var viewModel : MainActivityViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        viewModel?.communityTiles?.let {
            initRecycler(CommunityTilesAdapter(it))
        }
    }

    private fun initRecycler(adapter: CommunityTilesAdapter){
        recyclerView = findViewById(R.id.container)
        recyclerView?.let {
            it.adapter = adapter
            it.layoutManager = LinearLayoutManager(this@MainActivity)
            it.setHasFixedSize(true)
        }
    }
}
