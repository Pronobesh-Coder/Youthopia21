package com.example.youthopia21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Calendar;

public class HomeScreen extends AppCompatActivity {

    private TextView txtGreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        changeStatusBarColor();
        setContentView(R.layout.activity_home_screen);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

        if(getIntent().getStringExtra("frgtoload")!= null){
            String x = getIntent().getStringExtra("frgtoload");
            if(x.equals("Event_Fragment")){
               // Fragment fragment = new EventsFragment();
                bottomNavigationView.setSelectedItemId(R.id.nav_events);
                //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                 //       fragment).commit();
            }

        }

        


        txtGreet = findViewById(R.id.textView);
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if (hour >= 0 && hour < 12) {
            txtGreet.setText("GOOD MORNING");
        } else if (hour >= 12 && hour < 16) {
            txtGreet.setText("GOOD AFTERNOON");
        } else if (hour >= 16 && hour < 24) {
            txtGreet.setText("GOOD EVENING");
        }
    }
        private void changeStatusBarColor () {
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = this.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
                window.setStatusBarColor(this.getResources().getColor(R.color.invisible));
            }
        }

        private BottomNavigationView.OnNavigationItemSelectedListener navListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;

                        switch (item.getItemId()) {
                            case R.id.nav_home:
                                selectedFragment = new HomeFragment();
                                break;
                            case R.id.nav_sponsor:
                                selectedFragment = new SponsorsFragment();
                                break;
                            case R.id.nav_events:
                                selectedFragment = new EventsFragment();
                                break;
                            case R.id.nav_contact:
                                selectedFragment = new ContactFragment();
                                break;
                            case R.id.nav_info:
                                selectedFragment = new InfoFragment();
                                break;
                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();

                        return true;
                    }
                };

    }