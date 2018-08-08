package com.uetechnologies.ukemeobong.learnibibio;

import android.content.Intent;
import android.icu.text.NumberingSystem;
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

    public void openAlphabetsList (View view){
        Intent i = new Intent(this, AlphabetsActivity.class);
        startActivity(i);
    }

    public void openNumbersList (View view){
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyMembersList (View view){
        Intent i = new Intent(this, FamilyMembersActivity.class);
        startActivity(i);
    }

    public void openColoursList (View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }

    public void openPhrasesList (View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }

    public void openProverbsList (View view){
        Intent i = new Intent(this, DictionaryActivity.class);
        startActivity(i);
    }


}

