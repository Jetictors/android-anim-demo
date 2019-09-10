package com.futures.jetictors.androidanimlearn.ui.property.value

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment
import kotlinx.android.synthetic.main.frag_anim.*

/**
 * Description    :  ofInt实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ValueOfIntFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {

        return ValueAnimator.ofInt(0, 300).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
            addUpdateListener {
                val value = it.animatedValue as Int
                val width = iv_anim.width
                val height = iv_anim.height
                iv_anim.layout(value, value, value + width, value + height)
            }
        }
    }

}