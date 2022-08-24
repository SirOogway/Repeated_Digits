package com.innova.repeateddigits

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.innova.repeateddigits.Extensions.containsRepeatedDigits

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//       Contar y mostrar los números de 3 cifras que tienen cifras repetidas

        val btnShow: Button = findViewById(R.id.btnShow)
        val tvNumberList: TextView = findViewById(R.id.tvNumberList)

        btnShow.setOnClickListener {
            val repeatedListStr = generateNumberListOfRepeatedDigits(100, 999).toString()

            tvNumberList.text = repeatedListStr.slice(1 until repeatedListStr.lastIndex)
        }
    }

    private fun generateNumberListOfRepeatedDigits(start: Int, end: Int): ArrayDeque<Int> {
        val repeatedList = ArrayDeque<Int>()
        (start..end).filter { it.containsRepeatedDigits() }.map { repeatedList.addLast(it) }
        return repeatedList
    }
}