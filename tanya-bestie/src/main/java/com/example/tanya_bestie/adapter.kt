package com.example.tanya_bestie

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context: Context, var itemList: ArrayList<Faq>) :
    RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_items, parent, false)

        return ItemViewHolder(itemView)
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var coinLayout: LinearLayout = view.findViewById(R.id.layout)
        val expandImage: ImageView = view.findViewById(R.id.expand_btn)
        val coinName: CardView = view.findViewById(R.id.expandable)
        val question: TextView = view.findViewById(R.id.question)
        val answer: TextView = view.findViewById(R.id.answer)


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.question.text = item.question
        holder.answer.text = item.answer
        holder.coinLayout.setOnClickListener {
            if (holder.answer.visibility == View.GONE) {
                holder.answer.visibility = View.VISIBLE
                holder.expandImage.setImageResource(R.drawable.ic_remove)
            } else {
                holder.answer.visibility = View.GONE
                holder.expandImage.setImageResource(R.drawable.ic_add)
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun setData(list: ArrayList<Faq>) {
        this.itemList = list
        notifyDataSetChanged()
    }

}