package com.example.praktikan.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Kata> kalimat = new ArrayList<>();
        kalimat.add(new Kata("Where are you going?","minto wuksus"));
        kalimat.add(new Kata("What is your name?","tinnә oyaase'nә"));
        kalimat.add(new Kata("My name is...","oyaaset..."));
        kalimat.add(new Kata("How are you feeling?","michәksәs?"));
        kalimat.add(new Kata("I’m feeling good.","kuchi achit"));
        kalimat.add(new Kata("Are you coming?","әәnәs'aa?"));
        kalimat.add(new Kata("Yes, I’m coming.","hәә’ әәnәm"));
        kalimat.add(new Kata("I’m coming.","әәnәm"));
        kalimat.add(new Kata("Let’s go.","yoowutis"));
        kalimat.add(new Kata("Come here.","әnni'nem"));

        ListView daftarNomor = (ListView) findViewById(R.id.phrases);
        AdapterUtkKata adapter = new AdapterUtkKata(this, kalimat, R.color.category_phrases);
        daftarNomor.setAdapter(adapter);

        daftarNomor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("PhrasesActivity", kalimat.get(position). toString());
            }
        });
    }
}
