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

public class JawadAhmed extends AppCompatActivity {

    CardView classA, classB, timetable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jawad_ahmed);


        classA = findViewById(R.id.classa);
        classB = findViewById(R.id.classb);
        timetable = findViewById(R.id.timetable);



        classA.setOnClickListener(view -> {
            String url = "https://docs.google.com/spreadsheets/d/1sah5LWJnfoFx-i3TBrcw-0lBbMPmhKLxhQE1ehZFfh4/edit?gid=944295711#gid=944295711";
            Intent i = new Intent(JawadAhmed.this, web.class);
            i.putExtra("url", url);
            startActivity(i);
        });

        classB.setOnClickListener(view -> {
            String url = "https://docs.google.com/spreadsheets/d/1jHR-YKUr3D-GkJBw3KjWzNs53oOB-StpXoaWeAAMxd0/edit?gid=669755142#gid=669755142";
            Intent i = new Intent(JawadAhmed.this, web.class);
            i.putExtra("url", url);
            startActivity(i);
        });

        timetable.setOnClickListener(view -> {
            String url = "https://docs.google.com/spreadsheets/d/1KxIen31i7iHqPH7u-XEmRdPEusacF45whykKIkTMtk0/edit?gid=0#gid=0";
            Intent i = new Intent(JawadAhmed.this, web.class);
            i.putExtra("url", url);
            startActivity(i);
        });

    }
}