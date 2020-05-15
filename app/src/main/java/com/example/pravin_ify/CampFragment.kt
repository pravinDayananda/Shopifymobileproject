package com.example.pravin_ify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pravin_ify.databinding.FragmentCampBinding
import com.example.pravin_ify.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [CampFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CampFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentCampBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_camp, container, false
        )
            return binding.root
    }


}
