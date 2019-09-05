package com.futures.jetictors.androidanimlearn.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.futures.jetictors.androidanimlearn.R
import com.futures.jetictors.androidanimlearn.entity.MainItem


/**
 * Description    :  主页列表适配器竖向显示的TextView
 * Author         :  Jetictors
 * Time           :  2018/6/27 15:23
 * Email          :  zhengxcfutures@gmail.com
 * Version        :  v-1.0.1
 */
class MainAdapter(private val ctx : Context, private val mData : List<MainItem>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent : ViewGroup?): View? {
        var itemView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            itemView = LayoutInflater.from(ctx).inflate(R.layout.item_main, null)
            holder = ViewHolder()
            holder.mTvType = itemView?.findViewById(R.id.tv_type) as TextView?
            holder.mIvType = itemView?.findViewById(R.id.iv_type) as ImageView?
            itemView.tag = holder
        } else {
            holder = itemView?.tag as ViewHolder
        }

        holder.mTvType?.text = mData[position].title
        holder.mIvType?.setImageResource(mData[position].drawableId)

        return itemView
    }

    override fun getItem(position: Int) = mData[position]

    override fun getItemId(position: Int) = 0L

    override fun getCount() = mData.size

    inner class ViewHolder{
        internal var mTvType: TextView? = null
        internal var mIvType: ImageView? = null
    }
}