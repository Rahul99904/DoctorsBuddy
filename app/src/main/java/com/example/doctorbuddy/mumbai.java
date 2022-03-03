package com.example.doctorbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mumbai extends AppCompatActivity {
    Button btmumgenjj;
    Button btmumgensi;
    Button btmumgenli;
    Button btmumgenfor;
    Button btmumgenhin;
    Button btmumgenkda;
    Button btmumspett;
    Button btmumspeap;
    Button btmumspekr;
    Button btmumspesin;
    Button btmumspehcg;
    Button btmumspesun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);

        btmumgenjj=(Button)findViewById(R.id.btmumgnjj);
        btmumgensi=(Button)findViewById(R.id.btmumgnsi);
        btmumgenli=(Button)findViewById(R.id.btmumgnll);
        btmumgenfor=(Button)findViewById(R.id.btmumgnft);
        btmumgenhin=(Button)findViewById(R.id.btmumgnhj);
        btmumgenkda=(Button)findViewById(R.id.btmumgnkda);
        btmumspett=(Button)findViewById(R.id.btmumsptt);
        btmumspeap=(Button)findViewById(R.id.btmumspap);
        btmumspekr=(Button)findViewById(R.id.btmumspkc);
        btmumspesin=(Button)findViewById(R.id.btmumspsv);
        btmumspehcg=(Button)findViewById(R.id.btmumsphcg);
        btmumspesun=(Button)findViewById(R.id.btmumsps);

        btmumgenjj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent io=new Intent(mumbai.this,JJ.class);
                startActivity(io);
            }
        });

        btmumspett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent ig=new Intent(mumbai.this,TCAN.class);
                 startActivity(ig);
            }
        });

        btmumgensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,JJ.class);
                startActivity(ig);
            }
        });

        btmumgenli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,JJ.class);
                startActivity(ig);
            }
        });

        btmumgenfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,JJ.class);
                startActivity(ig);
            }
        });

        btmumgenhin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,JJ.class);
                startActivity(ig);
            }
        });

        btmumgenkda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,JJ.class);
                startActivity(ig);
            }
        });

        btmumspeap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,TCAN.class);
                startActivity(ig);
            }
        });

        btmumspekr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,TCAN.class);
                startActivity(ig);
            }
        });

        btmumspesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,TCAN.class);
                startActivity(ig);
            }
        });

        btmumspehcg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,TCAN.class);
                startActivity(ig);
            }
        });

        btmumspesun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ig=new Intent(mumbai.this,TCAN.class);
                startActivity(ig);
            }
        });
    }
}
