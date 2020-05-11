package com.hfad.battlebeastapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyPerformance();
            }
        });

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMystatistics();
            }
        });

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMybasic_information();
            }
        });

        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyLogin();
            }
        });
    }

    public void openMystatistics() {
        Intent intent = new Intent(this, statistics.class);
        startActivity(intent);
    }

    public void openMyPerformance() {
        Intent intent = new Intent(this, performance.class);
        startActivity(intent);
    }

    public void openMybasic_information() {
        Intent intent = new Intent(this, basic_information.class);
        startActivity(intent);
    }

    public void openMyLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
