package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class total extends AppCompatActivity {

    TextView bmrResult, tdeeResult, energyResult;
    Button reCalBtn, goHomeBtn, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        bmrResult = findViewById(R.id.textView10);
        tdeeResult = findViewById(R.id.textView12);
        energyResult = findViewById(R.id.textView14);
        reCalBtn = findViewById(R.id.recal);
        goHomeBtn = findViewById(R.id.goHome);
        back = findViewById(R.id.back4Btn);

        DecimalFormat frm = new DecimalFormat("#####");

        final SharedPreferences sp = this.getSharedPreferences("shared", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        bmrResult.setText(frm.format(Double.parseDouble(sp.getString("_score", "No BMR values"))));
        tdeeResult.setText(frm.format(Double.parseDouble(sp.getString("_tDee", "No TDEE values"))));
        energyResult.setText(frm.format(Double.parseDouble(sp.getString("_energy", "No recommend energy/day values"))));

        reCalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BMR.class);
                startActivity(intent);
            }
        });

        goHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), totalBMRTDEE.class);
                startActivity(intent);
            }
        });
    }
}