package com.pupup.menu2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class OptionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)
        val tool_bar : androidx.appcompat.widget.Toolbar = findViewById(R.id.tool_bar)
        setSupportActionBar(tool_bar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.popup_item,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.shubhaman -> Toast.makeText(this@OptionActivity, "Clicked : ${item.title}", Toast.LENGTH_SHORT).show()
            R.id.iyer -> Toast.makeText(this@OptionActivity, "Clicked : ${item.title}", Toast.LENGTH_SHORT).show()
            R.id.virat -> Toast.makeText(this@OptionActivity, "Clicked : ${item.title}", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}