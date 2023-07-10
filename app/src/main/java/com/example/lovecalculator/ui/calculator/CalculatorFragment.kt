package com.example.lovecalculator.ui.calculator

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lovecalculator.R
import com.example.lovecalculator.databinding.FragmentCalculatorBinding
import com.example.lovecalculator.ui.onbord.adapter.BordAdapter
import com.example.lovecalculator.viewmodel.LoveViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CalculatorFragment : Fragment(R.layout.fragment_calculator) {

    private val binding by viewBinding(FragmentCalculatorBinding::bind)
    private val viewModel: LoveViewModel by viewModels()
//    @Inject
//    private lateinit var pref: SharedPreferences
//    lateinit var adapter: BordAdapter
 //   private val adapter:BordAdapter by lazy { BordAdapter(onClick()) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickers()
    }

    private fun initClickers() {
        binding.btnResult.setOnClickListener {
            viewModel.getLiveLoveModel(
                binding.etFerst.text.toString(),
                binding.etSecond.text.toString()
            ).observe(requireActivity(), Observer {
                findNavController().navigate(R.id.resultFragment, bundleOf(PERCENTAGE to it))
                binding.etFerst.text.clear()
                binding.etSecond.text.clear()
            })
        }
    }


    companion object {
        const val PERCENTAGE = "love"
        const val RESULT = "oooo"
    }
}