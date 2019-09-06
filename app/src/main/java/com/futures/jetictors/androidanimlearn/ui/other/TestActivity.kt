package com.futures.jetictors.androidanimlearn.ui.other

import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import kotlinx.android.synthetic.main.act_naim_test.*

/**
 * Desc           :  测试activity转场动画
 * Author         :  Jetictors
 * Time           :  2019/9/6 12:01
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TestActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.act_naim_test
    }

    override fun initViewAndData() {
        this.btn_close_act.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.act_fade_in, R.anim.act_fade_out)
        }
    }
}
