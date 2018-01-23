package com.example.kusuma_ind.gasonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements OnCheckedChangeListener {

        RadioButton rb1,rb2;
        RadioGroup rg1,rg2;
        Button Confbtn , Signoutbtn;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_order);

            rg1 = (RadioGroup)findViewById(R.id.rg1);
            rg2 = (RadioGroup)findViewById(R.id.rg2);
            rb1 = (RadioButton)findViewById(R.id.rb3kg);
            rb2 = (RadioButton)findViewById(R.id.rb12kg);
            Confbtn = (Button)findViewById(R.id.Confbtn);
            Signoutbtn = (Button)findViewById(R.id.Signoutbtn);
            rg1.setOnCheckedChangeListener(this);
            rg2.setOnCheckedChangeListener(this);
        }

        //fungsi click radiobutton
    public void onCheckedChanged(RadioGroup group,
                                 int checkedId) {
        if(checkedId==R.id.rb3kg)
        {
            Toast.makeText(this, "Anda Membeli Gas 3 Kg", Toast.LENGTH_SHORT).show();//notif gas 3kg

        }
        if(checkedId==R.id.rb12kg)
        {
            Toast.makeText(this, "Anda Membeli Gas 12 Kg", Toast.LENGTH_SHORT).show();//notif gas 12kg
        }
        if(checkedId==R.id.rbgalon)
        {
            Toast.makeText(this, "Anda Membeli Aqua Galon 19L", Toast.LENGTH_SHORT).show();//notif galon
        }

         //fungsi button konfirmasi pemesanan
        Confbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OrderActivity.this, MapsActivity.class);//halaman selanjutnya

                startActivity(i);

            }
        });

        Signoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OrderActivity.this, LoginActivity.class);//halaman selanjutnya

                startActivity(i);

            }
        });
    }
    //fungsi untuk radiobutton **belum tau fungsi nya untuk apa
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
