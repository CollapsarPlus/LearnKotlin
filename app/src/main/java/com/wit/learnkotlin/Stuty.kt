/*
 * 项目名：LearnKotlin
 * 作者：ipluto
 * 类名：Stuty.kt
 * 模块名：app
 * 当前修改时间：2020年07月05日 17:39:23
 * 上次修改时间：2020年06月27日 16:29:47
 * Copyright (c) 2020 - 2020 All Rights Reserved.
 *
 */

package com.wit.learnkotlin

interface Stuty {
    fun readBooks()
    fun doHomework()

    fun playGames() {
        println("Not Permission!")
    }
}