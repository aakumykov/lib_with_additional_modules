package com.github.aakumykov.lib_0

import android.util.Log
import kotlin.jvm.java

class Lib0 {
    fun work() {
        Log.d(TAG, "work(v0.0.2)")
    }
    companion object {
        val TAG: String = Lib0::class.java.simpleName
    }
}