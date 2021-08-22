package com.example.youthopia21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ImageView imgLogo;
    private TextView txtYouth, slogan;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
changeStatusBarColor();
        setContentView(R.layout.activity_main);
        timer = new Timer();

        imgLogo = findViewById(R.id.imageView);
        txtYouth = findViewById(R.id.text_youth);
        slogan = findViewById(R.id.text_slogan);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        imgLogo.setAnimation(animation);
        txtYouth.setAnimation(animation);
        slogan.setAnimation(animation);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        }, 5000);
    }
    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.invisible));
        }
    }

}
