package com.uetechnologies.ukemeobong.learnibibio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DictionaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("You are a thief when you consume stolen goods", "Adia mkpo ino edi ino"));
        words.add(new Word("You will regret your stubbornness", "Ama akop tap, aya onuho'"));
        words.add(new Word("Three", "Ita"));
        words.add(new Word("Four", "Inaang"));
        words.add(new Word("Five", "Ition"));
        words.add(new Word("Six", "Itio-kiet"));
        words.add(new Word("Seven", "Itia-ba"));
        words.add(new Word("Eight", "Itia-ita"));
        words.add(new Word("Nine", "Usuk-kiet"));
        words.add(new Word("Ten", "Duop"));
        words.add(new Word("Eleven", "Duop-o-kiet"));
        words.add(new Word("Twelve", "Duop-eba"));
        words.add(new Word("Thirteen", "Duop-eta"));
        words.add(new Word("Fourteen", "Duop-enaang"));
        words.add(new Word("Fifteen", "Efid"));
        words.add(new Word("Sixteen", "Efid-e-kiet"));
        words.add(new Word("Seventeen", "Efid-eba"));
        words.add(new Word("Eighteen", "Efid-eta"));
        words.add(new Word("Nineteen", "Efid-enaang"));
        words.add(new Word("Twenty", "Edip"));
        words.add(new Word("Twenty One", "Edip-mme-kiet"));
        words.add(new Word("Twenty Two", "Edip-mme-iba"));
        /*words.add("Twenty Three");
        words.add("Twenty Four");
        words.add("Twenty Five");
        words.add("Twenty Six");
        words.add("Twenty Seven");
        words.add("Twenty Eight");
        words.add("Twenty Nine");
        words.add("Thirty");
        words.add("Thirty One");
        words.add("Thirty Two");
        words.add("Thirty Three");
        words.add("Thirty Four");
        words.add("Thirty Five");
        words.add("Thirty Six");
        words.add("Thirty Seven");
        words.add("Thirty Eight");
        words.add("Thirty Nine");
        words.add("Forty");
        words.add("Forty One");
        words.add("Forty Two");
        words.add("Forty Three");
        words.add("Forty Four");
        words.add("Forty Five");
        words.add("Forty Six");
        words.add("Forty Seven");
        words.add("Forty Eight");
        words.add("Forty Nine");
        words.add("Fifty");
        words.add("Fifty One");
        words.add("Fifty Two");
        words.add("Fifty Three");
        words.add("Fifty Four");
        words.add("Fifty Five");
        words.add("Fifty Six");
        words.add("Fifty Seven");
        words.add("Fifty Eight");
        words.add("Fifty Nine");
        words.add("Sixty");
        words.add("Sixty One");
        words.add("Sixty Two");
        words.add("Sixty Three");
        words.add("Sixty Four");
        words.add("Sixty Five");
        words.add("Sixty Six");
        words.add("Sixty Seven");
        words.add("Sixty Eight");
        words.add("Sixty Nine");
        words.add("Seventy");
        words.add("Seventy One");
        words.add("Seventy Two");
        words.add("Seventy Three");
        words.add("Seventy Four");
        words.add("Seventy Five");
        words.add("Seventy Six");
        words.add("Seventy Seven");
        words.add("Seventy Eight");
        words.add("Seventy Nine");
        words.add("Eighty");
        words.add("Eighty One");
        words.add("Eighty Two");
        words.add("Eighty Three");
        words.add("Eighty Four");
        words.add("Eighty Five");
        words.add("Eighty Six");
        words.add("Eighty Seven");
        words.add("Eighty Eight");
        words.add("Eighty Nine");
        words.add("Ninety");
        words.add("Ninety One");
        words.add("Ninety Two");
        words.add("Ninety Three");
        words.add("Ninety Four");
        words.add("Ninety Five");
        words.add("Ninety Six");
        words.add("Ninety Seven");
        words.add("Ninety Eight");
        words.add("Ninety Nine");
        words.add("One Hundred");*/

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }

}
