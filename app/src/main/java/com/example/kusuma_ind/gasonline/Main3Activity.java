package com.example.kusuma_ind.gasonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    Button Regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Regbtn = (Button) findViewById(R.id.Regbtn);

        Regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main3Activity.this, Main5Activity.class);//halaman selanjutnya
                Toast.makeText(getApplicationContext(), "Sign Up Successfully", Toast.LENGTH_LONG).show();

                startActivity(i);

            }
        });
    }
}
