package com.squall.gitpracticeyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained in my second commit")
        println("LOCAL CHANGE")
        println("CHANGE 4")
        println("THIS LINE WILL BE MERGED")
    }
}