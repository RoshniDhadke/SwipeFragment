package com.example.swipefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vp=findViewById<ViewPager>(R.id.vp)
        val adapter=SimpleFragmentPageAdapter(supportFragmentManager)
        vp.adapter=adapter
    }
}