package com.donkor.mvvm.sample.fragment.home

import android.app.Application
import androidx.lifecycle.viewModelScope
import com.donkor.mvvm.sample.repository.Repository
import com.donkor.mvvm.sample.repository.data.HomeListItemData
import com.zoe.wan.base.BaseViewModel
import com.zoe.wan.base.SingleLiveEvent
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FragHomeViewModel(application: Application) : BaseViewModel(application) {

    val list = SingleLiveEvent<List<HomeListItemData>?>()

    init {
        getHomeList()
    }

    private fun getHomeList() {
        viewModelScope.launch {
            val data = Repository.getHomeList("0")
            if (data != null) {
                list.postValue(data.datas)
            }
        }
    }
}