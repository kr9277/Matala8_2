package com.example.matala8_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Switch sw;
    RadioButton rb1, rb2, rb3, rb4;
    ImageView iv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        sw = findViewById(R.id.sw);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        iv = findViewById(R.id.iv);
    }

    public void click(View view) {
        if (sw.isChecked()){
            if (rb1.isChecked()){
                iv.setImageResource(R.drawable.yellow);
            }
            if (rb2.isChecked()){
                iv.setImageResource(R.drawable.pink);
            }
            if (rb3.isChecked()){
                iv.setImageResource(R.drawable.perple);
            }
            if (rb4.isChecked()){
                iv.setImageResource(R.drawable.green);
            }
        }
    }

    public void click1(View view) {
        if (!sw.isChecked()){
            iv.setImageResource(R.drawable.yellow);
        }
    }
    public void click2(View view) {
        if (!sw.isChecked()){
            iv.setImageResource(R.drawable.pink);
        }
    }
    public void click3(View view) {
        if (!sw.isChecked()){
            iv.setImageResource(R.drawable.perple);
        }
    }
    public void click4(View view) {
        if (!sw.isChecked()){
            iv.setImageResource(R.drawable.green);
        }
    }
}