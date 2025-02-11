package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(_numbers: Array<Int>): RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>(){

    private val numbers = _numbers

    class NumberViewHolder (val _textView: TextView) : RecyclerView.ViewHolder (_textView) {
        val textView = _textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context).apply{
                setPadding(10,10,10,10)
            }
        )
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
        holder.textView.textSize = (numbers[position].toFloat())
    }


}