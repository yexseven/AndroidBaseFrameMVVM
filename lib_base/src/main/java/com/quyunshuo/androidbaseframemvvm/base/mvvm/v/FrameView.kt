package com.quyunshuo.androidbaseframemvvm.base.mvvm.v

import androidx.viewbinding.ViewBinding

/**
 * View层基类抽象
 *
 * @author Qu Yunshuo
 * @since 10/13/20
 */
interface FrameView<VB : ViewBinding> {
    /**
     * 初始化View
     */
    fun VB.initView()

    /**
     * 初始化LiveData的订阅关系
     */
    fun initLiveDataObserve()

    /**
     * 初始化界面创建时的数据请求
     */
    fun initRequestData()
}