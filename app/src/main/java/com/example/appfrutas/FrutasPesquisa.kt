package com.example.appfrutas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.GridView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_frutas_pesquisa.*

class FrutasPesquisa : AppCompatActivity(), OnItemClickListener {

    private  var gridFrutasPesquisa: GridView?= null
    private  var arrayList: ArrayList<Fruta>?=null
    private  var frutaAdpater: FrutaAdpater?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas_pesquisa)

        gridFrutasPesquisa=findViewById(R.id.listFrutasPesq)
        arrayList= ArrayList()
        arrayList=setDataList()
        frutaAdpater=FrutaAdpater(applicationContext,arrayList!!)
        gridFrutasPesquisa?.adapter=frutaAdpater
        gridFrutasPesquisa?.onItemClickListener=this

        btnVolta.setOnClickListener{
            home()
        }
    }

    fun home(){
        val intent = Intent(this,homeFrutas::class.java)
        startActivity(intent)
    }

    private  fun setDataList(): ArrayList<Fruta>{
        var arrayList:ArrayList<Fruta> = ArrayList()

        arrayList.add(Fruta("fruta","banana"))
        arrayList.add(Fruta("Vetegais","cenoura"))
        arrayList.add(Fruta("fruta","Laranja"))

        return arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
        var fruta:Fruta= arrayList!!.get(position)
        Toast.makeText(this, "Fruta: "+fruta.name,Toast.LENGTH_LONG).show()
    }
}