package com.example.pravin_ify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pravin_ify.databinding.FragmentAquaticBinding
import com.example.pravin_ify.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AquaticFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AquaticFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentAquaticBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_aquatic, container, false
        )
        return binding.root
    }


}
