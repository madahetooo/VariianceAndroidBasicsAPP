package com.example.variiance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ClubsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        MyListData[] myListData = new MyListData[]{
                new MyListData("Ahly",R.drawable.variiancelogo),
                new MyListData("Zamalek",R.drawable.variiancelogo),
                new MyListData("Barca",R.drawable.variiancelogo),
                new MyListData("Real Madrid",R.drawable.variiancelogo),
                new MyListData("Juvy",R.drawable.variiancelogo),
                new MyListData("Chealse",R.drawable.variiancelogo),
                new MyListData("Liverbool",R.drawable.variiancelogo),
                new MyListData("City",R.drawable.variiancelogo),
                new MyListData("Arsenal",R.drawable.variiancelogo),
                new MyListData("Ismalia",R.drawable.variiancelogo),
                new MyListData("Enby",R.drawable.variiancelogo),
                new MyListData("Atletico",R.drawable.variiancelogo),
                new MyListData("Valencia",R.drawable.variiancelogo),
        };
        RecyclerView recyclerView = findViewById(R.id.rvClubs);
        ClubAdapter clubAdapter = new ClubAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(clubAdapter);

    }
}