package com.example.praktikan.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Kata> warna = new ArrayList<>();
        warna.add(new Kata("red", "wetetti", R.drawable.color_red));
        warna.add(new Kata("green", "chokokki", R.drawable.color_green));
        warna.add(new Kata("brown", "takaakki", R.drawable.color_brown));
        warna.add(new Kata("gray", "topoppi", R.drawable.color_gray));
        warna.add(new Kata("black", "kululli", R.drawable.color_black));
        warna.add(new Kata("white", "kelelli", R.drawable.color_white));
        warna.add(new Kata("dusty yellow", "topiisa", R.drawable.color_dusty_yellow));
        warna.add(new Kata("mustard yellow", "chiwiita", R.drawable.color_mustard_yellow));

        ListView daftarNomor = (ListView) findViewById(R.id.colors);
        AdapterUtkKata adapter = new AdapterUtkKata(this, warna, R.color.category_colors);
        daftarNomor.setAdapter(adapter);

        daftarNomor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("ColorsActivity", warna.get(position). toString());
            }
        });
    }
}
