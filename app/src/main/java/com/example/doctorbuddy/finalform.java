package com.example.doctorbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class finalform extends AppCompatActivity {

    Button btlgo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalform);

        btlgo=(Button)findViewById(R.id.btff);

        btlgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(finalform.this,"Logged Out",Toast.LENGTH_LONG).show();

                Intent ik=new Intent(finalform.this,MainActivity.class);
                startActivity(ik);
            }
        });


    }

    public void onBackPressed() {
    }
}
