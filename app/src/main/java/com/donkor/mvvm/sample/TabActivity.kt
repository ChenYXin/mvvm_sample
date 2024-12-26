package com.donkor.mvvm.sample

import android.graphics.BitmapFactory
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.donkor.mvvm.sample.databinding.ActivityTabBinding
import com.donkor.mvvm.sample.BR
import com.donkor.mvvm.sample.fragment.home.FragHome
import com.donkor.mvvm.sample.fragment.hotkey.FragHotKey
import com.donkor.mvvm.sample.fragment.knowledge.FragKnowledge
import com.donkor.mvvm.sample.fragment.personal.FragPersonal
import com.zoe.wan.base.BaseActivity
import com.zoe.wan.base.adapter.Pager2Adapter
import com.zoe.wan.base.tab.NavigationBottomBar

class TabActivity : BaseActivity<ActivityTabBinding, TabViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.activity_tab
    }

    override fun getViewModelId(): Int {
        return BR.tabVm
    }

    override fun initViewData() {
        initPages()

        val icons = arrayOf(
            BitmapFactory.decodeResource(resources, R.drawable.icon_home_selected),
            BitmapFactory.decodeResource(resources, R.drawable.icon_hot_key_selected),
            BitmapFactory.decodeResource(resources, R.drawable.icon_knowledge_selected),
            BitmapFactory.decodeResource(resources, R.drawable.icon_personal_selected)
        )
        val iconsGreys = arrayOf(
            BitmapFactory.decodeResource(resources, R.drawable.icon_home_grey),
            BitmapFactory.decodeResource(resources, R.drawable.icon_hot_key_grey),
            BitmapFactory.decodeResource(resources, R.drawable.icon_knowledge_grey),
            BitmapFactory.decodeResource(resources, R.drawable.icon_personal_grey)
        )

        val tabText = arrayOf("首页", "热点", "体系", "个人")

        binding?.tabBottomBar?.setSelectedIcons(icons.toList())
        binding?.tabBottomBar?.setUnselectIcons(iconsGreys.toList())
        binding?.tabBottomBar?.setTabText(tabText.toList())
        binding?.tabBottomBar?.setupViewpager(binding?.tabViewPager2)
        binding?.tabBottomBar?.start()

        binding?.tabBottomBar?.registerTabClickListener(object :
            NavigationBottomBar.OnBottomTabClickListener {
            override fun tabClick(position: Int) {
                Log.d("tab切换", "position : $position")
            }
        })
    }

    private fun initPages() {
        val tabPages = mutableListOf<Fragment>()
        tabPages.add(FragHome())
        tabPages.add(FragHotKey())
        tabPages.add(FragKnowledge())
        tabPages.add(FragPersonal())

        val pager2Adapter = Pager2Adapter(this)
        pager2Adapter.setData(tabPages)

        binding?.tabViewPager2?.offscreenPageLimit = ViewPager2.OFFSCREEN_PAGE_LIMIT_DEFAULT
        binding?.tabViewPager2?.adapter = pager2Adapter
    }
}