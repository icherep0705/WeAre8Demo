package com.cherepiv.weare8.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.cherepiv.weare8.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        findViewById<Button>(R.id.to_community_tiles).apply {
           setOnClickListener { startActivity(Intent(this@HomeActivity, CommunityFeedActivity::class.java)) }
        }

        findViewById<Button>(R.id.to_sponsorship_tiles).apply {
            setOnClickListener { startActivity(Intent(this@HomeActivity, FeedSponsorshipActivity::class.java)) }
        }
    }
}
