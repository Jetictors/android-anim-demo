package com.futures.jetictors.androidanimlearn.ui.property.value

import android.animation.Animator
import android.animation.ValueAnimator
import android.graphics.Color
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment
import kotlinx.android.synthetic.main.frag_anim.*

/**
 * Description    :  ofArgb
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ValueOfArgbFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {
        val colors : IntArray = intArrayOf(Color.GREEN, Color.BLUE, Color.RED)

        return ValueAnimator.ofArgb(*colors).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
            addUpdateListener {
                this@ValueOfArgbFragment.iv_anim.setBackgroundColor(animatedValue as Int)
            }
        }
    }

}