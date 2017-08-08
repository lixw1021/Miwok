package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesAvtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        ArrayList<Integer> audioResourceId = new ArrayList<>();
        audioResourceId.add(R.raw.phrase_where_are_you_going);
        audioResourceId.add(R.raw.phrase_what_is_your_name);
        audioResourceId.add(R.raw.phrase_my_name_is);
        audioResourceId.add(R.raw.phrase_how_are_you_feeling);
        audioResourceId.add(R.raw.phrase_im_feeling_good);
        audioResourceId.add(R.raw.phrase_are_you_coming);
        audioResourceId.add(R.raw.phrase_yes_im_coming);
        audioResourceId.add(R.raw.phrase_im_coming);
        audioResourceId.add(R.raw.phrase_lets_go);
        audioResourceId.add(R.raw.phrase_come_here);

        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_phrases, audioResourceId);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
