package com.example.trainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)

        val button = findViewById<Button>(R.id.button_task1)

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, TasksMenuActivity::class.java)
            startActivity(intent)
        }
    }

    fun toastMe(view: View?) {
        Toast.makeText(this, "Ну привет, дорогой)", Toast.LENGTH_LONG).show()
    }
}