package com.AdeebTechLab.BSIS.Class.Attendance;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginbt, infobt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username=findViewById(R.id.UserName);
        password=findViewById(R.id.Password);
        loginbt=findViewById(R.id.button2);
        infobt=findViewById(R.id.button1);



//------------Button----------------------------------------

        infobt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, info.class);
                startActivity(intent);

            }
        });



       loginbt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (username.getText().toString().equals("Adeeb") && password.getText().toString().equals("3121")) {
                   Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                   Intent i = new Intent(MainActivity.this, SalmanAdeeb.class);
                   startActivity(i);
               } else if (username.getText().toString().equals("RK") && password.getText().toString().equals("123"))
               {
                   Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                   Intent i = new Intent(MainActivity.this, Rakish.class);
                   startActivity(i);

               } else {
                   Toast.makeText(MainActivity.this, "login Failed!", Toast.LENGTH_SHORT).show();
               }
           }
       });

    }
}