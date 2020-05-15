package com.example.pravin_ify


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.pravin_ify.databinding.ExperienceFragmentBinding
import kotlinx.android.synthetic.main.activity_main.*

class ExperienceFragment : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View ?{
        val binding :ExperienceFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.experience_fragment, container, false)

        binding.campButton.setOnClickListener { view: View ->
            view.findNavController().navigate(ExperienceFragmentDirections.actionExperienceFragment2ToCampFragment())
        }

        binding.agoButton.setOnClickListener { view: View ->
            view.findNavController().navigate(ExperienceFragmentDirections.actionExperienceFragment2ToAGOFragment())
        }
        binding.aquaticButton.setOnClickListener { view: View ->
            view.findNavController().navigate(ExperienceFragmentDirections.actionExperienceFragment2ToAquaticFragment())
        }

        return binding.root
    }
}