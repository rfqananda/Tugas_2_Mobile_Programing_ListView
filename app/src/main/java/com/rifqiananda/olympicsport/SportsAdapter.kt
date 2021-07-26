package com.rifqiananda.olympicsport

import android.content.Context
import android.media.Image
import android.util.Log.i
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SportsAdapter(var mCtx: Context, var resources: Int, var items:List<Sports>):ArrayAdapter<Sports>(mCtx,resources, items){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.iv_sports)
        val namaOlahraga: TextView = view.findViewById(R.id.name_sports)
        val descOlahraga: TextView = view.findViewById(R.id.desc_sports)

        val mItem: Sports = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.imgView))
        namaOlahraga.text = mItem.txtName
        descOlahraga.text = mItem.txtDesc

        return view
    }
}