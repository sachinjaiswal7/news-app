package com.example.newsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(private val context: Context, private val hobbies:List<Hobby>):RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby,position)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }
    inner class MyViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
        var hobby: String? = itemView.textView2.text.toString()
        var position: Int? = 0
        init {
           itemView.textView2.setOnClickListener{
               Toast.makeText(context,"Clicked ${hobby}",Toast.LENGTH_SHORT).show()
           }
            itemView.imageButton.setOnClickListener{
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,hobby)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent,"Share to"))
            }
        }
        fun setData(hobby:Hobby?,pos:Int){
         itemView.textView2.text = hobby!!.text
            this.position = pos
            this.hobby = hobby!!.text.toString()
        }
    }
}