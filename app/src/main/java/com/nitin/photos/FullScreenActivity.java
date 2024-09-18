package com.nitin.photos;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.io.File;

public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);

        ImageView fullScreenImageView = findViewById(R.id.fullScreenImageView);
        ImageButton closeButton = findViewById(R.id.closeButton);

        String imagePath = getIntent().getStringExtra("image_path");

        // Load the full image with Glide
        Glide.with(this)
                .load(new File(imagePath))
                .into(fullScreenImageView);

        closeButton.setOnClickListener(v -> finish());
    }
}
