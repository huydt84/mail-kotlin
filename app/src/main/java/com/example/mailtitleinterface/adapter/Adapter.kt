package com.example.mailtitleinterface.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mailtitleinterface.R
import com.example.mailtitleinterface.model.Mail

class Adapter(private var context: Context, private var dataset: List<Mail>):
    RecyclerView.Adapter<ItemViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.content_main, parent, false)

            return ItemViewHolder(adapterLayout)
        }

        override fun getItemCount() = dataset.size;

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = dataset[position]
            holder.sender.text = item.sender
            holder.date.text = item.date
            holder.content.text = item.content
        }

    }

class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
    val sender: TextView = view.findViewById(R.id.item_title)
    var date: TextView = view.findViewById(R.id.time)
    var content: TextView = view.findViewById(R.id.item_description)
}