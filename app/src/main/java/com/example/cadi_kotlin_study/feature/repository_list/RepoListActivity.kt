package com.example.cadi_kotlin_study.feature.repository_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.repository.DummyRepo
import com.example.cadi_kotlin_study.databinding.ActivityRepoListBinding

class RepoListActivity : AppCompatActivity() {

    private lateinit var rvGitRepo : RecyclerView
    private lateinit var gitRepoAdapter : GitRepoAdapter
    private var gitRepoRepository = DummyRepo()
    private lateinit var binding: ActivityRepoListBinding

    var id = "ii"
    var name = "nn"
    var desc = "dd"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_repo_list)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_repo_list)

        makeProfile()

        rvGitRepo = findViewById(R.id.rv_repo_list)

        gitRepoAdapter = GitRepoAdapter(this)

        rvGitRepo.adapter = gitRepoAdapter

        rvGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = gitRepoRepository.getRepoList()

        gitRepoAdapter.notifyDataSetChanged()
    }

    private fun makeProfile(){
        val intent = getIntent()
        id = intent.getStringExtra("id")
        name = intent.getStringExtra("name")
        desc = "바인딩해보자자자자자자"

        binding.invalidateAll()
    }
}
