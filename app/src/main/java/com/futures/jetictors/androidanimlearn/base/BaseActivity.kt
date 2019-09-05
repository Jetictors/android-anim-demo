package com.futures.jetictors.androidanimlearn.base

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import com.futures.jetictors.androidanimlearn.R

/**
 * Desc           :  基类activity
 * Author         :  Jetictors
 * Time           :  2019/9/4 17:31
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
abstract class BaseActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getResLayout())
        initViewAndData()
    }

    /**
     * 添加布局文件
     */
    abstract fun getResLayout() : Int

    /**
     * 初始化
     */
    abstract fun initViewAndData()

    protected fun setToolBar(isShowBack : Boolean = true, title : String){
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        toolbar.title = title
        if (isShowBack){
            toolbar.navigationIcon = ContextCompat.getDrawable(this, R.drawable.ic_back)
        }

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }

}
