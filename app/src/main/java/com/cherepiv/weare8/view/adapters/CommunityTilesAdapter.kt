package com.cherepiv.weare8.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cherepiv.weare8.R
import com.cherepiv.weare8.model.CommunityTile

class CommunityTilesAdapter(communityTiles: Array<CommunityTile>): RecyclerView.Adapter<CommunityTilesAdapter.CommunityTilesViewHolder>() {

    private val communityTiles = communityTiles

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CommunityTilesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.community_tilesview_item, parent, false))


    override fun onBindViewHolder(holder: CommunityTilesViewHolder, position: Int) {
        communityTiles[position].let { holder.bindView(it) }
        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount() = communityTiles.size

    class CommunityTilesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val container: ImageView? = itemView.findViewById(R.id.container)

        fun bindView(tile: CommunityTile) {
            tile.mediaImageUri?.let {
                Glide.with(itemView.context).load(it).into(container!!)
            }
        }
    }
}