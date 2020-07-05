/*
 * 项目名：LearnKotlin
 * 作者：ipluto
 * 类名：MainActivity.kt
 * 模块名：app
 * 当前修改时间：2020年07月05日 17:39:22
 * 上次修改时间：2020年07月05日 17:39:11
 * Copyright (c) 2020 - 2020 All Rights Reserved.
 *
 */

package com.wit.learnkotlin

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Lamba 表达式
        button1.setOnClickListener {
            Toast.makeText(this, "You ckicked Button 1", Toast.LENGTH_LONG).show()
//            finish()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.addCategory("com.wit.learnkotlin.ACTION_START")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }

        button4.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == Activity.RESULT_OK) {
                val returnData = data?.getStringExtra("data_Return")
                Log.d("lzw", "return data is $returnData")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        //show menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You click Add", Toast.LENGTH_LONG).show()
            R.id.remove_item -> Toast.makeText(this, "You click Remove", Toast.LENGTH_LONG).show()
        }
        return true
    }
}
