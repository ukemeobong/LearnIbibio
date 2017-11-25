package com.uetechnologies.ukemeobong.learnibibio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Find the View that shows the numbers category
    TextView numbers = (TextView) findViewById(R.id.numbers);

    // Set a click listener on that View
    numbers.setOnClickListener(new View.OnClickListener() {
        // The code in this method will be executed when the numbers View is clicked on.
        @Override
        public void onClick(View view) {
            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(numbersIntent);
        }
    })


}

09022933028+

