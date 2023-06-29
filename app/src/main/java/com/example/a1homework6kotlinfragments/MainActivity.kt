package com.example.a1homework6kotlinfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        openFragment(FirstFragment.newInstance(), R.id.place_holder)
        openFragment(SecondFragment.newInstance(), R.id.place_holder2)

    }

    private fun openFragment(f: Fragment, idHolder: Int) {

        supportFragmentManager
            .beginTransaction()
            .replace(idHolder, f)
            .commit()

    }

}