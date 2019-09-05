package com.futures.jetictors.androidanimlearn.ui.frame

import android.graphics.drawable.AnimationDrawable
import android.support.v4.content.ContextCompat
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import kotlinx.android.synthetic.main.frag_anim.*

/**
 * Description    :  帧动画实例
 * Author         :  Jetictors
 * Time           :  2018/6/22 17:59
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class FrameAnimActivity : BaseActivity(){

    private lateinit var mAnimationDrawable: AnimationDrawable

    override fun getResLayout(): Int {
        return R.layout.activity_frame_anim
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_frame))
        typeByXmlFirst()
//        typeByXmlSecond()
//        typeByCode()
        initListener()
    }

    private fun initListener() {

        // 开始动画
        this.btn_start.setOnClickListener{ start() }

        // 结束动画
        this.btn_stop.setOnClickListener { stop() }

    }

    /**
     * XML方式一
     */
    private fun typeByXmlFirst(){
        mAnimationDrawable = ContextCompat.getDrawable(this,R.drawable.iv_frame_anim) as AnimationDrawable
        this.iv_anim.background = mAnimationDrawable
    }

    /**
     * XML方式二
     */
    private fun typeByXmlSecond(){
        this.iv_anim.setBackgroundResource(R.drawable.iv_frame_anim)
        mAnimationDrawable = this.iv_anim.background as AnimationDrawable
    }

    /**
     * 代码方式
     */
    private fun typeByCode(){
        mAnimationDrawable = AnimationDrawable()
        mAnimationDrawable.addFrame(ContextCompat.getDrawable(this,android.R.drawable.ic_dialog_email),300)
        mAnimationDrawable.addFrame(ContextCompat.getDrawable(this,android.R.drawable.ic_dialog_alert),300)
        mAnimationDrawable.addFrame(ContextCompat.getDrawable(this,android.R.drawable.ic_dialog_dialer),300)
        mAnimationDrawable.addFrame(ContextCompat.getDrawable(this,android.R.drawable.ic_dialog_info),300)
        mAnimationDrawable.addFrame(ContextCompat.getDrawable(this,android.R.drawable.ic_dialog_map),300)
        mAnimationDrawable.isOneShot = false

        this.iv_anim.background = mAnimationDrawable
    }

    /**
     * 开始动画
     */
    private fun start() {
        if (!mAnimationDrawable.isRunning) {
            mAnimationDrawable.start()
        }
    }

    /**
     * 结束动画
     */
    private fun stop() {
        if (mAnimationDrawable.isRunning) {
            mAnimationDrawable.stop()
        }
    }

    override fun onBackPressed() {
        stop()
        super.onBackPressed()
    }

}
