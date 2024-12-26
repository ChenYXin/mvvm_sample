package com.donkor.mvvm.sample.fragment.home

import androidx.recyclerview.widget.LinearLayoutManager
import com.donkor.mvvm.sample.BR
import com.donkor.mvvm.sample.R
import com.donkor.mvvm.sample.common.adapter.HomeListAdapter
import com.donkor.mvvm.sample.databinding.FragmentHomeBinding
import com.zoe.wan.base.BaseFragment

class FragHome : BaseFragment<FragmentHomeBinding, FragHomeViewModel>() {
    private val adapter = HomeListAdapter()
    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }

    override fun getViewModelId(): Int {
        return BR.homeVm
    }

    override fun initViewData() {
        binding?.rvHomeList?.layoutManager = LinearLayoutManager(context)
        binding?.rvHomeList?.adapter = adapter

        viewModel?.list?.observe(viewLifecycleOwner) { list ->
            adapter.setData(list)
        }
    }

}