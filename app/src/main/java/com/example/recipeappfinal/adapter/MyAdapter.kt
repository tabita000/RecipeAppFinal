package com.example.recipeappfinal.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeappfinal.R
import com.example.recipeappfinal.SecondActivity
import com.example.recipeappfinal.model.MyModel


class MyAdapter(var context: Context, var arrayList: ArrayList<MyModel>):
 RecyclerView.Adapter<MyAdapter.ItemHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent, false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(
        holder: ItemHolder,
        position: Int
    ) {
        var myCard: MyModel = arrayList.get(position)

        holder.icon.setImageResource(myCard.iconCard!!)
        holder.txt.text = myCard.textCard

        holder.txt.setOnClickListener {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("recipeName", myCard.textCard)
            intent.putExtra("recipeImage", myCard.iconCard!!)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var icon = itemView.findViewById<ImageView>(R.id.icon_image)
        var txt = itemView.findViewById<TextView>(R.id.txtTitle)

    }

}