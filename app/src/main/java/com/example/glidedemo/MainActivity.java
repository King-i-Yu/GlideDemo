package com.example.glidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private String url1 = "http://file.heyheytalk.com/heyhey/emotion_5.gif";
    private String url2 = "http://file.heyheytalk.com/heyhey/emotion_2.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.imageview);
        Glide.with(this).asGif().load(url2).into(mImageView);
    }
}
