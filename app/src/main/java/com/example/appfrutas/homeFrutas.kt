package com.example.appfrutas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_frutas.*

class homeFrutas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_frutas)

        cardFruta.setOnClickListener{
            pesquisa()
        }
    }

    fun pesquisa(){
        val intent =Intent(this,FrutasPesquisa::class.java)
        startActivity(intent)
    }

}