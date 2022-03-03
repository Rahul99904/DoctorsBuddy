package com.example.doctorbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

public class MainActivity extends AppCompatActivity {

    EditText edsiun;
    EditText edsipa;
    Button btsi,btlli;
    DatabaseHelper myyddb;

    private AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        awesomeValidation=new AwesomeValidation(ValidationStyle.BASIC);

        edsiun=(EditText)findViewById(R.id.edun);
        edsipa=(EditText)findViewById(R.id.edpa);
        btsi=(Button)findViewById(R.id.btsi);
        btlli=(Button)findViewById(R.id.btli);

        awesomeValidation.addValidation(this, R.id.edun, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);


        myyddb=new DatabaseHelper(this);

        btlli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent( MainActivity . this,Login.class);
                startActivity(i);

            }
        });


        btsi.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                if (awesomeValidation.validate()) {



                String name=edsiun.getText().toString().trim();
                String pass=edsipa.getText().toString().trim();
                if(name.equals("")|| pass.equals("")){
                    Toast.makeText(getApplicationContext(),"Please fill the credentials",Toast.LENGTH_LONG).show();
                }
                else {

                    Boolean insert= myyddb.insert(name,pass);
                    if (insert==true){
                        Toast.makeText(getApplicationContext(),"SignUp Successfull",Toast.LENGTH_LONG).show();

                        Intent in=new Intent( MainActivity.this,City.class);
                        startActivity(in);

                    }
                    else{
                        Toast.makeText(getApplicationContext(),"SignUp Unsuccessfull ",Toast.LENGTH_LONG).show();
                    }}



            }}
        });
    }

    public void onBackPressed() {
    }
}
