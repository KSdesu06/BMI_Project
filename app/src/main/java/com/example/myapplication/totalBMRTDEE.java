package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class totalBMRTDEE extends AppCompatActivity {

    EditText target, myDays;
    Button cal3, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_totalbmrtdee);

        target = findViewById(R.id.targetWeight);
        myDays = findViewById(R.id.days);
        cal3 = findViewById(R.id.calculate3);
        back = findViewById(R.id.back3Btn);

        final SharedPreferences sp = this.getSharedPreferences("shared", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        cal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (target.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(), "กรุณาใส่น้ำหนักตัวที่ต้องการลด", Toast.LENGTH_SHORT).show();
                else if (myDays.getText().toString().equals(""))
                    Toast.makeText(getApplicationContext(), "กรุณาใส่จำนวนวัน", Toast.LENGTH_SHORT).show();
                else {
                    float weight = Float.parseFloat(target.getText().toString());
                    int day = Integer.parseInt(myDays.getText().toString());
                    double energy = Double.parseDouble(sp.getString("_tDee", "0")) - ((7700*(sp.getFloat("_weight", 0)-weight)/day));

                    editor.putString("_energy", String.valueOf(energy));
                    editor.commit();
                    Intent intent = new Intent(getApplicationContext(), total.class);
                    startActivity(intent);
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TDEE.class);
                startActivity(intent);
            }
        });
    }
}