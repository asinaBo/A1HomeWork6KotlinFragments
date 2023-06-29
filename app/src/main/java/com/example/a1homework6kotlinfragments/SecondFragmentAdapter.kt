package com.example.a1homework6kotlinfragments

import android.view.LayoutInflater
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.a1homework6kotlinfragments.databinding.ItemSongListBinding

class SecondFragmentAdapter(private val songList: ArrayList<Songs>,
                            private val onItemClick: (Songs)->Unit
) : Adapter<SecondFragmentAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(ItemSongListBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(songList[position])

    }

    override fun getItemCount(): Int {
        return songList.size

    }


   inner class ViewHolder(private val binding:ItemSongListBinding) : RecyclerView.ViewHolder(binding.root) {

         fun bind(songs: Songs){
             binding.img1.setImageResource(songs.imageId)
             binding.tvSong.text= songs.songName
             binding.tvSinger.text = songs.singerName
             itemView.setOnClickListener {
                 itemView.setOnClickListener{
                     onItemClick(songs)

             }
         }


    }
   }




}