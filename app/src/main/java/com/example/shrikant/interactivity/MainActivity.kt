package com.example.shrikant.interactivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send.setOnClickListener {
            val lparams = LinearLayout.LayoutParams(300,200)
            val tv = TextView(this)
            tv.layoutParams = lparams
            ll.addView(tv)
            tv.text=txt.text.toString()

            tv.setTextSize(15f)
            txt.text.clear()

        }

        }
    }

