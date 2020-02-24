package com.jammus.databindingviewmodel.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jammus.databindingviewmodel.R
import com.jammus.databindingviewmodel.databinding.MainFragmentBinding

class MainFragment : Fragment() {



    private lateinit var binding: MainFragmentBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)


        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.num.observe(viewLifecycleOwner, Observer { newScore -> binding.textView.text = newScore.toString() })


        binding.button.setOnClickListener { viewModel.NumIncrement() }

        return binding.root
    }


}
