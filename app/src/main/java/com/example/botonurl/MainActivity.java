package com.example.botonurl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void browser (View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(browserIntent);
    }

}
