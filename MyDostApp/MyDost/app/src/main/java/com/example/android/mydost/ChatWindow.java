package com.example.android.mydost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ChatWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_window);

        Bundle b =getIntent().getExtras();
        String UserName = b.getString("username");
        String Room = b.getString("chatroom");
        Button chattingdocname = (Button)findViewById(R.id.chattingdocname);
        chattingdocname.setText(UserName);
    }
}
