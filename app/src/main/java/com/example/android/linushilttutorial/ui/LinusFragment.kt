package com.example.android.linushilttutorial.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.android.linushilttutorial.R
import com.example.android.linushilttutorial.databinding.FragmentLinusBinding
import com.example.android.linushilttutorial.navigate.AppNavigator
import com.example.android.linushilttutorial.navigate.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LinusFragment : Fragment() {
    private val viewModel by viewModels<LinusMuemaViewModel>()
    @Inject lateinit var navigator: AppNavigator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLinusBinding>(
            inflater,
            R.layout.fragment_linus,
            container,
            false
        )
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val navigateToMuema = binding.linusButton
        navigateToMuema.setOnClickListener {
            navigator.navigateTo(Screens.MuemaFragment)
        }
        return binding.root
    }
}