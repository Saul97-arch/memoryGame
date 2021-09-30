package com.example.memorygame.recyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.memorygame.R
import kotlin.math.min

class MemoryBoardAdapter(
    private val context: Context,
    private val numPieces: Int
) : RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardWidth = parent.width / 2
        val cardHeigth = parent.height / 4
        val cardSideLength = min(cardWidth, cardHeigth)
        val view = LayoutInflater.from(context).inflate(R.layout.memory_card, parent, false)
        val layoutParams = view.findViewById<CardView>(R.id.cardView).layoutParams
        layoutParams.width = cardHeigth
        layoutParams.height = cardSideLength
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = numPieces

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            //No-op
        }
    }
}
