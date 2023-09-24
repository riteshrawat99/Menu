package com.pupup.menu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val go_pupup_menu : ImageView = findViewById(R.id.go_pupup_menu)
        val go_option_menu : ImageView = findViewById(R.id.go_option_menu)
        val go_context_menu : ImageView = findViewById(R.id.go_context_menu)

        go_pupup_menu.setOnClickListener {
            startActivity(Intent(this@MainActivity,PouUpActivity::class.java))
        }
        go_option_menu.setOnClickListener {
            startActivity(Intent(this@MainActivity,OptionActivity::class.java))
        }
        go_context_menu.setOnClickListener {
            startActivity(Intent(this@MainActivity,ContextActivity::class.java))
        }

    }
}