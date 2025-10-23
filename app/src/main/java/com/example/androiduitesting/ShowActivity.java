package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView cityNameText = findViewById(R.id.cityNameText);
        Button backButton = findViewById(R.id.backButton);
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("cityName");
        cityNameText.setText(cityName);
        backButton.setOnClickListener(v -> finish());
    }
}
