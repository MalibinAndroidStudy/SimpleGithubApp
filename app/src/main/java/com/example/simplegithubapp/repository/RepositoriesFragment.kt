package com.example.simplegithubapp.repository

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.simplegithubapp.R
import com.example.simplegithubapp.databinding.FragmentRepositoriesBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_repositories.*
import kotlinx.android.synthetic.main.rv_item_organizations.*

class RepositoriesFragment : Fragment() {
    private lateinit var binding:FragmentRepositoriesBinding
    private lateinit var rvRepositoryListAdapter: RepositoryListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentRepositoriesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        repositoryInit()

    }
    fun repositoryInit(){
        rv_repository.layoutManager=LinearLayoutManager(context)
        rvRepositoryListAdapter = RepositoryListAdapter()
        rv_repository.adapter=rvRepositoryListAdapter
        val listData=listOf(
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointRed, "Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15),
            RvItemRepository("CadiStudy/SimpleGitHub","SimpleGitHub App 만들기",5,R.color.colorPointBlue,"Kotlin",15)
        )
        rvRepositoryListAdapter.submitList(listData)





    }

}