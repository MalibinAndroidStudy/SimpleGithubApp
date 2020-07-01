package com.song2.mygitapp.util

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.song2.mygitapp.ui.star.StarListAdapter
import com.song2.mygitapp.ui.star.StarRepo

@BindingAdapter("app:background_grade")
fun setGrade(view: View, grade: Int) {
    view.setBackgroundColor(Color.argb(((grade*100)),200, 200, 200))
}

@BindingAdapter("app:set_image")
fun setImageUrl(view: ImageView, profile: String) {
    Glide.with(view.context)
        .load(profile)
        .into(view)
}

@BindingAdapter("app:set_recycler_layoutmanager")
fun setData(view: RecyclerView, openDatas: List<StarRepo>?) {
    (view.adapter as StarListAdapter).run {
        submitList(openDatas)
    }
}