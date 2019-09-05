package com.futures.jetictors.androidanimlearn.ui.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Desc           :  viewPager的adapter
 * Author         :  Jetictors
 * Time           :  2019/9/5 15:22
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class CommonAdapter(fm : FragmentManager, val fragmentList : List<Fragment>, val tabName : Array<String>)
    : FragmentStatePagerAdapter(fm){

    override fun getItem(pos: Int): Fragment {
        return fragmentList[pos]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabName[position]
    }

}
