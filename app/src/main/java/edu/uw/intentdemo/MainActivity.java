package edu.uw.intentdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

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
        // implicit intent
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:206-685-1622"));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    private static int PIC_CODE = 1;

    public void takePicture(View v) {
        Log.v(TAG, "Camera button pressed");

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, PIC_CODE);

        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PIC_CODE && resultCode == RESULT_OK) {
            Bundle extra = data.getExtras();
            Bitmap image = (Bitmap) extra.get("data");
            ImageView view = (ImageView)findViewById(R.id.imgThumbnail);
            view.setImageBitmap(image);
        }
    }

    public void sendMessage(View v) {
        Log.v(TAG, "Message button pressed");


    }

}
