package com.futures.jetictors.androidanimlearn.ui.property.obj

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment

/**
 * Description    :  缩放动画实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ObjectSetFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {

        val holder1 = PropertyValuesHolder.ofFloat("scaleX", 0.1f, 0.9f)
        val holder2 = PropertyValuesHolder.ofFloat("scaleY", 0.1f, 0.9f)

        return ObjectAnimator.ofPropertyValuesHolder(img, holder1, holder2).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
        }
    }

}