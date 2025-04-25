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

public class Pervaiz extends AppCompatActivity {

    ImageButton b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pervaiz);


        b1 = findViewById(R.id.imageButton1);
        b2 = findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);






//---------------------Button---------------------
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSeNNvHUC11dziBcgWQxg0uZlywgn38ByXqTwlf6s8K-o1Sfpw/viewform";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1GoYirQ7UiljuXoUPSwciHbGCaU_WYYznVlvGEF5YBIY/edit?resourcekey=&gid=110396022#gid=110396022";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSffU-uD5I2nkbA9EHKsCNq4emdODzUDIi0OODI_yNNEpSWOjg/viewform";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1WR4StvtF-KcyIFS6SjzscSA2D6yZWs-gc2LajLGMg00/edit?gid=1644940182#gid=1644940182";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

    }
}