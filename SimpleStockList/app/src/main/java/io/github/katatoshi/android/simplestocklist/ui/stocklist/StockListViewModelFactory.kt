package io.github.katatoshi.android.simplestocklist.ui.stocklist

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class StockListViewModelFactory(private val application: Application) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (!modelClass.isAssignableFrom(StockListViewModel::class.java)) {
            throw IllegalArgumentException("Unknown ViewModel class")
        }

        return StockListViewModel(application) as T
    }
}