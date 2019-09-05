package com.futures.jetictors.androidanimlearn.ui.canvas

import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity

/**
 * Desc           :  canvas动画
 * Author         :  Jetictors
 * Time           :  2019/9/5 11:42
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class CanvasActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.act_common
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_canvas))
    }

}
