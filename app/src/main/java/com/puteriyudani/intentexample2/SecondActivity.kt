package com.puteriyudani.intentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //mengekstrak data dari intent
        val m_data = intent.getStringExtra("main_activity_data") //menggunakan method getStringExtra
        textView.setText(m_data)
    }
}