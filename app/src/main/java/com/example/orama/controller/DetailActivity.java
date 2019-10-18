package com.example.orama.controller;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.orama.R;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView fullname, description;
    ImageView imagelogo;

            public void onCreate(Bundle savedInstance){
                super.onCreate(savedInstance);
                setContentView(R.layout.activity_detail);

                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                imagelogo = findViewById(R.id.iv_logo);
                fullname = findViewById(R.id.tv_fullname);
                description = findViewById(R.id.tv_details);

                String imgLogo = getIntent().getExtras().getString("logo");
                String strFullname = getIntent().getExtras().getString("name");
                String strObjective = getIntent().getExtras().getString("desc");

                fullname.setText(strFullname);
                description.setText(strObjective);
                Picasso.with(this)
                        .load("https://s3.amazonaws.com/orama-media/"+imgLogo)
                        .placeholder(R.drawable.logo_orama)
                        .into(imagelogo);

                getSupportActionBar().setTitle("Detalhes do Fundo");

            }

}
