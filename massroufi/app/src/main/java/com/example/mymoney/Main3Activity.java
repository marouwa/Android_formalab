package com.example.mymoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.mymoney.MainActivity.base;
import static com.example.mymoney.MainActivity.db;
import static com.example.mymoney.MainActivity.getAppFirstInstallTime;
import static com.example.mymoney.MainActivity.getDate;


public class Main3Activity extends AppCompatActivity {
    Long date ;
    TextView t,dateview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t =findViewById(R.id.total);
        t.setText(Float.toString(db.total()));
        date= getAppFirstInstallTime(this);
        String d = getDate(date, "dd/MM/yyyy");
        dateview=findViewById(R.id.date);
        dateview.setText(d);


    }

    @Override
    public void onResume(){
        super.onResume();
        // put your code here...
        t.setText(Float.toString(db.total()));
    }
}
