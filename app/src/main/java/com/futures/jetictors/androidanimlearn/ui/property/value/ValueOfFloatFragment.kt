package com.futures.jetictors.androidanimlearn.ui.property.value

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment
import kotlinx.android.synthetic.main.frag_anim.*

/**
 * Description    :  ofFloat实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ValueOfFloatFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {
        return ValueAnimator.ofFloat(0.1f, 0.9f).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
            addUpdateListener {
                this@ValueOfFloatFragment.iv_anim.apply {
                    val scale = animatedValue as Float
                    scaleX = scale
                    scaleY = 1 - scale
                }
            }
        }
    }

}