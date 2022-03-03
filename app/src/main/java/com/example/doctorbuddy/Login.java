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

public class Login extends AppCompatActivity {

    EditText edlliun,edllipa;
    Button btllig;
    DatabaseHelper ddb;

    private AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edlliun=(EditText)findViewById(R.id.edliun);
        edllipa=(EditText)findViewById(R.id.edlipa);
        btllig=(Button)findViewById(R.id.btlg);

        awesomeValidation=new AwesomeValidation(ValidationStyle.BASIC);

        ddb=new DatabaseHelper(this);

        awesomeValidation.addValidation(this, R.id.edliun, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);


        btllig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (awesomeValidation.validate()) {


                String name=edlliun.getText().toString();
                String pass=edllipa.getText().toString();
                if(name.equals("")||pass.equals("")){
                    Toast.makeText(getApplicationContext(),"Please fill the credentials",Toast.LENGTH_LONG).show();
                }
                else{

                    Boolean login=ddb.login(name,pass);
                    if (login==true){
                        Toast.makeText(getApplicationContext(),"LogIn Successfull",Toast.LENGTH_LONG).show();
                        Intent in=new Intent( Login.this,City.class);
                        startActivity(in);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Login Unsuccessfull",Toast.LENGTH_LONG).show();
                    }}

            }}
        });
    }
}
