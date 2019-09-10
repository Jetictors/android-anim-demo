package com.futures.jetictors.androidanimlearn.ui.property.value

import android.animation.Animator
import android.animation.ValueAnimator
import android.widget.ImageView
import com.futures.jetictors.androidanimlearn.base.BasePropertyFragment
import com.futures.jetictors.androidanimlearn.entity.AlphaAndScale
import com.futures.jetictors.androidanimlearn.ui.property.value.evaluator.AlphaAndScaleEvaluator
import kotlinx.android.synthetic.main.frag_anim.*

/**
 * Description    :  ofObject实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class ValueOfObjectFragment : BasePropertyFragment(){

    override fun getAnimator(img : ImageView): Animator {

        val evaluator = AlphaAndScaleEvaluator()
        val entity1 = AlphaAndScale(0.1f, 0.1f)
        val entity2 = AlphaAndScale(0.9f, 0.9f)

        return ValueAnimator.ofObject(evaluator, entity1, entity2).apply {
            duration = 3000
            repeatMode = ValueAnimator.REVERSE
            repeatCount = -1
            addUpdateListener {
                val value = animatedValue as AlphaAndScale
                this@ValueOfObjectFragment.iv_anim.apply {
                    scaleX = value.scale
                    scaleY = 1 - value.scale

                    alpha = value.alpha
                }
            }
        }
    }

}