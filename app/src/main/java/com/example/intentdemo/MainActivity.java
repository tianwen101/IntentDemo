package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.btn_second:
                Intent intent = new Intent();
                intent.setAction("com.example.SECOND_ACTIVITY");
                intent.putExtra("msg","second activity");
                if (intent.resolveActivity(getPackageManager())  != null) {
                     startActivity(intent);
                }
                break;
        }
    }
}