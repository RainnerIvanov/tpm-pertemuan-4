package com.example.tpm4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deskripsi extends AppCompatActivity {

    ImageView itemhero_iv_gambar;
    TextView itemhero_tv_nama, itemhero_tv_deskripsi;
    String nama,desc;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        itemhero_iv_gambar = findViewById(R.id.iv_gambar);
        itemhero_tv_nama = findViewById(R.id.tv_nama);
        itemhero_tv_deskripsi = findViewById(R.id.tv_deskripsi);
        nama = getIntent().getStringExtra("nama");
        desc = getIntent().getStringExtra("desc");
        image = getIntent().getIntExtra("image",0);
        itemhero_tv_nama.setText(nama);
        itemhero_tv_deskripsi.setText(desc);
        itemhero_iv_gambar.setImageResource(image);


    }
}
