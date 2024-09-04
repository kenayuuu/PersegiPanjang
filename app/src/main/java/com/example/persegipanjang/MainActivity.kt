package com.example.persegipanjang

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Deklarasikan variabel untuk elemen UI
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var etTinggi: EditText
    private lateinit var btnHitung: Button
    private lateinit var tvLuasPermukaan: TextView
    private lateinit var tvVolume: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi view
        etPanjang = findViewById(R.id.etPanjang)
        etLebar = findViewById(R.id.etLebar)
        etTinggi = findViewById(R.id.etTinggi)
        btnHitung = findViewById(R.id.btnHitung)
        tvVolume = findViewById(R.id.tvVolume)
        tvLuasPermukaan = findViewById(R.id.tvLuasPermukaan)
        // ... dan seterusnya

        btnHitung.setOnClickListener {
            // Ambil nilai panjang, lebar, dan tinggi dari EditText
            val panjang = etPanjang.text.toString().toDoubleOrNull() ?: 0.0
            val lebar = etLebar.text.toString().toDoubleOrNull() ?: 0.0
            val tinggi = etTinggi.text.toString().toDoubleOrNull() ?: 0.0

            // Hitung luas permukaan dan volume
            val luasPermukaan = (2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)))
            val volume = panjang * lebar * tinggi

            // Tampilkan hasil
            tvLuasPermukaan.text = "Luas Permukaan: $luasPermukaan"
            tvVolume.text = "Volume: $volume"
        }
    }
}