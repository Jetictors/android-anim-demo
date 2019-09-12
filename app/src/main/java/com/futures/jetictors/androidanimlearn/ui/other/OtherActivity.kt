package com.futures.jetictors.androidanimlearn.ui.other

import android.content.Intent
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import com.futures.jetictors.androidanimlearn.ui.other.act.TestActivity
import com.futures.jetictors.androidanimlearn.ui.other.frag.TestFragmentAnimActivity
import com.futures.jetictors.androidanimlearn.ui.other.ly.LayoutAnimActivity
import com.futures.jetictors.androidanimlearn.ui.other.motion.MotionActivity
import kotlinx.android.synthetic.main.act_other.*

/**
 * Desc           :  其他动画
 * Author         :  Jetictors
 * Time           :  2019/9/5 12:13
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class OtherActivity : BaseActivity(){

    override fun getResLayout(): Int {
        return R.layout.act_other
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_other))

        initListener()
    }

    private fun initListener(){

        this.btn_layout_anim.setOnClickListener {
            startActivity(Intent(this, LayoutAnimActivity::class.java))
        }

        this.btn_motion_anim.setOnClickListener {
            startActivity(Intent(this, MotionActivity::class.java))
        }

        this.btn_activity_anim.setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java))
            overridePendingTransition(R.anim.act_fade_in, R.anim.act_fade_out)
        }

        this.btn_fragment_anim.setOnClickListener {
            startActivity(Intent(this, TestFragmentAnimActivity::class.java))
        }

    }
}
