package com.example.toastylibrarydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mrFh.sweetoasty.SweetToasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SweetToasty.showToast(this,"Hello Sweet Toast");
    }
}