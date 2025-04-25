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

public class ShabeerAhmed extends AppCompatActivity {

    ImageButton b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shabeer_ahmed);


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
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfUIdqRV1bngHUmPgtmwy9GmAZhC4GAJmx2BOSqfVsluzEL3Q/viewform";
                Intent i = new Intent(ShabeerAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1Vo0lamzYJ6PwhqFDgF70UglMCDUZXJHkgRLCdbrKHoM/edit?usp=sharing";
                Intent i = new Intent(ShabeerAhmed.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });




    }
}