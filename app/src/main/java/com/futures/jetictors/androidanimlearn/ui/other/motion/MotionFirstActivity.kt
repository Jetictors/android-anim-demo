package com.futures.jetictors.androidanimlearn.ui.other.motion

import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity

/**
 * Desc           :  Motion学习一， 制作一个平移动画
 * Author         :  Jetictors
 * Time           :  2019/9/12 15:22
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class MotionFirstActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.act_motion_first
    }

    override fun initViewAndData() {
        setToolBar(true, "")
    }

}
