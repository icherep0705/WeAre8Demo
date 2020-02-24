package com.cherepiv.weare8.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cherepiv.weare8.R
import com.cherepiv.weare8.model.CommunityFeed

class CommunityFeedAdapter(communityFeeds: Array<CommunityFeed>): RecyclerView.Adapter<CommunityFeedAdapter.CommunityTilesViewHolder>() {

    private val communityTiles = communityFeeds

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CommunityTilesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.community_feed_view_item, parent, false))


    override fun onBindViewHolder(holder: CommunityTilesViewHolder, position: Int) {
        communityTiles[position].let { holder.bindView(it) }
        holder.itemView.setOnClickListener {
            //TODO handle click
        }
    }

    override fun getItemCount() = communityTiles.size

    class CommunityTilesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val container: ImageView? = itemView.findViewById(R.id.container)

        fun bindView(feed: CommunityFeed) {
            feed.mediaImageUri?.let {
                Glide.with(itemView.context).load(it).into(container!!)
            }
        }
    }
}