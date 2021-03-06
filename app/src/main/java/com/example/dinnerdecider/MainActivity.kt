package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

/**
*Only one class
*/
class MainActivity : AppCompatActivity() {
        val foodList = arrayListOf("South-Indian","Chines","Italian","Biryani","North-Indian","Thai","Indonesian","Turkish","Spanish","Moroccan","Japanese","Italian",
            "South-Indian","Chines","Italian","Biryani","North-Indian","Thai","Indonesian","Turkish","Spanish")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFood.text = foodList[randomFood]
        }

        decideBtn.setOnClickListener {
            val newFood = addFoodText.text.toString()
             foodList.add(newFood)
            addFoodText.text.clear()
        }
    }
}
