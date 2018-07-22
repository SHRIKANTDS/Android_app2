package com.example.shrikant.interactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contacts.*

class Contacts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        ll1.setOnClickListener {
            val int =Intent(this@Contacts,MainActivity::class.java)
            startActivity(int)
        }

        ll2.setOnClickListener {
            val int =Intent(this@Contacts,MainActivity::class.java)
            startActivity(int)
        }

        ll3.setOnClickListener {
            val int =Intent(this@Contacts,MainActivity::class.java)
            startActivity(int)
        }

        ll4.setOnClickListener {
            val int =Intent(this@Contacts,MainActivity::class.java)
            startActivity(int)
        }

        ll5.setOnClickListener {
            val int =Intent(this@Contacts,MainActivity::class.java)
            startActivity(int)
        }
    }
}
