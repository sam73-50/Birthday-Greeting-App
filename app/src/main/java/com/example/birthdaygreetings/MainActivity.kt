package com.example.birthdaygreetings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var nameInput:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.nameInput)
    }

    fun createbirthdayCard(view: android.view.View) {
        val name = nameInput.text.toString()

        val intent = Intent(this@MainActivity,birthDaygreetingActivity::class.java )

        intent.putExtra(birthDaygreetingActivity.NAME_EXTRA,name)
        Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()

            startActivity(intent)



    }
}




