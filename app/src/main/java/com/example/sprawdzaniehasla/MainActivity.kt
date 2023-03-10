package com.example.sprawdzaniehasla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x=""
        val Wprowadzanie = findViewById<EditText>(R.id.Wprowadzanie)
        val Potwierdzanie = findViewById<EditText>(R.id.Potwierdzanie)
        val Zgodnosc = findViewById<CheckBox>(R.id.Zgodne)
        val WielkaLitera = findViewById<CheckBox>(R.id.wielkalit)
        val MalaLitera = findViewById<CheckBox>(R.id.malalit)
        val Cyfra = findViewById<CheckBox>(R.id.Cyfr)
        val ZnakSpec = findViewById<CheckBox>(R.id.znakspec)
        findViewById<Button>(R.id.Sprawdz).setOnClickListener {
            var haslo = Wprowadzanie.text.toString()
            var potwierdzeniehasla = Potwierdzanie.text.toString()
            if (haslo.isEmpty() && potwierdzeniehasla.isEmpty()) {
                Wprowadzanie.error = ("Pole nie moze byc puste")
                Potwierdzanie.error = ("Pole nie moze byc puste")
            } else {
                if (haslo == potwierdzeniehasla) {
                    Zgodnosc.isChecked = haslo.any()
                }
                if (haslo.any { it.isUpperCase() } && potwierdzeniehasla.any { it.isUpperCase() }) {
                    WielkaLitera.isChecked = haslo.any()
                }
                if (haslo.any { it.isLowerCase() } && potwierdzeniehasla.any { it.isLowerCase() }) {
                    MalaLitera.isChecked = haslo.any()
                }
                if (haslo.any { it.isDigit() } && potwierdzeniehasla.any { it.isDigit() }) {
                    Cyfra.isChecked = haslo.any()
                }
                if (haslo.any { !it.isLetterOrDigit() } && potwierdzeniehasla.any { !it.isLetterOrDigit() }) {
                    ZnakSpec.isChecked = haslo.any()
                }
                if ( WielkaLitera.isChecked && MalaLitera.isChecked && Cyfra.isChecked && ZnakSpec.isChecked) {
                    val komunikat = android.app.AlertDialog.Builder(this)
                    komunikat.setTitle("Has??o spe??nia wymagania")
                    komunikat.setMessage("Has??o spe??nia wymagania, mo??esz z niego bezpiecznie korzysta??")
                    komunikat.setPositiveButton("OK", null)
                    komunikat.setNegativeButton("Odrzuc", null)
                    komunikat.show()
                    Zgodnosc.isChecked=x.any()

                } else
                {
                    val komunikat = android.app.AlertDialog.Builder(this)
                    komunikat.setTitle("Has??o nie spe??nia wymaga??")
                    komunikat.setMessage("Has??o nie spe??nia wymaga?? i nie jest bezpieczne podczas u??ywania")
                    komunikat.setPositiveButton("OK", null)
                    komunikat.setNegativeButton("Odrzuc", null)
                    komunikat.show()
                    Zgodnosc.isChecked=x.any()
                }
            }
        }
    }
}