package com.song2.mygitapp.ui.star

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.song2.mygitapp.data.GetMyStarListResponse
import com.song2.mygitapp.databinding.FragmentStarBinding
import com.song2.mygitapp.network.MyGitApplication.Companion.getMyGitApplication
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StarFragment : Fragment() {
    lateinit var binding: FragmentStarBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentStarBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        getStarResponse("seunghee63")
    }

    private fun setRecyclerView(){
        val adapter = StarListAdapter()
        adapter.submitList(listOf(StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan")))

        binding.run {
            rvStarList.layoutManager = LinearLayoutManager(activity)
            rvStarList.adapter = adapter
        }
    }

    private fun getStarResponse(id: String) {
        val getStarResponse =
            getMyGitApplication().service.getStarResponse(id)

        getStarResponse.enqueue(object : Callback<List<GetMyStarListResponse>> {

            override fun onFailure(call: Call<List<GetMyStarListResponse>>, t: Throwable) {
                Log.e("get StarList fail", t.toString())
            }

            override fun onResponse(
                call: Call<List<GetMyStarListResponse>>,
                listResponseMy: Response<List<GetMyStarListResponse>>
            ) {
                if (listResponseMy.isSuccessful) {
                    Log.v("get StarList Success", "성공 +${listResponseMy.body()!!}")

                } else {
                    Log.v("get StarList Success", "성공 - error")
                }
            }
        })
    }
}