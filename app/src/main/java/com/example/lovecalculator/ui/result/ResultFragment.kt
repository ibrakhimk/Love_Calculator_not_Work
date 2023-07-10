package com.example.lovecalculator.ui.result

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lovecalculator.R
import com.example.lovecalculator.databinding.FragmentResultBinding
import com.example.lovecalculator.data.remote.LoveModel
import com.example.lovecalculator.ui.calculator.CalculatorFragment.Companion.PERCENTAGE
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)
    private var loveModel: LoveModel? = null




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loveModel = arguments?.getSerializable(PERCENTAGE) as LoveModel?
        loveModel?.let {
            binding.tvPercent.text = it.percentage
            binding.tvMe.text = it.firstName
            binding.tvYou.text = it.secondName
            binding.tvDesc.text = it.result
        }
        binding.btnTry.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}
