package com.futures.jetictors.androidanimlearn.ui.other

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import android.view.animation.LinearInterpolator
import android.widget.BaseAdapter
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import kotlinx.android.synthetic.main.act_layout_anim.*

/**
 * Desc           :  layoutAnim测试页
 * Author         :  Jetictors
 * Time           :  2019/9/6 14:12
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class LayoutAnimActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.act_layout_anim
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_layout_anim))
        initView()
    }

    private fun initView(){

        // 代码形式， xml
        this.ll_layout.layoutAnimation = AnimationUtils.loadLayoutAnimation(this, R.anim.test_layout)

        // 代码形式
        //this.lv_layout_anim.layoutAnimation = AnimationUtils.loadLayoutAnimation(this, R.anim.test_layout)
        val anim = AnimationUtils.loadAnimation(this, R.anim.anim_layout)
        val controller = LayoutAnimationController(anim).apply {
            delay = 0.5f
            order = LayoutAnimationController.ORDER_NORMAL
            interpolator = LinearInterpolator()
        }
        this.lv_layout_anim.layoutAnimation = controller
        this.lv_layout_anim.adapter = object : BaseAdapter(){

            override fun getView(pos: Int, containerView: View?, parent : ViewGroup?): View {
                return containerView ?: LayoutInflater
                        .from(this@LayoutAnimActivity)
                        .inflate(R.layout.item_layout_anim, parent, false)
            }

            override fun getItem(pos: Int): Any? {
                return null
            }

            override fun getItemId(pos: Int): Long {
                return 0L
            }

            override fun getCount(): Int {
                return 10
            }
        }


    }
}
