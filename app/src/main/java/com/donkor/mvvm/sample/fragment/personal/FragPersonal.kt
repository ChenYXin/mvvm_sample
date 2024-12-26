package com.donkor.mvvm.sample.fragment.personal

import com.donkor.mvvm.sample.BR
import com.donkor.mvvm.sample.R
import com.donkor.mvvm.sample.databinding.FragmentPersonalBinding
import com.zoe.wan.base.BaseFragment

class FragPersonal: BaseFragment<FragmentPersonalBinding, PersonalViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_personal

    }

    override fun getViewModelId(): Int {
        return BR.personalVm
    }

    override fun initViewData() {
    }
}