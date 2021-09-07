package com.tashev.kotlinhw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uniqueOriginal = ClassForCopy("String", 123, "OneMoreString", )
        val patheticParody = uniqueOriginal.copy()
        val dataClassExample = ClassToShow();

        for (i in 1..10){
            if (i%2==0) Log.d("myLog","Even")
            else Log.d("myLog","Odd")
        }

        val classData = findViewById<TextView>(R.id.classData)
        val btn = findViewById<Button>(R.id.button).setOnClickListener {
            classData.setText("${patheticParody.string} ${patheticParody.int} ${patheticParody.oneMoreString} ${patheticParody.double}") }
        val pangram = findViewById<TextView>(R.id.pangram).setText(dataClassExample.toString())

        Log.d("myLog", "${uniqueOriginal.string} ${uniqueOriginal.int} ${uniqueOriginal.oneMoreString} ${uniqueOriginal.double}")
        Log.d("myLog", "${patheticParody.string} ${patheticParody.int} ${patheticParody.oneMoreString} ${patheticParody.double}")

    }
}