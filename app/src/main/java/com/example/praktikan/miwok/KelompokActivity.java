package com.example.praktikan.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KelompokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelompok);
        final ArrayList<Kata>
                kalimat = new ArrayList<>();
        kalimat.add(new Kata("Reza Dwi Hendarno","6706152231"));
        kalimat.add(new Kata("Gian Aria Wibowo","6706153456"));
        kalimat.add(new Kata("Dzulfikar nuzulul quran","6706159087"));
        kalimat.add(new Kata("Naila iffah Purwita","6706150125"));

        ListView daftarNomor = (ListView) findViewById(R.id.phrases);
        AdapterUtkKata adapter = new AdapterUtkKata(this, kalimat, R.color.category_kelompok);
        daftarNomor.setAdapter(adapter);

        daftarNomor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("PhrasesActivity", kalimat.get(position). toString());
            }
        });
    }
}
