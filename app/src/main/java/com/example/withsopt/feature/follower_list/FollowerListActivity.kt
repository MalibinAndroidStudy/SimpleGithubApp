package com.example.withsopt.feature.follower_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.withsopt.R
import com.example.withsopt.data.follower.DummyFollowerRepository
import com.example.withsopt.feature.user_profile.UserProfile
import kotlinx.android.synthetic.main.list_item_git_repo.*

class FollowerListActivity : AppCompatActivity() {
    private lateinit var rvFollowerList : RecyclerView
    private lateinit var followerAdapter : FollowerAdapter
    private var folloserRepository = DummyFollowerRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_follower_list)

        makeProfile()

        rvFollowerList = findViewById(R.id.rv_gitrepo_list)

        followerAdapter = FollowerAdapter(this)

        rvFollowerList.adapter = followerAdapter

        rvFollowerList.layoutManager = LinearLayoutManager(this)

        followerAdapter.data = folloserRepository.getFollowerList()

        followerAdapter.notifyDataSetChanged()
    }

    private fun makeProfile(){
        val fragment2 = UserProfile()
        fragment2.UserId = "Haeeul"
        fragment2.Username = "명명"
        fragment2.UserDescription = "팔로워리스트입니다."

        val transaction = supportFragmentManager.beginTransaction()

        transaction.add(R.id.userprofile_container,fragment2)

        transaction.commit()
    }
}
