package com.example.lesson02ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int i;
    ImageButton btn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.imageScreen);
        i = 0;
    }

    public void randomImage(View view) {
        i = (int) (Math.random()*3)+1;
        switch (i) {
            case 1: {
                btn.setImageResource(R.drawable.number1);
                iv.setImageResource(R.drawable.img11);
            }
            break;

            case 2: {
                btn.setImageResource(R.drawable.number2);
                iv.setImageResource(R.drawable.img12);
            }
            break;

            case 3: {
                btn.setImageResource(R.drawable.number3);
                iv.setImageResource(R.drawable.img13);
            }
        }
        }
    }

