package edu.uw.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "**Second**";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //action bar "back"
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
        Bundle b = getIntent().getExtras();
        String value = b.getString("edu.uw.intentdemo");
        TextView subtitle = (TextView)findViewById(R.id.txtSecond);
        subtitle.setText(value);

    }
}
