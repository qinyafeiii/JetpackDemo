package com.example.learnjetpack.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * 测试ViewModel的基本使用
 * @author qinyafei
 * @since 2021/2/23 17:50
 */
class UserViewModel : ViewModel() {

    private var userLiveData = MutableLiveData<String>()

    private var progressData = MutableLiveData<Int>()


    fun getUserData(): MutableLiveData<String> = userLiveData
    fun getProgeressData(): MutableLiveData<Int> = progressData
}