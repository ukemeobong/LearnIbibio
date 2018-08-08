package com.uetechnologies.ukemeobong.learnibibio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        // Create array of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "Kiet"));
        words.add(new Word("Two", "Iba"));
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
        words.add(new Word("Twenty One", "Edip-ye-kiet"));
        words.add(new Word("Twenty Two", "Edip-ye-iba"));
        words.add(new Word("Twenty Three", "Edip-ye-ita"));
        words.add(new Word("Twenty Four", "Edip-ye-inaang"));
        words.add(new Word("Twenty Five", "Edip-ye-ition"));
        words.add(new Word("Twenty Six", "Edip-ye-itiokiet"));
        words.add(new Word("Twenty Seven", "Edip-ye-itiaba"));
        words.add(new Word("Twenty Eight", "Edip-ye-itiaita"));
        words.add(new Word("Twenty Nine", "Edip-ye-usuk-kiet"));
        words.add(new Word("Thirty", "Edip-ye-Duop"));
        words.add(new Word("Thirty One", "Edip-ye-Duop-o-kiet"));
        words.add(new Word("Thirty Two", "Edip-ye-Duop-eba"));
        words.add(new Word("Thirty Three", "Edip-ye-Duop-eta"));
        words.add(new Word("Thirty Four", "Edip-ye-Duop-enaang"));
        words.add(new Word("Thirty Five", "Edip-ye-efit"));
        words.add(new Word("Thirty Six", "Edip-ye-efit-e-kiet"));
        words.add(new Word("Thirty Seven", "Edip-ye-efit-eba"));
        words.add(new Word("Thirty Eight", "Edip-ye-efit-eba"));
        words.add(new Word("Thirty Nine", "Edip-ye-efit-eta"));
        words.add(new Word("Forty", "Aba"));
        words.add(new Word("Forty One", "Aba-ye-kiet"));
        words.add(new Word("Forty Two", "Aba-ye-iba"));
        words.add(new Word("Forty Three", "Aba-ye-ita"));
        words.add(new Word("Forty Four", "Aba-ye-inaang"));
        words.add(new Word("Forty Five", "Aba-ye-ition"));
        words.add(new Word("Forty Six", "Aba-ye-itiokiet"));
        words.add(new Word("Forty Seven", "Aba-ye-itiaba"));
        words.add(new Word("Forty Eight", "Aba-ye-itiaita"));
        words.add(new Word("Forty Nine", "Aba-ye-usuk-kiet"));
        words.add(new Word("Fifty", "Aba-ye-duop"));
        words.add(new Word("Fifty One", "Aba-ye-Duop-o-kiet"));
        words.add(new Word("Fifty Two", "Aba-ye-Duop-eba"));
        words.add(new Word("Fifty Three", "Aba-ye-Duop-eta"));
        words.add(new Word("Fifty Four", "Aba-ye-Duop-enaang"));
        words.add(new Word("Fifty Five", "Aba-ye-Duop-ition"));
        words.add(new Word("Fifty Six", "Aba-ye-Duop-itiokiet"));
        words.add(new Word("Fifty Seven", "Aba-ye-Duop-itiaba"));
        words.add(new Word("Fifty Eight", "Aba-ye-Duop-itiaita"));
        words.add(new Word("Fifty Nine", "Aba-ye-usuk-kiet"));
        words.add(new Word("Sixty", "Ata"));
        words.add(new Word("Sixty One", "Ata-ye-kiet"));
        words.add(new Word("Sixty Two", "Ata-ye-iba"));
        words.add(new Word("Sixty Three", "Ata-ye-ita"));
        words.add(new Word("Sixty Four", "Ata-ye-inaang"));
        words.add(new Word("Sixty Five", "Ata-ye-ition"));
        words.add(new Word("Sixty Six", "Ata-ye-itiokiet"));
        words.add(new Word("Sixty Seven", "Ata-ye-itiaba"));
        words.add(new Word("Sixty Eight", "Ata-ye-itiaita"));
        words.add(new Word("Sixty Nine", "Ata-ye-usuk-kiet"));
        words.add(new Word("Seventy", "Ata-ye-Duop"));
        words.add(new Word("Seventy One", "Ata-ye-Duop-o-kiet"));
        words.add(new Word("Seventy Two", "Ata-ye-Duop-eba"));
        words.add(new Word("Seventy Three", "Ata-ye-Duop-eta"));
        words.add(new Word("Seventy Four", "Ata-ye-Duop-enaang"));
        words.add(new Word("Seventy Five", "Ata-ye-Duop-ition"));
        words.add(new Word("Seventy Six", "Ata-ye-Duop-itiokiet"));
        words.add(new Word("Seventy Seven", "Ata-ye-Duop-itiaba"));
        words.add(new Word("Seventy Eight", "Ata-ye-Duop-itiaita"));
        words.add(new Word("Seventy Nine", "Ata-ye-Duop-usuk-kiet"));
        words.add(new Word("Eighty", "Anaang"));
        words.add(new Word("Eighty One", "Anaang-ye-kiet"));
        words.add(new Word("Eighty Two", "Anaang-ye-iba"));
        words.add(new Word("Eighty Three", "Anaang-ye-ita"));
        words.add(new Word("Eighty Four", "Anaang-ye-inaang"));
        words.add(new Word("Eighty Five", "Anaang-ye-ition"));
        words.add(new Word("Eighty Six", "Anaang-ye-itiokiet"));
        words.add(new Word("Eighty Seven", "Anaang-ye-itiaba"));
        words.add(new Word("Eighty Eight", "Anaang-ye-itiiata"));
        words.add(new Word("Eighty Nine", "Anaang-usuk-kiet"));
        words.add(new Word("Ninety", "Anaang-ye-Duop"));
        words.add(new Word("Ninety One", "Anaang-ye-Duop-o-kiet"));
        words.add(new Word("Ninety Two", "Anaang-ye-Duop-eba"));
        words.add(new Word("Ninety Three", "Annang-ye-Duop-eta"));
        words.add(new Word("Ninety Four", "Anaang-ye-Duop-enaang"));
        words.add(new Word("Ninety Five", "Anaang-ye-efit"));
        words.add(new Word("Ninety Six", "Anaang-ye-efid-e-kiet"));
        words.add(new Word("Ninety Seven", "Anaang-ye-efid-eba"));
        words.add(new Word("Ninety Eight", "Anaang-ye-efid-eta"));
        words.add(new Word("Ninety Nine", "Anaang-ye-efid-enaang"));
        words.add(new Word("One Hundred", "Ikie"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



        }



    }
