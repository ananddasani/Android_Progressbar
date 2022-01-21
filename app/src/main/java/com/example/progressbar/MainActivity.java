package com.example.progressbar;

import static android.os.SystemClock.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBarHorizontal;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.progressBarHorizantal);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int val = 0;
                        while (val <= 100) {
                            val += 10;
                            sleep(1000);

                            //set the upgrade the progress bar
                            progressBarHorizontal.setProgress(val);
                        }
                    }
                });
                thread.start();
            }
        });

    }
}