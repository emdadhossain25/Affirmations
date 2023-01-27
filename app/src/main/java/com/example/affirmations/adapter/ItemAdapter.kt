package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

// private because only used in this class
// val can not be changed
//
//step 1. create adapter class with constructor
// step3 make Adapter class extend Recycler.Adapter
//step4 implement abstract method for adapter inheritance
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    //step 2 create viewholder class with extending parent class and passing view in parent class constructor
    //nested class for better understanding of new devs
    // ViewHolder for this adapter which holds reference to views
    // recyclerview reuses this viewholder to generate and fillup screen with views
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.list_item,
                parent,
                false
            )
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item=dataset[position]
        holder.textView.text=context.resources.getString(item.stringResourceId)
    }

    override fun getItemCount(): Int = dataset.size
}