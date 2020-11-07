package com.example.cutiehack2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var subscriptionList = ArrayList<Subscription>()
    }

    class Subscription(__name: String, __price: Int, __initialStartDate: LocalDateTime, __subscriptionDuration: Int) {
        var name = __name
        var price = __price
        var initialStartDate = __initialStartDate
        var subscriptionDuration = __subscriptionDuration
    }
}
