package com.example.data

import android.content.Context
import android.widget.Toast




open class ToasterActivity {

    companion object {
        fun toastmessage(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
    }
}