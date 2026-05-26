package com.github.aakumykov.lib_2

import android.util.Log

class Lib2 {
    fun work() {
        Log.d(TAG, "work(условная v0.0.1)")
    }
    companion object {
        val TAG: String = Lib2::class.java.simpleName
    }
}