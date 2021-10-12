package com.sdkproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.data.ToasterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       ToasterActivity.toastmessage(this,"this is sdk testing example")

    }
}