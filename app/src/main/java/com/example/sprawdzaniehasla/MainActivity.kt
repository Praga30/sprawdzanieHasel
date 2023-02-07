package com.example.sprawdzaniehasla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sprawdzeniehas=findViewById<CheckBox>(R.id.Zgodne)
        val WielkaLitera = findViewById<CheckBox>(R.id.wielkalit)
        val MalaLitera = findViewById<CheckBox>(R.id.malalit)
        val Cyfra = findViewById<CheckBox>(R.id.Cyfr)
        val ZnakSpec = findViewById<CheckBox>(R.id.znakspec)
        findViewById<Button>(R.id.Sprawdz).setOnClickListener {
            var haslo=findViewById<TextInputEditText>(R.id.Wprowadzanie).toString()
            var potwierdzeniehasla=findViewById<TextInputEditText>(R.id.Potwierdzanie).toString()



        }
    }
}