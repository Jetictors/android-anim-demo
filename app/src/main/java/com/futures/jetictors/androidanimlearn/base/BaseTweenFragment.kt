package com.futures.jetictors.androidanimlearn.base

import android.util.Log
import android.view.animation.Animation
import com.futures.jetictors.androidanimlearn.R
import kotlinx.android.synthetic.main.frag_anim.*
import kotlinx.android.synthetic.main.layout_bottom.*

/**
 * Desc           :  anim基类fragment
 * Author         :  Jetictors
 * Time           :  2019/9/5 16:35
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
abstract class BaseTweenFragment : BaseFragment(){

    private val TAG = this::class.java.simpleName

    private var mAnimation : Animation? = null

    override fun getResLayout(): Int {
        return R.layout.frag_anim
    }

    override fun initViewAndData() {
        initView()
        initListener()
    }

    private fun initView(){
        this.iv_anim.setImageResource(R.mipmap.ic_launcher_round)
        mAnimation = getAnimation()
    }

    private fun initListener() {
        this.btn_start.setOnClickListener {
            mAnimation?.let { this.iv_anim.startAnimation(it) }
        }

        this.btn_stop.setOnClickListener { stop() }

        // 动画执行事件监听
        mAnimation?.setAnimationListener(object : Animation.AnimationListener {

            override fun onAnimationRepeat(anim: Animation?) {
                // 动画重复
                Log.e(TAG, "anim to repeat !")
            }

            override fun onAnimationEnd(anim: Animation?) {
                // 动画结束
                Log.e(TAG, "anim to end !")
            }

            override fun onAnimationStart(anim: Animation?) {
                // 动画开始
                Log.e(TAG, "anim to star !")
            }

        })
    }

    /**
     * 结束动画
     */
    private fun stop() {
        this.iv_anim.clearAnimation()

        /*
            用这个方式也可以取消动画
            mAnimation?.let { it.cancel() }
         */
    }

    override fun onDestroyView() {
        super.onDestroyView()
        stop()
    }

    abstract fun getAnimation() : Animation?
}
