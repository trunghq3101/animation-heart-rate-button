package com.trunghoang.generalapp

import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageRecord.setOnClickListener(this)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onClick(v: View?) {
        val animateRecord = (v as ImageView).drawable as AnimatedVectorDrawable
        animateRecord.start()
    }
}
