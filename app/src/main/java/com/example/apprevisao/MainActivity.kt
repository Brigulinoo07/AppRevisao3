package com.example.apprevisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val btnCadastro:Button = findViewById(R.id.BtnCadastrar)

        btnCadastro.setOnClickListener{
            val intent= Intent(  this, MainActivity2::class.java)
            startActivity(intent)}


    }



}