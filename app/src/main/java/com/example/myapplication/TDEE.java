package com.example.myapplication;

import static com.example.myapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TDEE extends AppCompatActivity {

    Button act1, act2, act3, act4, act5, cal2, myBack;
    String typeofAct = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_tdee);

        act1 = findViewById(id.activity1);
        act2 = findViewById(id.activity2);
        act3 = findViewById(id.activity3);
        act4 = findViewById(id.activity4);
        act5 = findViewById(id.activity5);
        cal2 = findViewById(id.calculate2);
        myBack = findViewById(id.back2Btn);

        final SharedPreferences sp = this.getSharedPreferences("shared", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sp.edit();

        //set button color when user click the button.
        act1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button a = (Button) findViewById(id.activity1); // a is activity1
                Button b = (Button) findViewById(id.activity2); // b is activity2
                Button c = (Button) findViewById(id.activity3); // c is activity3
                Button d = (Button) findViewById(id.activity4); // d is activity4
                Button e = (Button) findViewById(id.activity5); // e is activity5
                typeofAct = "นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย";
                switch(typeofAct) {
                    case "นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย":
                        a.setBackgroundColor(color.orange_1);
                        b.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน":
                        b.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน":
                        c.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        b.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน":
                        d.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนักมาก ทุกวันเช้า และเย็น":
                        e.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        break;
                }
            }
        });

        act2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button a = (Button) findViewById(id.activity1);
                Button b = (Button) findViewById(id.activity2);
                Button c = (Button) findViewById(id.activity3);
                Button d = (Button) findViewById(id.activity4);
                Button e = (Button) findViewById(id.activity5);
                typeofAct = "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน";
                switch(typeofAct) {
                    case "นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย":
                        a.setBackgroundColor(color.orange_1);
                        b.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน":
                        b.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน":
                        c.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        b.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน":
                        d.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนักมาก ทุกวันเช้า และเย็น":
                        e.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        break;
                }
            }
        });

        act3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button a = (Button) findViewById(id.activity1);
                Button b = (Button) findViewById(id.activity2);
                Button c = (Button) findViewById(id.activity3);
                Button d = (Button) findViewById(id.activity4);
                Button e = (Button) findViewById(id.activity5);
                typeofAct = "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน";
                switch(typeofAct) {
                    case "นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย":
                        a.setBackgroundColor(color.orange_1);
                        b.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน":
                        b.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน":
                        c.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        b.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน":
                        d.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนักมาก ทุกวันเช้า และเย็น":
                        e.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        break;
                }
            }
        });

        act4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button a = (Button) findViewById(id.activity1);
                Button b = (Button) findViewById(id.activity2);
                Button c = (Button) findViewById(id.activity3);
                Button d = (Button) findViewById(id.activity4);
                Button e = (Button) findViewById(id.activity5);
                typeofAct = "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน";
                switch(typeofAct) {
                    case "นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย":
                        a.setBackgroundColor(color.orange_1);
                        b.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน":
                        b.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน":
                        c.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        b.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน":
                        d.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนักมาก ทุกวันเช้า และเย็น":
                        e.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        break;
                }
            }
        });

        act5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                Button a = (Button) findViewById(id.activity1);
                Button b = (Button) findViewById(id.activity2);
                Button c = (Button) findViewById(id.activity3);
                Button d = (Button) findViewById(id.activity4);
                Button e = (Button) findViewById(id.activity5);
                typeofAct = "ออกกำลังกายหรือเล่นกีฬาอย่างหนักมาก ทุกวันเช้า และเย็น";
                switch(typeofAct) {
                    case "นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย":
                        a.setBackgroundColor(color.orange_1);
                        b.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน":
                        b.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน":
                        c.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        b.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน":
                        d.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        e.setBackgroundColor(Color.GRAY);
                        break;
                    case "ออกกำลังกายหรือเล่นกีฬาอย่างหนักมาก ทุกวันเช้า และเย็น":
                        e.setBackgroundColor(color.orange_1);
                        a.setBackgroundColor(Color.GRAY);
                        c.setBackgroundColor(Color.GRAY);
                        d.setBackgroundColor(Color.GRAY);
                        a.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        break;
                }
            }
        });

        cal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (typeofAct.equals(""))
                    Toast.makeText(getApplicationContext(), "กรุณาเลือกกิจกรรมที่ทำทุกวัน", Toast.LENGTH_SHORT).show();
                else {
                    double tdee = 0;
                    double bmr = Double.parseDouble(sp.getString("_score", "0"));
                    if (typeofAct.equals("นั่งทำงานอยู่กับที่ และไม่ได้ออกกำลังกายเลย")) {
                        tdee = bmr * 1.2;
                    } else if (typeofAct.equals("ออกกำลังกายหรือเล่นกีฬาเล็กน้อย ประมาณอาทิตย์ละ 1-3 วัน")) {
                        tdee = bmr * 1.375;
                    } else if (typeofAct.equals("ออกกำลังกายหรือเล่นกีฬาปานกลาง ประมาณอาทิตย์ละ 1-3 วัน")) {
                        tdee = bmr * 1.55;
                    } else if (typeofAct.equals("ออกกำลังกายหรือเล่นกีฬาอย่างหนัก ประมาณอาทิตย์ละ 6-7 วัน")) {
                        tdee = bmr * 1.725;
                    } else {
                        tdee = bmr * 1.9;
                    }
                    editor.putString("_tDee", String.valueOf(tdee));
                    editor.apply();
                    Intent intent = new Intent(getApplicationContext(), totalBMRTDEE.class);
                    startActivity(intent);
                }
            }
        });

        myBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), BMR.class);
                startActivity(intent);
            }
        });


    }
}