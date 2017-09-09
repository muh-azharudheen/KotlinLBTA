package com.example.mac.kotlinlbta

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private class Student(val name: String, val age: Int)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = Student("Muhammed" , age = 20)
        val student2 = Student(name = "Muhammed Azharudheen", age = 23)
        val student3 = Student(age = 10, name = "Muhammed Ashil")
        

        for (i in 0..100){
            if (i % 15 == 0){
                Log.d("FizzBuzz", i.toString())
            } else if (i % 5 == 0){
                Log.d("Fizz", i.toString())
            } else if (i % 3 == 0){
                Log.d("Buzz", i.toString())
            }
        }
    }
}
