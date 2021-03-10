package com.example.submissionandroidpemula

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailRumahSakit : AppCompatActivity() {

    companion object {
        const val EXTRA_RS = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        supportActionBar?.title="Detail Rumah Sakit"


        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_rs)
        val position = intent.getIntExtra(EXTRA_RS, 0)
        val rs : RumahSakit = RumahSakitData.listData[position]

        val tvGambarrs: ImageView = findViewById(R.id.img_item_photo)
        val tvNamars: TextView = findViewById(R.id.detail_nama_rs)
        val tvAlamatrs: TextView = findViewById(R.id.detail_alamat_rs)
        val tvTeleponrs: TextView = findViewById(R.id.detail_telepon_rs)
        val tvKodeposrs: TextView = findViewById(R.id.detail_kodepos_rs)
        val tvFaxrs: TextView = findViewById(R.id.detail_fax_rs)
        val tvEmailrs: TextView = findViewById(R.id.detail_email_rs)
        val tvTentangrs: TextView = findViewById(R.id.detail_tentang_rs)

        /*val tvFavorite: Button = findViewById(R.id.btn_set_favorite)
        val tvShare: Button = findViewById(R.id.btn_set_share)*/

        val nama = rs.nama
        val alamat = rs.alamat
        val kodepos = rs.kodepos
        val telepon = rs.telepon
        val fax = rs.fax
        val email = rs.email
        val tentang = rs.tentang
        val photo = rs.photo

        Glide.with(this)
                .load(photo)
                .into(tvGambarrs)
        tvNamars.text = nama
        tvAlamatrs.text = alamat
        tvTeleponrs.text = telepon
        tvKodeposrs.text = kodepos
        tvFaxrs.text = fax
        tvEmailrs.text = email
        tvTentangrs.text = tentang

        /*tvFavorite.setOnClickListener { Toast.makeText(this, " $nama ditambahkan ke favorite", Toast.LENGTH_SHORT).show() }

        tvShare.setOnClickListener { Toast.makeText(this, " $nama telah dibagikan", Toast.LENGTH_SHORT).show() }*/

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

}