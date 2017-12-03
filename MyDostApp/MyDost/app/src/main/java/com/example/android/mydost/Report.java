package com.example.android.mydost;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhi on 3/12/17.
 */

public class Report extends StringRequest{
    private static final String REPORT_URL="https://secret-meadow-16362.herokuapp.com/send_mail";
    private Map<String, String> params;
    public Report(String schoolname, String city, String state,  com.android.volley.Response.Listener<String> listener){
        super(Request.Method.POST,REPORT_URL,listener,null);
        params = new HashMap<>();
        params.put("schoolname",schoolname);
        params.put("city",city);
        params.put("state",state);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

