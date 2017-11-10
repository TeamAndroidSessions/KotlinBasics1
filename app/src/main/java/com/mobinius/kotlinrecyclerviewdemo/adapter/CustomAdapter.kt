package com.mobinius.kotlinrecyclerviewdemo.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mobinius.kotlinrecyclerviewdemo.model.ModelClass
import com.mobinius.kotlinrecyclerviewdemo.R
import java.util.*

/**
 * Created by prajna on 26/10/17.
 */
class CustomAdapter(val userList: ArrayList<ModelClass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(model: ModelClass) {
//            val textViewName = itemView.findViewById(R.id.textViewUserName) as TextView
            val textViewName = itemView.findViewById<TextView>(R.id.textViewUserName) as TextView
            val textViewAddress = itemView.findViewById<TextView>(R.id.textViewAddress) as TextView
            textViewName.text = model.name
            textViewAddress.text = model.address
        }
    }
}
