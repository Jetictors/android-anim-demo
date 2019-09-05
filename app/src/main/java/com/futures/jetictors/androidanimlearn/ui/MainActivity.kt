package com.futures.jetictors.androidanimlearn.ui

import android.content.Intent
import android.util.Log
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.ui.frame.FrameAnimActivity
import com.futures.jetictors.androidanimlearn.ui.tween.*
import com.futures.jetictors.androidanimlearn.ui.adapter.MainAdapter
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import com.futures.jetictors.androidanimlearn.entity.MainItem
import com.futures.jetictors.androidanimlearn.ui.canvas.CanvasActivity
import com.futures.jetictors.androidanimlearn.ui.other.OtherActivity
import com.futures.jetictors.androidanimlearn.ui.property.PropertyActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Description    :  首页
 * Author         :  Jetictors
 * Time           :  2018/6/22 17:59
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class MainActivity : BaseActivity() {

    private val mData : List<MainItem> by lazy {
        listOf(
                MainItem(R.drawable.ic_frame, getString(R.string.tx_frame)),
                MainItem(R.drawable.ic_tween, getString(R.string.tx_tween)),
                MainItem(R.drawable.ic_property, getString(R.string.tx_property)),
                MainItem(R.drawable.ic_canvas, getString(R.string.tx_canvas)),
                MainItem(R.drawable.ic_all, getString(R.string.tx_other))
        )
    }

    private lateinit var mAdapter: MainAdapter

    override fun getResLayout(): Int {
        return R.layout.activity_main
    }

    override fun initViewAndData() {
        setToolBar(false, getString(R.string.tx_main_title))
        initData()
        initListener()
    }

    private fun initData() {
        mAdapter = MainAdapter(this, mData)
        this.main_grid.adapter = mAdapter
        mAdapter.notifyDataSetChanged()
    }

    private fun initListener() {
        this.main_grid.setOnItemClickListener { _, _, position, _ ->
            when(position){
                0 -> startActivity(Intent(this, FrameAnimActivity::class.java))
                1 -> startActivity(Intent(this, TweenActivity::class.java))
                2 -> startActivity(Intent(this, PropertyActivity::class.java))
                3 -> startActivity(Intent(this, CanvasActivity::class.java))
                4 -> startActivity(Intent(this, OtherActivity::class.java))
                else -> Log.e(this.javaClass.simpleName,"不存在的position")
            }
        }
    }
}
