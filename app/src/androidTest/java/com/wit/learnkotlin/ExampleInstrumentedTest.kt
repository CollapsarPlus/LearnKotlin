/*
 * 项目名：LearnKotlin
 * 作者：ipluto
 * 类名：ExampleInstrumentedTest.kt
 * 模块名：app
 * 当前修改时间：2020年04月12日 17:45:23
 * 上次修改时间：2020年04月12日 17:44:49
 * Copyright (c) 2020 - 2020 All Rights Reserved.
 *
 */

package com.wit.learnkotlin

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.wit.learnkotlin", appContext.packageName)
    }
}
