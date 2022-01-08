package com.example.birthdaygreetings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_daygreeting.*

class birthDaygreetingActivity : AppCompatActivity() {

    companion object{
        const val  NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_daygreeting)

        val nam = intent.getStringExtra(NAME_EXTRA)



        birthdaygreeting.text="HAPPY BIRTHDAY\n$nam!!"



    }
}