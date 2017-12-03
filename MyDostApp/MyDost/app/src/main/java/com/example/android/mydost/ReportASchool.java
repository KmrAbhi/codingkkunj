package com.example.android.mydost;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class ReportASchool extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_aschool);

        final String schoolName;
        EditText schname = (EditText)findViewById(R.id.schoolname);
        schoolName = String.valueOf(schname.getText());
        final String city;
        EditText schcity = (EditText)findViewById(R.id.city);
        city = String.valueOf(schcity.getText());
        final String state;
        EditText schstate = (EditText)findViewById(R.id.state);
        state = String.valueOf(schstate.getText());
        Button send = (Button)findViewById(R.id.schoolsubmit);


                    send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String SchoolName =schoolName;
                final String City= city;
                final String State =state;

                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                Intent i = new Intent(ReportASchool.this, ChildHelpline.class);
                                startActivity(i);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(ReportASchool.this);
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

                Report registerRequest = new Report(SchoolName,City,State,responseListener);
                RequestQueue queue = Volley.newRequestQueue(ReportASchool.this);
                queue.add(registerRequest);

            }
        });


    }
}
