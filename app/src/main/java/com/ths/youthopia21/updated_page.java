package com.ths.youthopia21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class updated_page extends AppCompatActivity {

    ImageView close;
    TextView textView;
    ImageView imageView;
    String description, img_url;
    Picasso picasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updated_page);

        close = findViewById(R.id.close);
        textView = findViewById(R.id.test_text);
        imageView = findViewById(R.id.imageView7);
        picasso = Picasso.with(updated_page.this);

        if(getIntent() != null){
            if(getIntent().getStringExtra("desc")!= null){
                description = getIntent().getStringExtra("desc");
                textView.setText(description);
            }
            if(getIntent().getStringExtra("imgurl")!=null){
                img_url = getIntent().getStringExtra("imgurl");
                picasso.load(img_url).placeholder(R.drawable.logo).error(R.drawable.logo).into(imageView);
            }
        }

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(updated_page.this, HomeScreen.class);
                startActivity(intent);
            }
        });
    }
}