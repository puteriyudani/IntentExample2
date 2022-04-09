package com.puteriyudani.intentexample2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val m_data = editText.text.toString()
            val m_intent = Intent(this@MainActivity, SecondActivity::class.java) //eksplisit intent
            m_intent.putExtra("main_activity_data", m_data) //menambahkan data ke intent
            startActivity(m_intent) //menjalankan Second Activity
        }
    }
}