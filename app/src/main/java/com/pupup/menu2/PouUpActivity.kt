package com.pupup.menu2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.RelativeLayout
import android.widget.Toast

class PouUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pou_up)

        val relativeLayout : RelativeLayout = findViewById(R.id.background)


        val show_pupup : Button = findViewById(R.id.show_pupup)
        show_pupup.setOnClickListener {
            val pupup = PopupMenu(this,show_pupup)
            pupup.menuInflater.inflate(R.menu.popup_item,pupup.menu)
            pupup.show()
            pupup.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.virat-> {
                        Toast.makeText(this@PouUpActivity, "Popup Item is : ${it.title}", Toast.LENGTH_SHORT).show()
//                        relativeLayout.setBackgroundResource(R.drawable.virat)
                    }

                    R.id.shubhaman-> {
                        Toast.makeText(this@PouUpActivity, "Popup Item is : ${it.title}", Toast.LENGTH_SHORT).show()
//                        relativeLayout.setBackgroundResource(R.drawable.kl)
                    }
                    R.id.iyer-> Toast.makeText(this@PouUpActivity, "Popup Item is : ${it.title}", Toast.LENGTH_SHORT).show()
                }
                true
            }
        }
    }
}