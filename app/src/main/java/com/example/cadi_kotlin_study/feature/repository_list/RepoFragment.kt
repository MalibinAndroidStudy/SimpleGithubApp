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
    private lateinit var gitRepoAdapter : RepoListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        repoInit()
    }

    private fun repoInit(){
        gitRepoAdapter = RepoListAdapter()

        rv_repo_list.adapter = gitRepoAdapter

        rv_repo_list.layoutManager = LinearLayoutManager(context)

        gitRepoAdapter.submitList(DummyRepo.getRepoList())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_repo, container, false)
    }
}
