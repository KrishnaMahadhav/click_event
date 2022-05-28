package com.example.ninja;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int mcounter = 0;
    Button btn;
    TextView txv;

    @SuppressLint({"setText118n", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.Ninja);
        txv = findViewById(R.id.Krish);
        btn.setOnClickListener(view -> {
            mcounter++;
            txv.setText(Integer.toString(mcounter));
        });
    }
}