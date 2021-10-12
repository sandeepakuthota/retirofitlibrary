package com.example.data

import android.content.Context
import android.widget.Toast




class ToasterActivity {

    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}