package com.example.android.mydost;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhi on 2/12/17.
 */

public class StartDocChat extends StringRequest {
    private static final String REGISTER_REQUEST_URL="https://secret-meadow-16362.herokuapp.com/init_chat";
    private Map<String, String> params;
    public StartDocChat(String username,String userid,  com.android.volley.Response.Listener<String> listener){
        super(Request.Method.POST,REGISTER_REQUEST_URL,listener,null);
        params = new HashMap<>();
        params.put("username",username);
        params.put("userid",userid);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
