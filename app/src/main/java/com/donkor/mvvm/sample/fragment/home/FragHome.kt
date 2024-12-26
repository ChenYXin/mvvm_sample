package com.donkor.mvvm.sample.fragment.home

import com.donkor.mvvm.sample.BR
import com.donkor.mvvm.sample.R
import com.donkor.mvvm.sample.databinding.FragmentHomeBinding
import com.zoe.wan.base.BaseFragment

class FragHome : BaseFragment<FragmentHomeBinding,FragHomeViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun getViewModelId(): Int {
        return BR.homeVm
    }

    override fun initViewData() {
    }

}