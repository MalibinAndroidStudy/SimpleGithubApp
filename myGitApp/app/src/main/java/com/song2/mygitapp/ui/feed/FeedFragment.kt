package com.song2.mygitapp.ui.feed

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.song2.mygitapp.data.GetMyFeedListResponse
import com.song2.mygitapp.databinding.FragmentFeedBinding
import com.song2.mygitapp.network.MyGitApplication.Companion.getMyGitApplication
import com.song2.mygitapp.ui.star.StarListAdapter
import com.song2.mygitapp.ui.star.StarRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FeedFragment : Fragment() {
    lateinit var binding: FragmentFeedBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFeedBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        getFeedResponse("seunghee63")
    }

    private fun setRecyclerView(){
        val adapter = StarListAdapter()
        adapter.submitList(listOf(StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),
            StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),
            StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),
            StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan")
        ))

        binding.apply {
            rvFeedList.layoutManager = LinearLayoutManager(activity)
            rvFeedList.adapter = adapter
        }
    }

    private fun getFeedResponse(id : String?) {
        val getFeedResponse = getMyGitApplication().service.getFeedResponse(id)

        getFeedResponse.enqueue(object : Callback<List<GetMyFeedListResponse>> {

            override fun onFailure(call: Call<List<GetMyFeedListResponse>>, t: Throwable) {
                Log.e("get feed fail", t.toString())
            }

            override fun onResponse(
                call: Call<List<GetMyFeedListResponse>>,
                listResponseMy: Response<List<GetMyFeedListResponse>>
            ) {
                if (listResponseMy.isSuccessful) {
                    Log.v("get feed Success", "성공 +${listResponseMy.body()!!}")

                } else {
                    Log.v("get feed Success", "성공 - error")
                }
            }
        })
    }

}