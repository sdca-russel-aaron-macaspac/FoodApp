package com.example.macaspac_reyes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {
    Button Btn_PrevFive;
    Button Btn_Next6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        Btn_PrevFive = findViewById(R.id.BtnPrevFive);
        Btn_PrevFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity6.this, MainActivity5.class);
                startActivity(i);
            }
        });
        Btn_Next6 = findViewById(R.id.BtnNext6);
        Btn_Next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(i);
            }
        });
    }
}