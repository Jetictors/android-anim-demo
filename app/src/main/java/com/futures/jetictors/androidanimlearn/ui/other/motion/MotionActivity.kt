package com.futures.jetictors.androidanimlearn.ui.other.motion

import android.content.Intent
import android.widget.ArrayAdapter
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import kotlinx.android.synthetic.main.act_motion.*

/**
 * Desc           :  MotionLayout布局动画实例
 * Author         :  Jetictors
 * Time           :  2019/9/12 16:18
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class MotionActivity : BaseActivity(){

    private val mData : Array<String> by lazy {
        arrayOf(
                "1111", "222", "333", "444", "555", "666"
        )
    }

    override fun getResLayout(): Int {
        return R.layout.act_motion
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_motion_anim))

        this.lv_motion.adapter = ArrayAdapter<String>(this, R.layout.item_layout_anim, R.id.tv_item, mData)

        this.lv_motion.setOnItemClickListener { _, _, pos, _ ->
            when(pos){
                0 -> setIntentClass(MotionFirstActivity::class.java)
                1 -> setIntentClass(MotionFirstActivity::class.java)
                2 -> setIntentClass(MotionFirstActivity::class.java)
                3 -> setIntentClass(MotionFirstActivity::class.java)
                4 -> setIntentClass(MotionFirstActivity::class.java)
                5 -> setIntentClass(MotionFirstActivity::class.java)
            }
        }
    }

    private fun setIntentClass(clazz: Class<*>){
        val intent = Intent(this, clazz)
        startActivity(intent)
    }
}
