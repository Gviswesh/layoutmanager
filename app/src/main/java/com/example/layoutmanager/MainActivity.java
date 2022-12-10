package com.example.layoutmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button bt;
    Spinner s,y;
    String[] dept_array={"CSE","ECE","IT","MECHANICAL","CIVIL"};
    Integer[] year_array={1998,1999,2000,2001,2002};
    String name,reg,edu,yearof,dept;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        e3=findViewById(R.id.editText3);
        bt=findViewById(R.id.button);
        s=findViewById(R.id.dept_spinner);
        y=findViewById(R.id.age_spinner);
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,dept_array);
        ArrayAdapter year=new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item,year_array);
        s.setAdapter(adapter);
        y.setAdapter(year);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=e1.getText().toString();
                reg=e2.getText().toString();
                edu=e3.getText().toString();
                dept=s.getSelectedItem().toString();
                yearof=y.getSelectedItem().toString();
                Intent i= new Intent(MainActivity.this,Second.class);
                i.putExtra("name_key",name);
                i.putExtra("reg_key",reg);
                i.putExtra("dept_key",dept);
                i.putExtra("year_key",yearof);
                i.putExtra("edu_key",edu);
                startActivity(i);
            }
        });


    }
}