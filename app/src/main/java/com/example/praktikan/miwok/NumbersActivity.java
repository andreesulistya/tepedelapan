package com.example.praktikan.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Kata> nomor = new ArrayList<>();
        nomor.add(new Kata("lutti", "one", R.drawable.number_one));
        nomor.add(new Kata("otiiko", "two", R.drawable.number_two));
        nomor.add(new Kata("tolookosu","three", R.drawable.number_three));
        nomor.add(new Kata("oyyisa","four", R.drawable.number_four));
        nomor.add(new Kata("massokka","five", R.drawable.number_five));
        nomor.add(new Kata("temmokka","six", R.drawable.number_six));
        nomor.add(new Kata("kenekaku","seven", R.drawable.number_seven));
        nomor.add(new Kata("kawinta","eight", R.drawable.number_eight));
        nomor.add(new Kata("wo'a","nine", R.drawable.number_nine));
        nomor.add(new Kata("na'aacha","ten", R.drawable.number_ten));

        ListView daftarNomor = (ListView) findViewById(R.id.numbers);
        AdapterUtkKata adapter = new AdapterUtkKata(this, nomor, R.color.category_numbers);
        daftarNomor.setAdapter(adapter);

        daftarNomor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("NumbersActivity", nomor.get(position). toString());
            }
        });
    }
}
