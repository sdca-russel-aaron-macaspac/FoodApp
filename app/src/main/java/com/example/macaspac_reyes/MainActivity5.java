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

public class MainActivity5 extends AppCompatActivity {
    Button Btn_PrevFour;
    Button Btn_Next5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);
        Btn_PrevFour = findViewById(R.id.BtnPrevFour);
        Btn_PrevFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(i);
            }
        });
        Btn_Next5 = findViewById(R.id.BtnNext5);
        Btn_Next5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(i);
            }
        });
    }
}