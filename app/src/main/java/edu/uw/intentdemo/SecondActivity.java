package edu.uw.intentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "**Second**";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //action bar "back"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
