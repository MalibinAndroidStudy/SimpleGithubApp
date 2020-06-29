package com.example.cadi_kotlin_study.feature.follower_list

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.follower.FollowerItem
import com.example.cadi_kotlin_study.databinding.RvItemFollowerBinding

class FollowerViewHolder(val binding: RvItemFollowerBinding) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(follower: FollowerItem) {
        binding.rvFollower = follower

        // 아이템 클릭 시, 해당 팔로워 레포리스트 화면으로 이동
//        itemView.setOnClickListener {
////            val context = it.context
////            val intent = Intent(context, RepoListActivity::class.java)
////
////            // 선택한 팔로워 이름을 전달
////            intent.putExtra("id", user.id)
////            intent.putExtra("name", user.name)
////
////            context.startActivity(intent)
//        }
    }
}