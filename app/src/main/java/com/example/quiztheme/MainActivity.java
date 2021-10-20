package com.example.quiztheme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout javascript = findViewById(R.id.javascriptLayout);
        final LinearLayout css = findViewById(R.id.cssLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "java";
                java.setBackgroundResource(R.drawable.round_back_white_stroke);
                php.setBackgroundResource(R.drawable.round_back_white_stroke);
                javascript.setBackgroundResource(R.drawable.round_back_white_stroke);
                css.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "php";
                php.setBackgroundResource(R.drawable.round_back_white_stroke);
                java.setBackgroundResource(R.drawable.round_back_white_stroke);
                javascript.setBackgroundResource(R.drawable.round_back_white_stroke);
                css.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });
        javascript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "javascript";
                javascript.setBackgroundResource(R.drawable.round_back_white_stroke);
                php.setBackgroundResource(R.drawable.round_back_white_stroke);
                java.setBackgroundResource(R.drawable.round_back_white_stroke);
                css.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });
        css.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "css";
                css.setBackgroundResource(R.drawable.round_back_white_stroke);
                php.setBackgroundResource(R.drawable.round_back_white_stroke);
                javascript.setBackgroundResource(R.drawable.round_back_white_stroke);
                java.setBackgroundResource(R.drawable.round_back_white_stroke);
            }
        });

    }
}