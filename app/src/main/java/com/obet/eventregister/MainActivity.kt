package com.obet.eventregister
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val satu = findViewById<EditText>(R.id.etSatu)
        val dua = findViewById<EditText>(R.id.etDua)
        val jumlahView = findViewById<EditText>(R.id.etJumlah)
        val tombol = findViewById<Button>(R.id.btnHitung)
        tombol.setOnClickListener {
            val teksSatu = satu.text.toString().trim()
            val teksDua = dua.text.toString().trim()

            /* TODO-01: konversi aman ke Int? */ null
            val jumlah: Int? = jumlahView.text.toString().trim().toIntOrNull()
            // TODO-02: validasi kedua String tidak kosong; beri error dan hentikan proses
            if (teksSatu.isEmpty()) {
                                satu.error = "Field ini tidak boleh kosong"
                                return@setOnClickListener
                            }
                            if (teksDua.isEmpty()) {
                                dua.error = "Field ini tidak boleh kosong"
                                return@setOnClickListener
                            }
            // TODO-03: validasi Int dalam rentang 1..10; beri error dan hentikan proses
            if (jumlah == null || jumlah !in 1..10) {
                            jumlahView.error = "ERPR!"
                                return@setOnClickListener
                                }
            // FIXME-04: hitung dengan operasi perkalian Int
            val tarif: Int = 75000
            val total: Int = tarif * jumlah

            // TODO-05: buat Explicit Intent menuju ResultActivity
            val intent = Intent(this, ResultActivity::class.java)

            // TODO-06: kirim teksSatu sebagai String
            // TODO-07: kirim teksDua sebagai String
            // TODO-08: kirim jumlah sebagai Intpackage com.obet.eventregister
                        intent.putExtra("EXTRA_SATU", teksSatu)   // String
                        intent.putExtra("EXTRA_DUA", teksDua)     // String
                        intent.putExtra("EXTRA_JUMLAH", jumlah)   // Int
                        intent.putExtra("EXTRA_TOTAL", total)     // Int

                        startActivity(intent)
        }
    }
}