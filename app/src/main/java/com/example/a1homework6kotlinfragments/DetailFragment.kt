package com.example.a1homework6kotlinfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a1homework6kotlinfragments.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result: Songs? = requireArguments().getSerializable("song") as Songs?

            if (result != null) {
                binding.tvDetail.text = result.songName
                binding.tvDetail2.text = result.singerName
                //binding.imgDetail.setImageResource(R.id.img_detail)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() = DetailFragment()

    }
}