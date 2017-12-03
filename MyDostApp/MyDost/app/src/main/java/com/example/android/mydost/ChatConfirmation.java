package com.example.android.mydost;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class ChatConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_confirmation);
        final EditText Userid = (EditText)findViewById(R.id.userid);
        Bundle b = getIntent().getExtras();
        final String username = b.getString("username");
        Button start = (Button)findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String userid = Userid.getText().toString();
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonResponse = new JSONObject(response);
                    boolean success = jsonResponse.getBoolean("success");
                    Log.d("textbefr",userid);
                    if (success) {
                        Log.d("txt",userid);
                        Intent i =new Intent(ChatConfirmation.this,DummyMainActivity.class);
                        startActivity(i);

                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ChatConfirmation.this);
                        builder.setMessage("Request Not Sent")
                                .setNegativeButton("Retry", null)
                                .create()
                                .show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

        };
                StartDocChat startDocChat = new StartDocChat(username,userid,responseListener);
                RequestQueue queue = Volley.newRequestQueue(ChatConfirmation.this);
                queue.add(startDocChat);
            }

        });

    }
}
