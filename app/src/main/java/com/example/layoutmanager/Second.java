package com.example.layoutmanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class Second extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    String name,reg,dept,edu,year;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        t1=findViewById(R.id.textView1);
        t2=findViewById(R.id.textView2);
        t3=findViewById(R.id.textView3);
        t4=findViewById(R.id.textView4);
        t5=findViewById(R.id.textView5);
        Intent i=getIntent();
         name=i.getStringExtra("name_key");
         reg=i.getStringExtra("reg_key");
         edu=i.getStringExtra("edu_key");
         year=i.getStringExtra("year_key");
         dept=i.getStringExtra("dept_key");
         t1.setText(name);
         t2.setText(reg);
         t3.setText(edu);
         t4.setText("YEAR OF BIRTH:"+year);
         t5.setText(dept);


    }
}
