package com.example.menu_popup

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpopup: Button = findViewById(R.id.btnpopup)
        registerForContextMenu(btnpopup);

        btnpopup.setOnClickListener(){

        }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_popup, menu)
        // menu.setHeaderTitle("ContextMenu");
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_1 -> Toast.makeText(this, "item_1", Toast.LENGTH_LONG).show()
            R.id.item_2 -> Toast.makeText(this, "item_2", Toast.LENGTH_LONG).show()
            R.id.item_3 -> Toast.makeText(this, "item_3", Toast.LENGTH_LONG).show()
            R.id.item_4 -> Toast.makeText(this, "item_4", Toast.LENGTH_LONG).show()

        }
        return super.onContextItemSelected(item)
    }
}