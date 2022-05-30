package com.bld.mobileapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loadBirthdayCard(view: View) {
        println("Load Birthday Card")
        val birthdayMessage = "Happy Birthday!"
        val intent = Intent(this, BirthdayCardActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, birthdayMessage)
        }
        startActivity(intent)
    }

    fun loadToDo(view: View) {
        println("Load To Do")
        val intent = Intent(this, ToDoActivity::class.java)
        startActivity(intent)
    }

}