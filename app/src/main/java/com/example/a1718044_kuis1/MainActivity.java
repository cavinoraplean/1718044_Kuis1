package com.example.a1718044_kuis1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Yohanes Oraplean", "Ayah", R.drawable.papah));
        keluargaArrayList.add(new Keluarga("Yeyetri Naolelis", "Ibu", R.drawable.mamah));
        keluargaArrayList.add(new Keluarga("Cavin Yohanes Oraplean", "Anak", R.drawable.vin));
    }
}
