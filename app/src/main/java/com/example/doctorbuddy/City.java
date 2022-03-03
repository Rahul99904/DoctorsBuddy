package com.example.doctorbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class City extends AppCompatActivity {

    Button butmum;
    Button butpu;
    Button butkal;
    Button butth;
    Button butbh;
    Button butdom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        butmum=(Button)findViewById(R.id.btmum);
        butpu=(Button)findViewById(R.id.btpn);
        butkal=(Button)findViewById(R.id.btkl);
        butth=(Button)findViewById(R.id.btth);
        butbh=(Button)findViewById(R.id.btbh);
        butdom=(Button)findViewById(R.id.btdom);


        butmum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent io=new Intent(City.this,mumbai.class);
                startActivity(io);
            }
        });

        butpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(City.this,pune.class);
                startActivity(it);
            }
        });

        butkal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(City.this,kalyan.class);
                startActivity(it);
            }
        });

        butth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(City.this,pune.class);
                startActivity(it);
            }
        });

        butbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(City.this,kalyan.class);
                startActivity(it);
            }
        });

        butdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(City.this,mumbai.class);
                startActivity(it);
            }
        });

    }
}
