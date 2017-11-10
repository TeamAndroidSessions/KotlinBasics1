package com.mobinius.kotlinrecyclerviewdemo.activity

import android.graphics.ColorSpace
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.mobinius.kotlinrecyclerviewdemo.adapter.CustomAdapter
import com.mobinius.kotlinrecyclerviewdemo.model.ModelClass
import com.mobinius.kotlinrecyclerviewdemo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //crating an arraylist to store users using the data class     ModelClass
        val model = ArrayList<ModelClass>()

        //adding some dummy data to the list
        model.add(ModelClass("KOTLIN", "Example"))
        model.add(ModelClass("ABC", "Mobinius"))
        model.add(ModelClass("XYZ", "Mobinius"))
        model.add(ModelClass("IJK", "Mobinius"))

        //creating our adapter
        val adapter = CustomAdapter(model)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter



        val m = ModelClass()
        m.name="Mobinius"
        m.address="bangalore"
    }


}
