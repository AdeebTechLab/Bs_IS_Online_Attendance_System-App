package com.AdeebTechLab.BSIS.Class.Attendance;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
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
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("Adeeb") && pass.equals("121")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, SalmanAdeeb.class);
                    startActivity(i);
                } else if (user.equals("RK") && pass.equals("123")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Rakish.class);
                    startActivity(i);
                } else if (user.equals("Mech") && pass.equals("gct")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, Pervaiz.class);
                    startActivity(i);
                } else if (user.equals("Shabeer Ahmed") && pass.equals("848410")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, ShabeerAhmed.class);
                    startActivity(i);
                } else if (user.equals("jawadjatala") && pass.equals("Qwerty@123")) {
                    Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, JawadAhmed.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}