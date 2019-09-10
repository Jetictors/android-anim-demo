package com.futures.jetictors.androidanimlearn.ui.property.value

import android.animation.Animator
import android.animation.PropertyValuesHolder
import android.animation.ValueAnimator
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment
import kotlinx.android.synthetic.main.frag_anim.*

/**
 * Description    :  ofPropertyValuesHolder实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ValueHolderFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {

        val holder1 = PropertyValuesHolder.ofFloat("alpha", 0.1f, 0.9f)
        val holder2 = PropertyValuesHolder.ofFloat("scale", 0.1f, 0.9f)
        val holder3 = PropertyValuesHolder.ofInt("move", 0, 400)

        return ValueAnimator.ofPropertyValuesHolder(holder1, holder2, holder3).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
            addUpdateListener {
                val mAlpha = it.getAnimatedValue("alpha") as Float
                val mScale = it.getAnimatedValue("scale") as Float
                val mMove = it.getAnimatedValue("move") as Int
                this@ValueHolderFragment.iv_anim.apply {

                    // 设置缩放
                    scaleX = mScale
                    scaleY = 1 - mScale

                    // 设置透明度
                    alpha = mAlpha

                    // 重新layout
                    layout(mMove, mMove, mMove + this.width, mMove + this.height)
                }
            }
        }
    }

}