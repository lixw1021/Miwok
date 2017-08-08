package com.example.android.miwok;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("two", "otiiko",R.drawable.number_two));
        words.add(new Word("three", "tolookosu", R.drawable.number_three));
        words.add(new Word("four", "oyyisa", R.drawable.number_four));
        words.add(new Word("five", "massokka", R.drawable.number_five));
        words.add(new Word("six", "temmokka", R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo’e",R.drawable.number_nine));
        words.add(new Word("ten", "na’aacha", R.drawable.number_ten ));

        ArrayList<Integer> audioResourceId = new ArrayList<>();
        audioResourceId.add(R.raw.number_one);
        audioResourceId.add(R.raw.number_two);
        audioResourceId.add(R.raw.number_three);
        audioResourceId.add(R.raw.number_four);
        audioResourceId.add(R.raw.number_five);
        audioResourceId.add(R.raw.number_six);
        audioResourceId.add(R.raw.number_seven);
        audioResourceId.add(R.raw.number_eight);
        audioResourceId.add(R.raw.number_nine);
        audioResourceId.add(R.raw.number_ten);

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_numbers ,audioResourceId);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
