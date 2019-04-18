package com.lat2.lat2_akb12_10116515ridwanmaulana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Nama :Ridwan Maulana
        //Nim :10116515
        //AKB-12
        //Waktu Pengerjaan : 18 - 19 April 2019


        et = (TextView) findViewById(R.id.txre);
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

    }
}
