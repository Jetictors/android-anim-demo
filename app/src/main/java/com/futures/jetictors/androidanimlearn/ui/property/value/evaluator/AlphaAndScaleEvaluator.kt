package com.futures.jetictors.androidanimlearn.ui.property.value.evaluator

import android.animation.TypeEvaluator
import com.futures.jetictors.androidanimlearn.entity.AlphaAndScale

/**
 * Desc           :  自定义估值器，实现同时缩放和渐变
 * Author         :  Jetictors
 * Time           :  2019/9/10 14:56
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class AlphaAndScaleEvaluator : TypeEvaluator<AlphaAndScale>{

    /**
     * [fraction]   动画运行进度
     * [startValue] 起始对象
     * [endValue]   结束对象
     */
    override fun evaluate(fraction: Float, startValue: AlphaAndScale, endValue: AlphaAndScale): AlphaAndScale {

        val startAlpha = startValue.alpha
        val startScale  = startValue.scale

        val curAlpha = startAlpha + fraction * (endValue.alpha - startAlpha)
        val curScale = startScale + fraction * (endValue.scale - startScale)

        return AlphaAndScale(curAlpha, curScale)
    }

}
