package com.hsofiamunoz.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hsofiamunoz.bottomnavigation.databinding.FragmentHomeStartBinding

class HomeStartFragment : Fragment() {

    private lateinit var homeStartBinding: FragmentHomeStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        homeStartBinding = FragmentHomeStartBinding.inflate(inflater, container, false)

        return homeStartBinding.root
    }

}