package com.example.praktikan.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Praktikan on 21/02/2017.
 */
public class AdapterUtkKata extends ArrayAdapter {
    private int mbackgroundColor;

    public AdapterUtkKata(Context konteks, List<Kata> object, int backgroundColor) {
        super(konteks, 0, object);
        mbackgroundColor = backgroundColor;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Kata current = (Kata) getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);

        imageView.setImageResource(current.getImageResource());
        imageView.setVisibility(View.VISIBLE);

        LinearLayout words = (LinearLayout) convertView.findViewById(R.id.word);
        words.setBackgroundColor(ContextCompat.getColor(getContext(), mbackgroundColor));

        TextView miwokWord = (TextView) convertView.findViewById(R.id.miwok_word);
        miwokWord.setText(current.getMiwokWord());

        TextView defaultWord = (TextView) convertView.findViewById(R.id.default_word);
        defaultWord.setText(current.getDefaultWord());

        return convertView;
    }


}


