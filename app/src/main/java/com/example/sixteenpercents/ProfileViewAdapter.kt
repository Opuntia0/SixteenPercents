package com.example.sixteenpercents

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ProfileViewAdapter(fragment: FragmentActivity, private val profiles: List<Profile>) : FragmentStateAdapter(fragment)
{
    override fun getItemCount(): Int = profiles.size

    override fun createFragment(position: Int): Fragment {
        return ProfileFragment(profiles[position])
    }
}