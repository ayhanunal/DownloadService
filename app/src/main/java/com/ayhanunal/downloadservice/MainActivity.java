package com.ayhanunal.downloadservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        xml folder -> config add manifest.

         */


    }

    public void download(View view){

        Intent intent = new Intent(this, DownloadService.class);
        startService(intent);

    }

    public void stop(View view){

        Intent intent = new Intent(this, DownloadService.class);
        stopService(intent);

    }
}