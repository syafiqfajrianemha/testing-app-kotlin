package com.example.mytestingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var btnSetValue: Button
    private lateinit var tvText: TextView

    private var names = ArrayList<String>()

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSetValue = findViewById(R.id.btn_set_value)
        tvText = findViewById(R.id.tv_text)

        btnSetValue.setOnClickListener(this)

        names.add("Syafiq Fajrian Emha")
        names.add("Viki Flendiansyah")
        names.add("Alvian Santoso")
    }

    override fun onClick(v: View) {
        if(v.id == R.id.btn_set_value) {
            /*
             - Log.e() untuk log error.
             - Log.w() untuk log warning.
             - Log.i() untuk log information.
             - Log.d() untuk log debug.
             - Log.v() untuk log verbose.
             */
            Log.d(TAG, names.toString())
            val name = StringBuilder()
            for(i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
            // tvText.text = "Hello, Syafiq Fajrian Emha"
        }
    }
}