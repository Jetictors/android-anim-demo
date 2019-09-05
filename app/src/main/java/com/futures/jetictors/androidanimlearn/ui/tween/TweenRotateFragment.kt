package com.futures.jetictors.androidanimlearn.ui.tween

import android.view.animation.*

/**
 * Description    :  旋转动画实例
 * Author         :  Jetictors
 * Time           :  2018/7/4 17:06
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TweenRotateFragment : BaseTweenFragment(){

    override fun getAnimation(): Animation? {
        // xml方式
        // return AnimationUtils.loadAnimation(mContext, R.anim.anim_rotate) as RotateAnimation

        // 代码方式
        return RotateAnimation(30f,280f,
                RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f).apply {
            // 动画执行时间，以毫秒为单位，1秒 = 1000毫秒
            this.duration = 2000
            // 小于0 则重复播放
            this.repeatCount = RotateAnimation.INFINITE
            // 重复模式,反转(REVERSE) 和 重新开始(RESTART)
            this.repeatMode = RotateAnimation.REVERSE
            // 设置动画结束之后的状态是否是动画开始时的状态，true，表示是保持动画开始时的状态
            this.fillBefore = true
            // 设置动画结束之后的状态是否是动画的最终状态，true，表示是保持动画结束时的最终状态
            this.fillAfter = false
            // 动画执行延迟时间
            this.startOffset = 500
            // 插值器
            this.interpolator = LinearInterpolator()
        }
    }

}