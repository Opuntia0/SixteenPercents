package com.example.sixteenpercents

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var profileViewAdapter: ProfileViewAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewPager = findViewById(R.id.pager)

        val listProfile = arrayListOf<Profile>()
        listProfile.add(Profile("Ada"))
        listProfile.add(Profile("Grace"))
        listProfile.add(Profile("Margaret"))

        profileViewAdapter = ProfileViewAdapter(this, listProfile)
        viewPager.adapter = profileViewAdapter

    }

    // Hide the status bar
    private fun hideStatusBar()  {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }

}