package com.example.android.mydost;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhi on 2/12/17.
 */

public class CheckDocAvail extends StringRequest{
    private static final String REGISTER_REQUEST_URL="https://secret-meadow-16362.herokuapp.com/get_avail";
    private Map<String, String> params;
    public CheckDocAvail(String username, com.android.volley.Response.Listener<String> listener){
        super(Request.Method.POST,REGISTER_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("username",username);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
