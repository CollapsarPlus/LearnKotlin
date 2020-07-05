/*
 * 项目名：LearnKotlin
 * 作者：ipluto
 * 类名：SecondActivity.kt
 * 模块名：app
 * 当前修改时间：2020年07月05日 17:39:23
 * 上次修改时间：2020年07月05日 17:39:10
 * Copyright (c) 2020 - 2020 All Rights Reserved.
 *
 */

package com.wit.learnkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn_show.setOnClickListener {
            Toast.makeText(this, "Click Second Activity Button", Toast.LENGTH_LONG).show()
        }

        button5.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return", "No zuo no die !")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val intent = Intent()
        intent.putExtra("data_return", "No zuo no die !")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}