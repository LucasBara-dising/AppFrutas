package com.example.appfrutas

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class FrutaAdpater (var context: Context, var arrayList: ArrayList<Fruta>): BaseAdapter() {

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return  arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        var view:View = View.inflate(context, R.layout.item_fruta_pesq, null)

        var categoria: TextView= view.findViewById(R.id.textViewCategoria)
        var name: TextView= view.findViewById(R.id.textViewNomeFruta)

        var ItemFruta: Fruta= arrayList.get(position)

        categoria.text=ItemFruta.categoria
        name.text=ItemFruta.name

        return  view
    }

}