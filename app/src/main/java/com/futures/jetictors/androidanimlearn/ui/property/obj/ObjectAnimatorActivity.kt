package com.futures.jetictors.androidanimlearn.ui.property.obj

import android.support.v4.app.Fragment
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseAnimActivity

/**
 * Desc           :  属性动画之（ObjectAnimator）实例
 * Author         :  Jetictors
 * Time           :  2019/9/5 10:52
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ObjectAnimatorActivity : BaseAnimActivity(){

    private val mTabName : Array<String> by lazy {
        arrayOf(
                getString(R.string.tx_translate), getString(R.string.tx_rotate),
                getString(R.string.tx_scale), getString(R.string.tx_alpha),
                getString(R.string.tx_set), getString(R.string.tx_test)
        )
    }

    private val mFragmentList : List<Fragment> by lazy {
        listOf(
                ObjectTranslateFragment(), ObjectRotateFragment(),
                ObjectScaleFragment(), ObjectAlphaFragment(),
                ObjectSetFragment(), ObjectTestFragment()
        )
    }

    override fun initViewAndData() {
        super.initViewAndData()
        setToolBar(true, getString(R.string.tx_object_anim))
    }

    override fun getFragmentList(): List<Fragment> {
        return mFragmentList
    }

    override fun getTabName(): Array<String> {
        return mTabName
    }

}
