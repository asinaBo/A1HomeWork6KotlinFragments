package com.example.a1homework6kotlinfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a1homework6kotlinfragments.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    private lateinit var adapter: SecondFragmentAdapter

    private var songsArrayList = ArrayList<Songs>()

    lateinit var imageId: Array<Int>
    lateinit var song: Array<String>
    lateinit var singer: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInit()
        adapter = SecondFragmentAdapter(songsArrayList, this::onItemClick)
        binding.rcView.adapter = adapter
    }

    private fun dataInit() {
        songsArrayList = arrayListOf<Songs>()

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,


            )

        song = arrayOf(
            getString(R.string.song1),
            getString(R.string.song2),
            getString(R.string.song3),
            getString(R.string.song4),
            getString(R.string.song5),
            getString(R.string.song6),
            getString(R.string.song7),
            getString(R.string.song8),
            getString(R.string.song9),
            getString(R.string.song10),
            getString(R.string.song11),
            getString(R.string.song12),
            getString(R.string.song13),
        )
        singer = arrayOf(
            getString(R.string.singer1),
            getString(R.string.singer2),
            getString(R.string.singer3),
            getString(R.string.singer4),
            getString(R.string.singer5),
            getString(R.string.singer6),
            getString(R.string.singer7),
            getString(R.string.singer8),
            getString(R.string.singer9),
            getString(R.string.singer10),
            getString(R.string.singer11),
            getString(R.string.singer12),
            getString(R.string.singer13),
        )
        for (i in imageId.indices) {
            val songs = Songs(imageId[i], song[i], singer[i])
            songsArrayList.add(songs)

        }
    }

    private fun onItemClick(song: Songs) {
        val bundle = Bundle()
        bundle.putSerializable("song", song)
        val fragment = DetailFragment()
        fragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(null)
            .commit()
    }




companion object {

    @JvmStatic
    fun newInstance() = SecondFragment()
}



}