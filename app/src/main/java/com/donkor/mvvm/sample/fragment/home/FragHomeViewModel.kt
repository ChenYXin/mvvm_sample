package com.donkor.mvvm.sample.fragment.home

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.donkor.mvvm.sample.repository.Repository
import com.zoe.wan.base.BaseViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FragHomeViewModel(application: Application) : BaseViewModel(application) {
    fun getHomeList() {
        viewModelScope.launch {
            val data = Repository.getHomeList("0")

        }
    }
}