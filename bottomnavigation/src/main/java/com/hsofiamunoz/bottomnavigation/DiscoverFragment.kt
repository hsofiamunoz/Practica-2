package com.hsofiamunoz.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hsofiamunoz.bottomnavigation.databinding.FragmentDiscoverBinding


class DiscoverFragment : Fragment() {

    private lateinit var discoverBinding: FragmentDiscoverBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        discoverBinding = FragmentDiscoverBinding.inflate(inflater,container, false)
        return discoverBinding.root
    }

}