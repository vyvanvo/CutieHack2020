package com.example.cutiehack2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlin.android.synthetic.main.activity_add_subscription.*
import java.time.LocalDateTime


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_add)
        button.setOnClickListener{
            val intent = Intent(this, AddSubscription::class.java)

            startActivity(intent)

        }

        var subscriptionList = ArrayList<Subscription>()

        if(intent.hasExtra("NAME")) {
            val subName: String = intent.getStringExtra("NAME").toString()
            val subPrice = intent.getIntExtra("PRICE", 0)
            //val subInitialDate = intent.getStringExtra("NAME")
            val subLength = intent.getIntExtra("LENGTH", 0)
            subscriptionList.add(Subscription(subName, subPrice, subLength))

            val subBtn = Button(this)
            subBtn.text = subName

            val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
            subBtn.layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            linearLayout.addView(subBtn)


        }
    }

    class Subscription(__name: String, __price: Int, __subscriptionDuration: Int) {
        var name = __name
        var price = __price
        //var initialStartDate = __initialStartDate
        var subscriptionDuration = __subscriptionDuration
    }
}
