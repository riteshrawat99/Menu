package com.pupup.menu2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ContextActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        val listView : ListView = findViewById(R.id.listView)
        var myArray = arrayOf("Virat Kohli","Shubhman Gill","Rohit Sharma")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,myArray)
        registerForContextMenu(listView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        menu?.setHeaderTitle("Select below Item")
        menu?.add(0,v!!.id,0,"Item 1")
        menu?.add(0,v!!.id,0,"Item 2")
        menu?.add(0,v!!.id,0,"Item 3")
        menu?.add(0,v!!.id,0,"Item 4")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if(item.title == "Item 1"){
            Toast.makeText(this@ContextActivity, "${item.title}", Toast.LENGTH_SHORT).show()
        }
        else if(item?.title == "Item 2"){
            Toast.makeText(this@ContextActivity, "${item.title}", Toast.LENGTH_SHORT).show()
        }
        else if(item?.title == "Item 3"){
            Toast.makeText(this@ContextActivity, "${item.title}", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this@ContextActivity, "${item.title}", Toast.LENGTH_SHORT).show()
        }
     return true
    }
}