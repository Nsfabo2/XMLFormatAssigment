package com.example.xmlformatassigment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RcyclerViewAdapter(private val names: List<Student>) : RecyclerView.Adapter<RcyclerViewAdapter.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row
                ,parent
                ,false
            )
        )

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name =names [position]

        holder.itemView.apply{
            stdTV.text=name.name+"\n"+name.marks+"\n"+"\n"
        }

    }

    override fun getItemCount() =    names.size
}