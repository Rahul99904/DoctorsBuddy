package com.example.doctorbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class JJ extends AppCompatActivity {

    Button nextjj;
    RadioButton rbjbp;
    RadioButton rbjbr;
    RadioButton rbjhs;
    RadioButton rbjhi;
    RadioButton rbjhal;
    RadioButton rbjhak;
    RadioButton rbjgm;
    RadioButton rbjgp;
    RadioGroup radioGroupjj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jj);


        nextjj=(Button)findViewById(R.id.btjjnext);


        rbjbp=(RadioButton)findViewById(R.id.rbjjbp);
        rbjbr=(RadioButton)findViewById(R.id.rbjjbr);
        rbjhs=(RadioButton)findViewById(R.id.rbjjhs);
        rbjhi=(RadioButton)findViewById(R.id.rbjjhi);
        rbjhal=(RadioButton)findViewById(R.id.rbjjhal);
        rbjhak=(RadioButton)findViewById(R.id.rbjjhab);
        rbjgm=(RadioButton)findViewById(R.id.rbjjgm);
        rbjgp=(RadioButton)findViewById(R.id.rbjjgp);
        radioGroupjj=(RadioGroup)findViewById(R.id.rgbone);


        nextjj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(radioGroupjj.getCheckedRadioButtonId()!=-1) {

                    String doctors=((RadioButton)findViewById(radioGroupjj.getCheckedRadioButtonId())).getText().toString();

                    Intent in = new Intent(JJ.this, JJFORM.class);
                    in.putExtra("select", doctors);
                    startActivity(in);

                }



                else{

                    Toast.makeText(JJ.this,"Please Select Doctor",Toast.LENGTH_LONG).show();
                }









            }
        });

    }
}
