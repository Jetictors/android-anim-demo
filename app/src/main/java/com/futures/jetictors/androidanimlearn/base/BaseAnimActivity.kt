package com.futures.jetictors.androidanimlearn.base

import android.support.v4.app.Fragment
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.ui.adapter.CommonAdapter
import kotlinx.android.synthetic.main.act_common.*

/**
 * Desc           :  动画基类activity
 * Author         :  Jetictors
 * Time           :  2019/9/5 16:20
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
abstract class BaseAnimActivity : BaseActivity(){

    private lateinit var mAdapter : CommonAdapter

    private val mTabName : Array<String> by lazy { getTabName() }

    override fun getResLayout(): Int {
        return R.layout.act_common
    }

    override fun initViewAndData() {
        mAdapter = CommonAdapter(supportFragmentManager, getFragmentList(), mTabName)
        this.vp.adapter = mAdapter
        this.tab_layout.setupWithViewPager(this.vp)
    }

    abstract fun getFragmentList() : List<Fragment>

    abstract fun getTabName() : Array<String>
}
