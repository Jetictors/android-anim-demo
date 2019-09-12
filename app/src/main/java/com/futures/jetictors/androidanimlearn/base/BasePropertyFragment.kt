package com.futures.jetictors.androidanimlearn.base

import android.animation.Animator
import android.util.Log
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.R
import kotlinx.android.synthetic.main.frag_anim.*
import kotlinx.android.synthetic.main.layout_bottom.*

/**
 * Desc           :  属性动画基类fragment
 * Author         :  Jetictors
 * Time           :  2019/9/9 17:44
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
abstract class BasePropertyFragment : BaseFragment(){

    private val TAG = this::class.java.simpleName

    private var mAnimator : Animator? = null

    override fun getResLayout(): Int {
        return R.layout.frag_anim
    }

    override fun initViewAndData() {
        initView()
        initListener()
    }

    private fun initView(){
        this.iv_anim.setImageResource(R.mipmap.ic_launcher_round)
        mAnimator = getAnimator(this.iv_anim)
    }

    private fun initListener(){
        this.btn_start.setOnClickListener {
            mAnimator?.start()
        }

        this.btn_stop.setOnClickListener { stop() }

        this.mAnimator?.addListener(object : Animator.AnimatorListener{

            override fun onAnimationRepeat(animator: Animator?) {
                Log.e(TAG, "animator to repeat")
            }

            override fun onAnimationEnd(animator: Animator?) {
                Log.e(TAG, "animator to end")
            }

            override fun onAnimationCancel(animator: Animator?) {
                Log.e(TAG, "animator to cancel")
            }

            override fun onAnimationStart(animator: Animator?) {
                Log.e(TAG, "animator to start")
            }
        })

    }

    private fun stop(){
        mAnimator?.cancel()
    }

    abstract fun getAnimator(img : ImageView) : Animator

    override fun onDestroyView() {
        super.onDestroyView()
        stop()
    }
}
