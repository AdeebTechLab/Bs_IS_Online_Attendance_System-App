package com.AdeebTechLab.BSIS.Class.Attendance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class JawadAhmed extends AppCompatActivity {

    ImageButton b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jawad_ahmed);


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
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfMvWaw1q57aKiLyW9QC-BWUk9ERJVHdJd-vekBtCld_9Aeqg/viewform";
                Intent i = new Intent(JawadAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1YtTutN66ijvNxGwJiON6zKvCtTvVJbjilSQZ6bHtAyc/edit?usp=sharing";
                Intent i = new Intent(JawadAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSd2429r_L8LoILItHiSHGHJQFAG4VJCyihPxZRXB1HKaS3wwQ/viewform";
                Intent i = new Intent(JawadAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1sX7f91XTuWsQ1CGHuKwRoNpaTQoaTwehet4iF3EH_QE/edit?usp=sharing";
                Intent i = new Intent(JawadAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSeBPZsZJMaakIn38_jx76aSlPqQHfroHr6mwlYnk3I308HzxQ/viewform";
                Intent i = new Intent(JawadAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1qotVPk9r9PswRb43XRDKNCmHejdPboAlHqmHcf5Smjo/edit?usp=sharing";
                Intent i = new Intent(JawadAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


    }
}