package com.example.androidlab

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import com.example.androidlab.databinding.ActivityMain2Binding
import com.example.androidlab.databinding.ActivityMainBinding
import java.util.function.LongFunction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }



}

