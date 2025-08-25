package com.AdeebTechLab.BSIS.Class.Attendance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Pervaiz extends AppCompatActivity {

    ImageButton b1, b2, b3, b4, b5, b6;
    CardView classA, classB, timetable;

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
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSfuRsalMmqbV82CasbsNzzUW2e4KBesy6FmJZU6nVbyKmeoPQ/viewform";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1sah5LWJnfoFx-i3TBrcw-0lBbMPmhKLxhQE1ehZFfh4/edit?gid=944295711#gid=944295711";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/forms/d/e/1FAIpQLSf7Y8aEEss7w4qJy9ZSNA7oiMra6i_B6fwfW-aXvKb0lSc-cw/viewform";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });

//---------------------Button---------------------
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://docs.google.com/spreadsheets/d/1jHR-YKUr3D-GkJBw3KjWzNs53oOB-StpXoaWeAAMxd0/edit?gid=669755142#gid=669755142";
                Intent i = new Intent(Pervaiz.this, web.class);
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        timetable.setOnClickListener(view -> {
            String url = "https://docs.google.com/spreadsheets/d/1KxIen31i7iHqPH7u-XEmRdPEusacF45whykKIkTMtk0/edit?gid=0#gid=0";
            Intent i = new Intent(Pervaiz.this, web.class);
            i.putExtra("url", url);
            startActivity(i);
        });

    }
}