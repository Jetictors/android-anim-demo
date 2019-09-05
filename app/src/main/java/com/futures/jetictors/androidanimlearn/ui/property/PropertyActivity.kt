package com.futures.jetictors.androidanimlearn.ui.property

import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import kotlinx.android.synthetic.main.act_property.*

/**
 * Desc           :  属性动画实例
 * Author         :  Jetictors
 * Time           :  2019/9/5 12:14
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class PropertyActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.act_property
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_property))

        this.btn_value.setOnClickListener {

        }

        this.btn_object.setOnClickListener {

        }
    }

}
