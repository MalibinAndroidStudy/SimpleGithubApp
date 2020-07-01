package com.song2.mygitapp.ui.star

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.song2.mygitapp.databinding.ItemStartsBinding

class StarListAdapter : ListAdapter<StarRepo, StarListAdapter.ViewHolder>(
    DiffTool()
) {

    private class DiffTool : DiffUtil.ItemCallback<StarRepo>(){
        override fun areItemsTheSame(oldItem: StarRepo, newItem: StarRepo): Boolean {
            //아이디가 같은 경우
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: StarRepo, newItem: StarRepo): Boolean {
            //내용이 같은 경우
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemStartsBinding.inflate(layoutInflater)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = getItem(position)

        holder.bind(item)
    }

    inner class ViewHolder(private val binding: ItemStartsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(starRepo : StarRepo){
            binding.starRepo = starRepo
        }
    }
}

data class StarRepo(
    val id: String,
    val nickname: String,
    val repository : String,
    val description : String,
    val language : String,
    val starCnt : Int,
    val date : String
)