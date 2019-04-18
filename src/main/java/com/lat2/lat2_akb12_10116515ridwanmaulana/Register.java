package com.lat2.lat2_akb12_10116515ridwanmaulana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Nama :Ridwan Maulana
        //Nim :10116515
        //AKB-12
        //Waktu Pengerjaan : 18 - 19 April 2019


        btn = (Button) findViewById(R.id.btn_regiss);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, alm.class);
                Register.this.startActivity(intent);
                Register.this.finish();
            }
        });
    }
}
