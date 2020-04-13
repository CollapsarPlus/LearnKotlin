/*
 * 项目名：LearnKotlin
 * 作者：ipluto
 * 类名：LearnKotlin.kt
 * 模块名：app
 * 当前修改时间：2020年04月13日 23:25:39
 * 上次修改时间：2020年04月13日 23:24:58
 * Copyright (c) 2020 - 2020 All Rights Reserved.
 *
 */

package com.wit.learnkotlin

import kotlin.math.max

fun main() {
    println("Hello World!")
    val a = 10
    println("a = " + a)
    var b: Int = 22
    b *= 10
    println("b = " + b)

    println("largeNumbel = " + largeNumble(a, b))
    //[0,10]
    val c = 0..10

    for (i in c) {
        println("c[" + i + "] = " + i)
    }

    //[0,10)
    val d = 0 until 10
    for (i in d step 3) {
        println("d[$i] = $i")
    }

    //[10,0]
    val e = 10 downTo 0
    for (i in e step 2) {
        println("d[$i] = $i")
    }

    val p = Persion()
    println("p.name = ${p.name} ; p.age = ${p.age}")
    p.name = "Tom"
    p.age = 99
    p.eat()
}

fun largeNumble(param1: Int, param2: Int): Int {
    var showNumber = 0
    if (param1 > param2) {
        showNumber = param1
    } else {
        showNumber = param2
    }
    return showNumber
}

fun largeNumble03(param1: Int, param2: Int): Int {
    val showNumber = if (param1 > param2) {
        param1
    } else {
        param2
    }
    return showNumber
}

fun largeNumble04(param1: Int, param2: Int): Int {
    return if (param1 > param2) {
        param1
    } else {
        param2
    }
}

//终极效果
fun largeNumble05(param1: Int, param2: Int) = if (param1 > param2) {
    param1
} else {
    param2
}


//语法糖--单行代码函数
fun largeNumble02(param1: Int, param2: Int) = max(param1, param2)

fun getScore(name: String) = if (name == "Tom") {
    88
} else if (name == "Jim") {
    98
} else {
    0
}

fun getScore2(name: String) = when (name) {
    "Tom" -> 98
    "jim" -> 88
    else -> 0
}

//更优秀，若java，只能用if-else处理
fun getScore3(name: String) = when {
    name == "Tom" -> 98
    name == "jim" -> 88
    name.startsWith("liu") -> 100
    else -> 0
}

