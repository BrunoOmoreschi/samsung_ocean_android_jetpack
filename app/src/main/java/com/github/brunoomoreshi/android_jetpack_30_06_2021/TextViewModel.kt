package com.github.brunoomoreshi.android_jetpack_30_06_2021

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    val text = MutableLiveData<String>()
}