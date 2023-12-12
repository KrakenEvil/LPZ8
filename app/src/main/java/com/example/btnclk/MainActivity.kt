package com.example.btnclk

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
      

    }

    fun Red(view: View) {
        val ConstraintLayout: ConstraintLayout = findViewById(R.id.root_layout)
        ConstraintLayout.setBackgroundColor(resources.getColor(R.color.redColor))

    }

    fun yellow(view: View) {
        val ConstraintLayout2: ConstraintLayout = findViewById(R.id.root_layout)
        ConstraintLayout2.setBackgroundColor(resources.getColor(R.color.yellowColor))
    }

    fun green(view: View) {
        val ConstraintLayout3: ConstraintLayout = findViewById(R.id.root_layout)
        ConstraintLayout3.setBackgroundColor(resources.getColor(R.color.greenColor))
    }

    fun txtsize1(view: View) {
        val textView: TextView = findViewById(R.id.textView)
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20.0f)
    }

    fun txtsize2(view: View) {
        val textView2: TextView = findViewById(R.id.textView)
        textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25.0f)
    }


}