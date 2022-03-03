package com.example.doctorbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.google.common.collect.Range;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class JJFORM extends AppCompatActivity {

    Button btreg;
    EditText ednamejj;
    EditText edemailjj;
    RadioGroup rggenderjj;
    EditText edbloodjj;
    RadioGroup rgcatjj;
    RadioGroup rgtpjj;
    EditText ediywjj;
    EditText edaddjj;
    EditText edagejj;
    EditText eddobjj;
    EditText edmdjj;
    EditText edinjj;
    RadioGroup rgpcjj;
    RadioGroup rgmsjj;
    EditText edmnjj;

    private AwesomeValidation awesomeValidation;


    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjform);

        awesomeValidation=new AwesomeValidation(ValidationStyle.BASIC);

        btreg=(Button)findViewById(R.id.btregjj);
        ednamejj=(EditText)findViewById(R.id.edjjname);
        edemailjj=(EditText)findViewById(R.id.edjjemail);
        rggenderjj=(RadioGroup)findViewById(R.id.rgjjgen);
        edbloodjj=(EditText)findViewById(R.id.edjjbg);
        rgcatjj=(RadioGroup)findViewById(R.id.rgjjtb);
        rgtpjj=(RadioGroup)findViewById(R.id.rgjjtp);
        ediywjj=(EditText)findViewById(R.id.edjjtpw);
        edaddjj=(EditText)findViewById(R.id.edjjad);
        edagejj=(EditText)findViewById(R.id.edjjage);
        eddobjj=(EditText)findViewById(R.id.edjjdob);
        edmdjj=(EditText)findViewById(R.id.edjjmd);
        edinjj=(EditText)findViewById(R.id.edjjin);
        rgpcjj=(RadioGroup)findViewById(R.id.rgjjpc);
        rgmsjj=(RadioGroup)findViewById(R.id.rgjjms);
        edmnjj=(EditText)findViewById(R.id.edjjmb);

        awesomeValidation.addValidation(this, R.id.edjjname, "^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.edjjemail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
        //awesomeValidation.addValidation(this, R.id.edjjmb, "^[2-9]{2}[0-9]{8}$", R.string.mobileerror);
        awesomeValidation.addValidation(this, R.id.edjjage, Range.closed(05, 150), R.string.ageerror);
        awesomeValidation.addValidation(this, R.id.edjjdob, Range.closed(10, 500), R.string.weighterror);


        databaseReference= FirebaseDatabase.getInstance().getReference();


        btreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (awesomeValidation.validate()) {

                if(edmnjj.length()>0 & edinjj.length()>0 & eddobjj.length()>0 & edagejj.length()>0 & rgmsjj.getCheckedRadioButtonId()!=-1 & rggenderjj.getCheckedRadioButtonId()!=-1 & rgcatjj.getCheckedRadioButtonId()!=-1 & rgtpjj.getCheckedRadioButtonId()!=-1 & rgpcjj.getCheckedRadioButtonId()!=-1 ) {


                    String name = ednamejj.getText().toString();
                    String email = edemailjj.getText().toString();
                    String gender = ((RadioButton) findViewById(rggenderjj.getCheckedRadioButtonId())).getText().toString();
                    String blood = edbloodjj.getText().toString();
                    String cat = ((RadioButton) findViewById(rgcatjj.getCheckedRadioButtonId())).getText().toString();
                    String test = ((RadioButton) findViewById(rgtpjj.getCheckedRadioButtonId())).getText().toString();
                    String yes = ediywjj.getText().toString();
                    String address = edaddjj.getText().toString();
                    Integer age = Integer.parseInt(edagejj.getText().toString());
                    Integer dob = Integer.parseInt(eddobjj.getText().toString());
                    String medical = edmdjj.getText().toString();
                    Integer insurance = Integer.parseInt(edinjj.getText().toString());
                    String physical = ((RadioButton) findViewById(rgpcjj.getCheckedRadioButtonId())).getText().toString();
                    String marital = ((RadioButton) findViewById(rgmsjj.getCheckedRadioButtonId())).getText().toString();
                    Integer mobile = Integer.parseInt(edmnjj.getText().toString());

                    Bundle bn = getIntent().getExtras();
                    String doctor = bn.getString("select");

                    if(yes.equals("")){
                        Toast.makeText(JJFORM.this,"Enter N/A in the tests ",Toast.LENGTH_LONG).show();
                    }



                    if (  !TextUtils.isEmpty(name) & !TextUtils.isEmpty(email)  & !TextUtils.isEmpty(blood)   & !TextUtils.isEmpty(address) & !TextUtils.isEmpty(medical) ) {




                        String id = databaseReference.push().getKey();

                        FORMS SIGN = new FORMS(id, name, email, gender, blood, cat, test, yes, address, age, dob, medical, insurance, physical, marital, mobile,doctor );

                        databaseReference.child(id).setValue(SIGN);

                        Toast.makeText(JJFORM.this, "REGISTERED SUCCESSFULLY", Toast.LENGTH_LONG).show();

                        Intent ip=new Intent(JJFORM.this,finalform.class);
                        startActivity(ip);



                    } else {
                        Toast.makeText(JJFORM.this, "Please fill the credentials ", Toast.LENGTH_LONG).show();

                    }
                }
                else{
                    Toast.makeText(JJFORM.this,"Please fill the credentials",Toast.LENGTH_LONG).show();
                }


                }}




            });

    }
}
