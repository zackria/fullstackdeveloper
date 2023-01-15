package com.cgi.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public Magic8Ball magic8Ball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magic8Ball = new Magic8Ball();

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageView);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateResponse();
            }
        });

        TextView textView = (TextView) findViewById(R.id.askText);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateResponse();
            }
        });



    }

    public void updateResponse(){
        TextView textView = findViewById(R.id.responses);
        String response = "";
        if (!magic8Ball.isInitialized) {
            magic8Ball.initializeResponses();
        }
        response = magic8Ball.predict();

        textView.setText(response);
    }
}