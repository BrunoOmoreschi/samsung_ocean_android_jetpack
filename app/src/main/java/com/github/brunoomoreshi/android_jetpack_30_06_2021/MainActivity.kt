package com.github.brunoomoreshi.android_jetpack_30_06_2021

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewModel =
            ViewModelProvider(this)
                .get(TextViewModel::class.java)

        val textView = findViewById<TextView>(R.id.textView)

        // Lógica de Apresentação
        textViewModel.text.observe(this, {
            textView.text = it
        })

        // Evento clique normal
        textView.setOnClickListener {
            textViewModel.text.value = "Elemento clicado!"
        }

        // Evento clique longo
        textView.setOnLongClickListener {
            textViewModel.text.value = "Elemento clicado 2!"

            true
        }
    }
}