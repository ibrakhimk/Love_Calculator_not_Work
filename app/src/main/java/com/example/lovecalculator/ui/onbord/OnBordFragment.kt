package com.example.lovecalculator.ui.onbord

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lovecalculator.R
import com.example.lovecalculator.databinding.FragmentOnBordBinding
import com.example.lovecalculator.ui.onbord.adapter.BordAdapter

class OnBordFragment : Fragment(R.layout.fragment_on_bord) {

    private val binding by viewBinding(FragmentOnBordBinding::bind)
    private lateinit var adapter: BordAdapter
//    private val viewModel: BordViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = BordAdapter {
//            viewModel.saveUserSeen()
            findNavController().navigateUp() }
        binding.viewPager.adapter = adapter
    }

}