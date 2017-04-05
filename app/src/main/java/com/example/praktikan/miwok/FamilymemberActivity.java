package com.example.praktikan.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilymemberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familymember);

        final ArrayList<Kata> keluarga = new ArrayList<>();
        keluarga.add(new Kata("father","epa", R.drawable.family_father));
        keluarga.add(new Kata("mother","eta", R.drawable.family_mother));
        keluarga.add(new Kata("son","angsi", R.drawable.family_son));
        keluarga.add(new Kata("daughter","tune", R.drawable.family_daughter));
        keluarga.add(new Kata("older brother","taachi", R.drawable.family_older_brother));
        keluarga.add(new Kata("younger brother","chalitti", R.drawable.family_younger_brother));
        keluarga.add(new Kata("older sister","tete", R.drawable.family_older_sister));
        keluarga.add(new Kata("younger sister","kolliti", R.drawable.family_younger_sister));
        keluarga.add(new Kata("grandmother","ama", R.drawable.family_grandmother));
        keluarga.add(new Kata("grandfather","paapa", R.drawable.family_grandfather));

        ListView daftarNomor = (ListView) findViewById(R.id.family);
        AdapterUtkKata adapter = new AdapterUtkKata(this, keluarga, R.color.category_family);
        daftarNomor.setAdapter(adapter);

        daftarNomor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("NumbersActivity", keluarga.get(position). toString());
            }
        });
    }
}
