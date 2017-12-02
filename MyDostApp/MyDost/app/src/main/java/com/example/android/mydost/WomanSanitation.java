package com.example.android.mydost;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

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
        final String doc1name = "Aditya";
        int doc1age = 32;
        final String doc2name = "Utkarsh";
        int doc2age = 34;
        final String doc3name = "Abhishek";
        int doc3age = 36;
        final String doc4name = "Sachin";
        int doc4age = 35;
        final String doc5name = "Kanishk";
        int doc5age = 33;
        final String doc6name = "Ayush";
        int doc6age = 31;

        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = doc1name;
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("avail");
                            if (success) {
                                Bundle b = new Bundle();
                                b.putString("username",username);
                                Intent i = new Intent(WomanSanitation.this,ChatConfirmation.class);
                                i.putExtras(b);
                                startActivity(i);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(WomanSanitation.this);
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

                CheckDocAvail checkDocAvail = new CheckDocAvail(username,responseListener);
                RequestQueue queue = Volley.newRequestQueue(WomanSanitation.this);
                queue.add(checkDocAvail);

            }
        });

        doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = doc2name;
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("avail");
                            if (success) {
                                Bundle b = new Bundle();
                                b.putString("username",username);
                                Intent i = new Intent(WomanSanitation.this,ChatConfirmation.class);
                                i.putExtras(b);
                                startActivity(i);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(WomanSanitation.this);
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

                CheckDocAvail checkDocAvail = new CheckDocAvail(username,responseListener);
                RequestQueue queue = Volley.newRequestQueue(WomanSanitation.this);
                queue.add(checkDocAvail);
            }
        });

        doc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = doc3name;
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("avail");
                            if (success) {
                                Bundle b = new Bundle();
                                b.putString("username",username);
                                Intent i = new Intent(WomanSanitation.this,ChatConfirmation.class);
                                i.putExtras(b);
                                startActivity(i);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(WomanSanitation.this);
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

                CheckDocAvail checkDocAvail = new CheckDocAvail(username,responseListener);
                RequestQueue queue = Volley.newRequestQueue(WomanSanitation.this);
                queue.add(checkDocAvail);

            }
        });
        doc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = doc4name;
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("avail");
                            if (success) {
                                Bundle b = new Bundle();
                                b.putString("username",username);
                                Intent i = new Intent(WomanSanitation.this,ChatConfirmation.class);
                                i.putExtras(b);
                                startActivity(i);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(WomanSanitation.this);
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

                CheckDocAvail checkDocAvail = new CheckDocAvail(username,responseListener);
                RequestQueue queue = Volley.newRequestQueue(WomanSanitation.this);
                queue.add(checkDocAvail);

            }
        });
        doc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = doc5name;
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("avail");
                            if (success) {
                                Bundle b = new Bundle();
                                b.putString("username",username);
                                Intent i = new Intent(WomanSanitation.this,ChatConfirmation.class);
                                i.putExtras(b);
                                startActivity(i);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(WomanSanitation.this);
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

                CheckDocAvail checkDocAvail = new CheckDocAvail(username,responseListener);
                RequestQueue queue = Volley.newRequestQueue(WomanSanitation.this);
                queue.add(checkDocAvail);

            }
        });
        doc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = doc6name;
                com.android.volley.Response.Listener<String> responseListener = new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("avail");
                            if (success) {
                                Bundle b = new Bundle();
                                b.putString("username",username);
                                Intent i = new Intent(WomanSanitation.this,ChatConfirmation.class);
                                i.putExtras(b);
                                startActivity(i);

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(WomanSanitation.this);
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

                CheckDocAvail checkDocAvail = new CheckDocAvail(username,responseListener);
                RequestQueue queue = Volley.newRequestQueue(WomanSanitation.this);
                queue.add(checkDocAvail);

            }
        });
    }
}
