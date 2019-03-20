package com.example.mymoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


import static com.example.mymoney.MainActivity.array;
import static com.example.mymoney.MainActivity.base;
import static com.example.mymoney.MainActivity.db;

public class Main2Activity extends AppCompatActivity {

    Button b ;
    EditText achat ;
    EditText prix ;
    ListView liste ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b=findViewById(R.id.btn_ajouter);
        achat=findViewById(R.id.achat);
        prix=findViewById(R.id.prix);


        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v)
            {
                String achats = achat.getText().toString();
                Float prixx =Float.valueOf(prix.getText().toString());
                depense nouveau = new depense(achats, prixx);
                //base.add(nouveau);
                db.ajoutdepense(nouveau);
                Toast.makeText(Main2Activity.this, " ajouté ", Toast.LENGTH_SHORT).show();

            }

        });
    }


}
