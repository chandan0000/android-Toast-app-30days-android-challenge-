package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button  byDefaultToast,simpleToast,nestedToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        byDefaultToast=findViewById(R.id.byDefault);
        simpleToast=findViewById(R.id.simpleToast);
        nestedToast=findViewById(R.id.nestedGravity);
        byDefaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(view v){
                Toast.makeText(MainActivity.this,"by default Toast",Toast.LENGTH_SHORT).show();

            }


        });
        simpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(view v){
                Toast toast =Toast.makeText(MainActivity.this, "simple Toast",Toast.LENGTH_LONG);
                toast.setGravity(gravity.CENTER);
                toast.show();

            }


        });        nestedToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(view v){
                Toast toast =Toast.makeText(MainActivity.this, "simple Toast",Toast.LENGTH_LONG);
                toast.setGravity(gravity.BOTTOM | Gravity.RIGHT);
                toast.show();

            }


        });
    }
}