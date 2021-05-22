package com.example.youthopia21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Offline_Events extends AppCompatActivity {

    private Button goBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline__events);

        goBack = findViewById(R.id.back);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Offline_Events.this, HomeScreen.class);
                i.putExtra("frgtoload", "Event_Fragment");
                startActivity(i);

            }
        });


    }
}