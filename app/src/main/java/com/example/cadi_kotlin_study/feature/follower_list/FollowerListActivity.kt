package com.example.cadi_kotlin_study.feature.follower_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.follower.DummyFollower
import com.example.cadi_kotlin_study.databinding.ActivityFollowerListBinding

class FollowerListActivity : AppCompatActivity() {

    private lateinit var rvFollowerList : RecyclerView
    private lateinit var followerAdapter : FollowerAdapter
    private var followerRepository = DummyFollower()
    private lateinit var binding: ActivityFollowerListBinding

    var id = "ddsfa"
    var name ="d"
    var desc = "d"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_follower_list)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_follower_list)
        //binding.activity = this

        makeProfile()

        rvFollowerList = findViewById(R.id.rv_follower_list)

        followerAdapter = FollowerAdapter(this)

        rvFollowerList.adapter = followerAdapter

        rvFollowerList.layoutManager = LinearLayoutManager(this)

        followerAdapter.data = followerRepository.getFollowerList()

        followerAdapter.notifyDataSetChanged()
    }

    private fun makeProfile(){
        val signIntent = getIntent()
        id = signIntent.getStringExtra("id")
        name ="명명명"
        desc = "바인딩해보자자자자자자"

        binding.invalidateAll()
    }
}
