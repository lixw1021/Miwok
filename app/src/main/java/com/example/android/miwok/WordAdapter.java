package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xianwei li on 8/7/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull List<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView miworkWord = (TextView) convertView.findViewById(R.id.miwok_text_view);
        TextView defaultWord = (TextView) convertView.findViewById(R.id.default_text_view);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image_view);

        imageView.setImageResource(word.getImageResourceId());
        miworkWord.setText(word.getMiwokWord());
        defaultWord.setText(word.getDefaultWord());

        return convertView;
    }
}
