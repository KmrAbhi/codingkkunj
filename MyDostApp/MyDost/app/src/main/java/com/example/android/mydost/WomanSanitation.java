package com.example.android.mydost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WomanSanitation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman_sanitation);
        Button doc1 =(Button)findViewById(R.id.sanitationdoc1);
        Button doc2 =(Button)findViewById(R.id.sanitationdoc2);
        Button doc3 =(Button)findViewById(R.id.sanitationdoc3);
        Button doc4 =(Button)findViewById(R.id.sanitationdoc4);
        Button doc5 =(Button)findViewById(R.id.sanitationdoc5);
        Button doc6 =(Button)findViewById(R.id.sanitationdoc6);
        String doc1name = "Aditya";
        int doc1age = 32;
        String doc2name = "Utkarsh";
        int doc2age = 34;
        String doc3name = "Abhishek";
        int doc3age = 36;
        String doc4name = "Sachin";
        int doc4age = 35;
        String doc5name = "Kanishk";
        int doc5age = 33;
        String doc6name = "Ayush";
        int doc6age = 31;

        final Button chattingdocname=(Button)findViewById(R.id.chattingdocname);
        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(WomanSanitation.this,ChatWindow.class);
                startActivity(i);
            }
        });
        doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WomanSanitation.this,ChatWindow.class);
                startActivity(i);
            }
        });

        doc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WomanSanitation.this,ChatWindow.class);
                startActivity(i);
            }
        });
        doc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WomanSanitation.this,ChatWindow.class);
                startActivity(i);
            }
        });
        doc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WomanSanitation.this,ChatWindow.class);
                startActivity(i);
            }
        });
        doc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WomanSanitation.this,ChatWindow.class);
                startActivity(i);
            }
        });
    }
}
