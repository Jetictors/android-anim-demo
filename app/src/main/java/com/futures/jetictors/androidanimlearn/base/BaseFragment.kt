package com.futures.jetictors.androidanimlearn.base

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Desc           :  Fragment基类
 * Author         :  Jetictors
 * Time           :  2019/9/5 15:31
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
abstract class BaseFragment : Fragment(){

    protected var mContext : Context? = null

    override fun onAttach(context: Context?) {
        mContext = context
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getResLayout(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewAndData()
    }

    abstract fun getResLayout() : Int

    abstract fun initViewAndData()
}
