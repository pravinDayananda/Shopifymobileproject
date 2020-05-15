package com.example.pravin_ify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.pravin_ify.databinding.FragmentAgoBinding
import com.example.pravin_ify.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [AGOFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AGOFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentAgoBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_ago, container, false
        )
         return binding.root

    }


}