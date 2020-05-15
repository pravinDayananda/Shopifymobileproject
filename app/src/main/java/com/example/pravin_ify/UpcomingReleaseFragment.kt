package com.example.pravin_ify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pravin_ify.databinding.FragmentHomeBinding
import com.example.pravin_ify.databinding.FragmentUpcomingReleaseBinding


/**
 * A simple [Fragment] subclass.
 * Use the [UpcomingReleaseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class UpcomingReleaseFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentUpcomingReleaseBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_upcoming_release, container, false
        )
          return binding.root
    }



}
