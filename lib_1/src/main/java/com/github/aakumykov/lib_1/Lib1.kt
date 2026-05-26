package com.github.aakumykov.lib_1

import android.util.Log
import kotlin.jvm.java

class Lib1 {
    fun work() {
        Log.d(TAG, "work(условная v0.0.1)")
    }
    companion object {
        val TAG: String = Lib1::class.java.simpleName
    }
}