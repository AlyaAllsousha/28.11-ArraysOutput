package ru.example.myapplication

import android.graphics.Bitmap
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import ru.example.myapplication.databinding.ActivityMainBinding

class KittyAdapter(
    val kyttyArray: ArrayList<Kitty>
):RecyclerView.Adapter<KittyAdapter.KittyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KittyHolder {

    }

    override fun getItemCount(): Int {
        return kyttyArray.size
    }

    override fun onBindViewHolder(holder: KittyHolder, position: Int) {
    }
    inner class KittyHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var nameTv: TextView? = null
        var colorTv: TextView?= null
        var porodaTv: TextView? = null
        var imageIv: ImageView? = null
        init{
            nameTv = itemView.findViewById<TextView>(R.id.Name)
            colorTv = itemView.findViewById(R.id.Color)
            porodaTv = itemView.findViewById(R.id.Poroda)
            imageIv =itemView.findViewById(R.id.IV)
        }
    }
}