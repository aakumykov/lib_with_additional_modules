package com.github.aakumykov.lib_0

import android.util.Log
import com.github.aakumykov.lib_1.Lib1
import com.github.aakumykov.lib_2.Lib2
import kotlin.jvm.java

class Lib0 {
    fun work() {
        Log.d(TAG, "work(v0.0.2)")
        Lib1().work()
        Lib2().work()
    }
    companion object {
        val TAG: String = Lib0::class.java.simpleName
    }
}