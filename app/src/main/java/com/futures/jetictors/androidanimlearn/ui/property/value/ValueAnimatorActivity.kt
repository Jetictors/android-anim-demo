package com.futures.jetictors.androidanimlearn.ui.property.value

import android.support.v4.app.Fragment
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseAnimActivity

/**
 * Desc           :  属性动画之（ValueAnimator）实例
 * Author         :  Jetictors
 * Time           :  2019/9/5 10:52
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ValueAnimatorActivity : BaseAnimActivity(){

    private val mTabName : Array<String> by lazy {
        arrayOf("ofInt",  "ofFloat", "ofArgb", "ofObject", "ofPropertyValuesHolder")
    }

    private val mFragment : List<Fragment> by lazy {
        listOf(
                ValueOfIntFragment(), ValueOfFloatFragment(),
                ValueOfArgbFragment(), ValueOfObjectFragment(),
                ValueHolderFragment()
        )
    }

    override fun initViewAndData() {
        super.initViewAndData()
        setToolBar(true, getString(R.string.tx_value_anim))
    }

    override fun getFragmentList(): List<Fragment> {
        return mFragment
    }

    override fun getTabName(): Array<String> {
        return mTabName
    }

}
