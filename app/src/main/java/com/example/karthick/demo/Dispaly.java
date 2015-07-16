package com.example.karthick.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by karthick on 15/7/15.
 */
public class Dispaly extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dispaly);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.TVusername);
    }
}
