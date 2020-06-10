package com.example.cadi_kotlin_study.feature.repository_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.cadi_kotlin_study.R
import com.example.cadi_kotlin_study.data.repository.DummyRepo
import kotlinx.android.synthetic.main.fragment_repo.*

class RepoFragment : Fragment() {
    private lateinit var gitRepoAdapter : RepoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        gitRepoAdapter = RepoAdapter(context)

        rv_repo_list.adapter = gitRepoAdapter

        rv_repo_list.layoutManager = LinearLayoutManager(context)

        gitRepoAdapter.data = DummyRepo.getRepoList()

        gitRepoAdapter.notifyDataSetChanged()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_repo, container, false)
    }
}
