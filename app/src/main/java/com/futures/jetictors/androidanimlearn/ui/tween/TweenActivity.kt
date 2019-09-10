package com.futures.jetictors.androidanimlearn.ui.tween

import android.support.v4.app.Fragment
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseAnimActivity

/**
 * Desc           :  补间动画实例
 * Author         :  Jetictors
 * Time           :  2019/9/5 12:15
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TweenActivity : BaseAnimActivity(){

    private val mFragmentList : List<Fragment> by lazy {
        listOf(
            TweenTranslateFragment(), TweenRotateFragment(), TweenScaleFragment(),
                TweenAlphaFragment(), TweenSetFragment(), TweenTestFragment()
        )
    }

    override fun initViewAndData() {
        super.initViewAndData()
        setToolBar(true, getString(R.string.tx_tween))
    }

    override fun getFragmentList(): List<Fragment> {
        return mFragmentList
    }

    override fun getTabName(): Array<String> {
        return arrayOf(
                getString(R.string.tx_translate), getString(R.string.tx_rotate),
                getString(R.string.tx_scale), getString(R.string.tx_alpha),
                getString(R.string.tx_set), getString(R.string.tx_test)
        )
    }

}
