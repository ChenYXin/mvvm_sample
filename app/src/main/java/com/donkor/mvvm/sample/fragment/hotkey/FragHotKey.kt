package com.donkor.mvvm.sample.fragment.hotkey

import com.donkor.mvvm.sample.R
import com.donkor.mvvm.sample.BR
import com.donkor.mvvm.sample.databinding.FragmentHotKeyBinding
import com.zoe.wan.base.BaseFragment

class FragHotKey:BaseFragment<FragmentHotKeyBinding,FragHotKeyViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_hot_key

    }

    override fun getViewModelId(): Int {
        return BR.hotKeyVm
    }

    override fun initViewData() {
    }
}