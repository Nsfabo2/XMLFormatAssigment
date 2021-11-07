package com.example.xmlformatassigment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var RV: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RV = findViewById(R.id.MainRV)

        var students: List<Student>? = null


        try {
            val parser = XmlPullParserHandler()
            val istream = assets.open("StudentDetails.xml")
            students=  parser.parse(istream)

            RV.adapter = RcyclerViewAdapter(students)
            RV.layoutManager = LinearLayoutManager(this)

        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}