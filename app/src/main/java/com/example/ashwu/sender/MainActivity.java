package com.example.ashwu.sender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    
    public static final String ACTION = "RECEIVE_MSG";
    
    public static final String ACTION_V4 = "RECEIVE_MSG_V4";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void sendBroadcast(View v) {
        Intent intent = new Intent(ACTION);
        sendBroadcast(intent);
    }
    
    public void sendBroadcastV4(View v) {
        Intent intent = new Intent(ACTION_V4);
        sendBroadcast(intent);
    }
}
