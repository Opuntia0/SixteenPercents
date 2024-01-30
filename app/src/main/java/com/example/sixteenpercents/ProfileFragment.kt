package com.example.sixteenpercents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.DecelerateInterpolator
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class ProfileFragment(val profile: Profile) : Fragment() {

    lateinit var infoContainer: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.profile_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        infoContainer = view.findViewById<View>(R.id.info)

        // Name
        view.findViewById<TextView>(R.id.name).text = profile.name

        // Dates
        if (profile.deathYear == null)
            view.findViewById<TextView>(R.id.dates).text = profile.birthYear.toString()
        else
            view.findViewById<TextView>(R.id.dates).text = profile.birthYear.toString() + " - " + profile.deathYear

        // Description
        view.findViewById<TextView>(R.id.description).text = profile.description

        // Loading Image
        val options: RequestOptions = RequestOptions()
            .centerCrop()
            .placeholder(R.color.black)
            .error(R.color.black)

        val imageView = view.findViewById<ImageView>(R.id.picture)

        Glide.with(this).load(profile.urlPicture).apply(options)
            .into(imageView)
    }

    override fun onResume() {
        super.onResume()
        val fadeIn = AlphaAnimation(0f, 1f)
        fadeIn.interpolator = DecelerateInterpolator() //add this
        fadeIn.duration = 1000
        infoContainer.startAnimation(fadeIn)
        infoContainer.visibility = View.VISIBLE
    }

    override fun onPause() {
        super.onPause()
        infoContainer.visibility = View.INVISIBLE
    }

}