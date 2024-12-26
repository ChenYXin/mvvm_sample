package com.donkor.mvvm.sample.fragment.knowledge

import com.donkor.mvvm.sample.BR
import com.donkor.mvvm.sample.R
import com.donkor.mvvm.sample.databinding.FragmentKnowledgeBinding
import com.zoe.wan.base.BaseFragment

class FragKnowledge: BaseFragment<FragmentKnowledgeBinding, KnowledgeViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.fragment_knowledge

    }

    override fun getViewModelId(): Int {
        return BR.knowledgeVm
    }

    override fun initViewData() {
    }
}