package io.github.katatoshi.android.simplestocklist.ui.stocklist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import io.github.katatoshi.android.simplestocklist.R
import io.github.katatoshi.android.simplestocklist.databinding.FragmentStockListBinding

class StockListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentStockListBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_stock_list, container, false)

        val application = requireNotNull(activity).application
        val viewModelFactory = StockListViewModelFactory(application)
        val viewModel by viewModels<StockListViewModel> { viewModelFactory }
        binding.viewModel = viewModel

        binding.lifecycleOwner = this

        return binding.root
    }
}