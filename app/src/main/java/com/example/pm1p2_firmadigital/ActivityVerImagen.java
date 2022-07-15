package com.example.pm1p2_firmadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ActivityVerImagen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_imagen);
        setTitle("Imagen de la firma");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setImageBitmap(ActivityListado.enviar());
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}