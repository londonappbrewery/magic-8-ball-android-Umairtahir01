package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView anss = (TextView)findViewById(R.id.ans);
        final Button btn = (Button)findViewById(R.id.btn);
        final String Answer_Message[] = {"No!","Yes!","I D'not know" };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(3);
                anss.setText(Answer_Message[number]);
            }
        });


    }
}
