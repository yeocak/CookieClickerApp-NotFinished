package com.example.cookieclickerapp.datas

import android.util.Log
import android.widget.TextView

object CookieData {
    var cookie: Double = 10.0
    var everyMiniSecond: Double = 0.0
    var clickAdd = 1

    var upgradeList = mutableListOf<SingleUpgrade>(
        SingleUpgrade("Boost 1",10,isOpen = true, value = 0.01,count = 0),
        SingleUpgrade("Boost 2",100, value = 0.2),
        SingleUpgrade("Boost 3",1000, value = 3.0),
        SingleUpgrade("Boost 4",10000, value = 14.0),
        SingleUpgrade("Boost 5",100000, value = 83.0),
        SingleUpgrade("Boost 6",1000000, value = 976.0),
        SingleUpgrade("Boost 7",10000000, value = 9453.0)
    )

    var animation = true

}