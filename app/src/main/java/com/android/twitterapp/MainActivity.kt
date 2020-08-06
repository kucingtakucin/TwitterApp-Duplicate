package com.android.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.android.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)

        dataBinding.apply {
            buttonFollow.setOnClickListener{
                Toast.makeText(this@MainActivity, "Hore kamu difollow!", Toast.LENGTH_SHORT).show()
            }
            website.setOnClickListener{
                Toast.makeText(this@MainActivity, "Kunjungi website kita ya!",Toast.LENGTH_SHORT).show()
            }
            joined.setOnClickListener {
                Toast.makeText(this@MainActivity, "Ayo join gais", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
