package com.example.menu_contextuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email: EditText =findViewById(R.id.email)
        registerForContextMenu(email)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.contextuel_menu, menu)
        // menu.setHeaderTitle("ContextMenu");
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        return when (item.itemId) {
            R.id.mail-> {
                Toast.makeText(applicationContext, "search menu", Toast.LENGTH_LONG).show()
                return true;
            }
            R.id.option2-> {
                Toast.makeText(applicationContext, "ch1 menu", Toast.LENGTH_LONG).show()
                return true;
            }
            else -> super.onContextItemSelected(item)
        }
    }

}