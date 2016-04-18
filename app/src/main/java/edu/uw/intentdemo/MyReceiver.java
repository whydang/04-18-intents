package edu.uw.intentdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by DANG on 4/18/2016.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() == intent.ACTION_BATTERY_LOW) {
            Toast.makeText(context, "Battery Low!", Toast.LENGTH_SHORT).show();
        }
    }
}
