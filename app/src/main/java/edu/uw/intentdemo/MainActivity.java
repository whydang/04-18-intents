package edu.uw.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "**Main**";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View launchButton = findViewById(R.id.btnLaunch);
        launchButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "Launch button pressed");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                            // key,         value
                intent.putExtra("edu.uw.intentdemo.message", "Hello from activity main!");
                startActivity(intent);


            }
        });

    }

    public void callNumber(View v) {
        Log.v(TAG, "Call button pressed");


    }

    public void takePicture(View v) {
        Log.v(TAG, "Camera button pressed");


    }

    public void sendMessage(View v) {
        Log.v(TAG, "Message button pressed");


    }

}
