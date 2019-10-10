package com.example.addressoffmyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView checkout,userName,officeAddress,bittllToSameAddress;
   // Toolbar toolBar;
    EditText phoneNumber,email;
    Button editButton1,editButton2;
    ImageView locationImageIcon,billImagIcon,phoneNumberImageIcon,emailImageIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        startActivity( new Intent(MainActivity.this,DarazBondhuProgram.class));
        finish();

//
//           toolBar =findViewById(R.id.toolbar);
//            toolBar.setTitle("Checkout");


            userName= findViewById(R.id.username);
            officeAddress= findViewById(R.id.officeaddress);
            bittllToSameAddress=findViewById(R.id.billtosameaddress);


            phoneNumber= findViewById(R.id.phonenumber);
            email= findViewById(R.id.email);


            editButton1=(Button)findViewById(R.id.btn1);
            editButton2=(Button)findViewById(R.id.btn2);

            locationImageIcon=(ImageView)findViewById(R.id.locationimageicon);
            billImagIcon=(ImageView)findViewById(R.id.billimageicon);
            phoneNumberImageIcon=(ImageView)findViewById(R.id.phonenumberimageicon);
            emailImageIcon=(ImageView)findViewById(R.id.emailimageicon);


    }

}
