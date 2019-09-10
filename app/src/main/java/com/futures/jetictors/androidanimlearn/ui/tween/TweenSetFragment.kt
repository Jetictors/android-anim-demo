package com.futures.jetictors.androidanimlearn.ui.tween

import android.view.animation.*
import com.futures.jetictors.androidanimlearn.base.BaseTweenFragment

/**
 * Description    :  视图动画合集实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:56
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TweenSetFragment : BaseTweenFragment(){

    override fun getAnimation(): Animation? {

        // xml形式
        // return AnimationUtils.loadAnimation(mContext, R.anim.anim_tween_set)

        // 代码形式
        val translateAnim = TranslateAnimation(0f, 0f, 100f ,100f)
        val alphaAnim = AlphaAnimation(1f, 0.2f)
        val scaleAnim = ScaleAnimation(1f, 0.1f, 1f, 0.1f)
        val rotateAnim = RotateAnimation(0f, 360f)

        return AnimationSet(false).apply {
            this.duration = 5000
            this.repeatCount = -1
            this.repeatMode = AnimationSet.REVERSE
            this.addAnimation(scaleAnim)
            this.addAnimation(rotateAnim)
            this.addAnimation(translateAnim)
            this.addAnimation(alphaAnim)
        }

    }

}