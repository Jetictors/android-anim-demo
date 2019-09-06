package com.futures.jetictors.androidanimlearn.ui.tween

import android.view.animation.AlphaAnimation
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseFragment
import kotlinx.android.synthetic.main.frag_tween_test.*

/**
 * Description    :  视图动画实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:56
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TweenTestFragment : BaseFragment(){

    private lateinit var mTranslateAnimation1 : TranslateAnimation
    private lateinit var mTranslateAnimation2 : TranslateAnimation
    private lateinit var mAlphaAnimation : AlphaAnimation

    override fun getResLayout(): Int {
        return R.layout.frag_tween_test
    }

    override fun initViewAndData() {

        mTranslateAnimation1 = AnimationUtils.loadAnimation(mContext, R.anim.anim_tween_test_1) as TranslateAnimation
        mTranslateAnimation2 = AnimationUtils.loadAnimation(mContext, R.anim.anim_tween_test_2) as TranslateAnimation
        mAlphaAnimation = AnimationUtils.loadAnimation(mContext, R.anim.anim_tween_test_3) as AlphaAnimation

        initListener()
    }

    private fun initListener(){

        this.btn_start.setOnClickListener{
            this.iv_test_top.startAnimation(mTranslateAnimation1)
            this.iv_test_bottom.startAnimation(mTranslateAnimation2)
            this.iv_test_center.startAnimation(mAlphaAnimation)
        }

        this.btn_stop.setOnClickListener { stop() }
    }

    private fun stop(){
        this.iv_test_top.clearAnimation()
        this.iv_test_bottom.clearAnimation()
        this.iv_test_center.clearAnimation()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        stop()
    }

}
