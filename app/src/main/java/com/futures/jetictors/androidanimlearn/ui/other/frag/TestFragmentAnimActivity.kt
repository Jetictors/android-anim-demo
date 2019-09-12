package com.futures.jetictors.androidanimlearn.ui.other.frag

import android.support.v4.app.Fragment
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.base.BaseActivity
import com.futures.jetictors.androidanimlearn.base.BaseFragment
import kotlinx.android.synthetic.main.act_fragment_anim.*
import kotlinx.android.synthetic.main.layout_bottom.*

/**
 * Desc           :  测试fragment转场动画
 * Author         :  Jetictors
 * Time           :  2019/9/6 12:02
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class TestFragmentAnimActivity : BaseActivity(){

    private lateinit var mFirstFragment : BaseFragment
    private lateinit var mSecondFragment : BaseFragment

    override fun getResLayout(): Int {
        return R.layout.act_fragment_anim
    }

    override fun initViewAndData() {
        setToolBar(true, getString(R.string.tx_fragment_anim))
        initView()
        initListener()
    }

    private fun initView(){

        this.btn_start.text = "First"
        this.btn_stop.text = "Second"

        mFirstFragment = TestAnimFirstFragment()
        mSecondFragment = TestAnimSecondFragment()

        supportFragmentManager
                .beginTransaction()
                .add(R.id.fl_container, mFirstFragment)
                .commit()

    }

    private fun initListener(){

        this.btn_start.setOnClickListener { changeFragment(mFirstFragment) }

        this.btn_stop.setOnClickListener { changeFragment(mSecondFragment)  }
    }

    private fun changeFragment(fragment : Fragment){
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.frag_fade_in, R.anim.frag_fade_out)
                .replace(R.id.fl_container, fragment)
                .commit()
    }

}
