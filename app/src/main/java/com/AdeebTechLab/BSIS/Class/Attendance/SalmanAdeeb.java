package com.AdeebTechLab.BSIS.Class.Attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SalmanAdeeb extends AppCompatActivity {


    ImageButton b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salman_adeeb);



        b1 = findViewById(R.id.imageButton1);
        b2 = findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);
        b5 = findViewById(R.id.imageButton5);
        b6 = findViewById(R.id.imageButton6);






//---------------------Button---------------------
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfmqRfDpYok7dy7vqLsdvMip1v3Sfo5ZSDeW8q-DxQ688UAeQ/viewform";
                Intent i = new Intent(SalmanAdeeb.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1xA2nhLpNCwmmj2LslWqesUT6jHm5ABoVlDRjTD6REvQ/edit?resourcekey#gid=438930888";
                Intent i = new Intent(SalmanAdeeb.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSc2xxcjc6ooazdK2BG5-C-0fJy5U_bU7aW1_qNY-hjmi0ca9A/viewform";
                Intent i = new Intent(SalmanAdeeb.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1_NMt9ETRRFV_z0gNcWM1z2OHns9SRaCOqyXjtJ0uGjU/edit?usp=sharing";
                Intent i = new Intent(SalmanAdeeb.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfDUdJsfaCEjl8biXaaY1paWzgVY2EGQT4-bx8wT8SYmWzOFg/viewform";
                Intent i = new Intent(SalmanAdeeb.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1DRWRMsLpqJWB-kH5HAM3uq8_QgOb_O5hPAOBsmbjNGw/edit?usp=sharing";
                Intent i = new Intent(SalmanAdeeb.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });



    }
}