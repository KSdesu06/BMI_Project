package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BMR extends AppCompatActivity {

    Button myMale, myFemale, myCalculate1, myBack;
    EditText myHeight, myWeight, myAge;
    String typeOfUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmr);

        myMale = findViewById(R.id.maleBtn);
        myFemale = findViewById(R.id.femaleBtn);
        myWeight = findViewById(R.id.weightInput);
        myHeight = findViewById(R.id.heightInput);
        myAge = findViewById(R.id.ageInput);
        myCalculate1 = findViewById(R.id.calculate1);
        myBack = findViewById(R.id.back1Btn);

        final SharedPreferences sp = this.getSharedPreferences("shared", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        myMale.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button f = (Button) findViewById(R.id.femaleBtn);
                Button m = (Button) findViewById(R.id.maleBtn);
                typeOfUser = "ผู้ชาย";
                if (typeOfUser == "ผู้ชาย") {
                    m.setBackgroundColor(R.color.orange_1);
                    f.setBackgroundColor(Color.GRAY);
                } else if (typeOfUser == "ผู้หญิง"){
                    m.setBackgroundColor(Color.GRAY);
                    f.setBackgroundColor(R.color.orange_1);
                }
            }
        });

        myFemale.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button f = (Button) findViewById(R.id.femaleBtn);
                Button m = (Button) findViewById(R.id.maleBtn);
                typeOfUser = "ผู้หญิง";
                if (typeOfUser == "ผู้ชาย") {
                    m.setBackgroundColor(R.color.orange_1);
                    f.setBackgroundColor(Color.GRAY);
                } else if (typeOfUser == "ผู้หญิง"){
                    m.setBackgroundColor(Color.GRAY);
                    f.setBackgroundColor(R.color.orange_1);
                }
            }
        });

        myCalculate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //setError
                if (typeOfUser.equals("") && myWeight.getText().toString().equals("") && myHeight.getText().toString().equals("") && myAge.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ข้อมูลสำหรับการคำนวณ BMR", Toast.LENGTH_SHORT).show();
                else if (typeOfUser.equals(""))
                    Toast.makeText(getApplicationContext(), "กรุณาเลือกเพศ", Toast.LENGTH_SHORT).show();
                else if (myWeight.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "กรุณาใส่น้ำหนักของคุณ", Toast.LENGTH_SHORT).show();}
                else if (myHeight.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "กรุณาใส่ส่วนสูงของคุณ", Toast.LENGTH_SHORT).show();}
                else if (myAge.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "กรุณาใส่อายุของคุณ", Toast.LENGTH_SHORT).show();}
                else {
                    double score = 0;
                    float weight = Integer.parseInt(myWeight.getText().toString());
                    float height = Integer.parseInt(myHeight.getText().toString());
                    int age = Integer.parseInt(myAge.getText().toString());
                    typeOfUser="ผู้ชาย";

                    if (typeOfUser.equals("ผู้ชาย")) {
                        score = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
                    }
                    else {
                        score = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
                    }
                    editor.putString("_score", String.valueOf(score));
                    editor.putFloat("_weight", weight);
                    editor.commit();

                    Intent intent = new Intent(getApplicationContext(), TDEE.class);
                    startActivity(intent);
                }
            }
        });

        myBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}