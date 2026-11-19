package com.obet.eventregister

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result_activity)
        val ringkasan = findViewById<TextView>(R.id.tvRingkasan)
        val totalView = findViewById<TextView>(R.id.tvTotal)
        val satu: String = intent.getStringExtra("EXTRA_SATU") ?: ""// TODO-11: terima String pertama
        val dua: String = intent.getStringExtra("EXTRA_DUA") ?: "" // TODO-12: terima String kedua
        val jumlah: Int = intent.getIntExtra("EXTRA_JUMLAH", 0)// TODO-13: terima Int (bukan getStringExtra)
        val total: Int = intent.getIntExtra("EXTRA_TOTAL", 0) // TODO-14: terima Int total
        ringkasan.text = "Nama: $satu\nEvent: $dua\nJumlah tiket: $jumlah" // TODO-15: tampilkan String dan jumlah pada ringkasan
        totalView.text = "Total: Rp $total" // TODO-16: tampilkan total (konversi Int ke teks hanya di UI)
    }
}
