package com.example.cutiehack2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddSubscription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_subscription)

        val button = findViewById<Button>(R.id.btn_add_sub)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            val subName = findViewById<EditText>(R.id.editTextTextPersonName2)
            val subPrice = findViewById<EditText>(R.id.editTextNumberDecimal)
            val subInitialDate = findViewById<EditText>(R.id.editTextDate2)
            val subLength = findViewById<EditText>(R.id.editTextNumber)

            intent.putExtra("NAME", subName.text.toString())
            intent.putExtra("PRICE", subPrice.text.toString().toInt())
            //intent.putExtra("DATE", subInitialDate.text.toString())
            intent.putExtra("LENGTH", subLength.text.toString().toInt())

            startActivity(intent)
        }

    }
}