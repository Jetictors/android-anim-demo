package com.futures.jetictors.androidanimlearn.ui.property.obj

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment

/**
 * Description    :  渐变动画实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ObjectAlphaFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {
        return ObjectAnimator.ofFloat(img, "alpha", 0.1f, 0.9f).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
        }
    }

}