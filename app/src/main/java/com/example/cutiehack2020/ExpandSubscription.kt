package com.example.cutiehack2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExpandSubscription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // main -> add sub
        // in main, pass the array data
        // val subname, val subprice, val sublength, val subinital
        // this one creates new instance
        // new instance has data already filled in depending on main's input
        // can click on bars to change it?
        // top left has back button, returns to main activity
        // passes in data that is currently there (to track changes to sub class)


        val subName = intent.getStringExtra("NAME").toString()
        val subPrice = intent.getIntExtra("PRICE", 0)
        //val subInitialDate = intent.getStringExtra("NAME");
        val subLength = intent.getIntExtra("LENGTH", 0)

        val thing = findViewById<EditText>(R.id.editTextTextPersonName3)
        thing.setText(subName)
        val thing1 = findViewById<EditText>(R.id.editTextTextPersonName4)
        thing1.setText(subPrice)
        //val thing2 = findViewById<EditText>(R.id.editTextTextPersonName5)
        //thing2.setText(subName)
        val thing3 = findViewById<EditText>(R.id.editTextTextPersonName6)
        thing3.setText(subLength)

        setContentView(R.layout.activity_add_subscription)
        val button = findViewById<Button>(R.id.back_button)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val otherButton = findViewById<Button>(R.id.expand_submit)
        otherButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("NAME", subName.toString())
            intent.putExtra("PRICE", subName.toString().toInt())
            intent.putExtra("LENGTH", subName.toString().toInt())
            startActivity(intent)
        }

    }
}