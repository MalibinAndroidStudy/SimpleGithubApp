package com.example.simplegithubapp

import androidx.databinding.ObservableField


class SampleData {
    var count = ObservableField<Int>(10)
    //var count =MutableLiveData<Int>()

    fun countUp() {
        val currentCount=count.get() ?: 10
        count.set(currentCount+1)

    }
}