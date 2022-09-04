package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }

    public void whenclicked(View view) {
        String url = "https://techathon-Orate.app.100ms.live/streaming/preview/mzk-bgm-guo";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        intent.setPackage("com.android.chrome");
        try {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            getBaseContext().startActivity(intent);
        }
        catch (ActivityNotFoundException ex){
            // in case chrome browser not installed
            intent.setPackage(null);
            Toast.makeText(this, "an error is coming", Toast.LENGTH_SHORT).show();
            getBaseContext().startActivity(intent);
        }
    }
}