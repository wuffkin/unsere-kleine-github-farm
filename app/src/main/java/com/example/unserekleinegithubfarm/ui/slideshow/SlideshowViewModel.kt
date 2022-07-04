package com.example.unserekleinegithubfarm.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Alexs Buddelkiste"
    }
    val text: LiveData<String> = _text
}