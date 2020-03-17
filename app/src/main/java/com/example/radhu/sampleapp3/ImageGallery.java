package com.example.radhu.sampleapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageGallery extends AppCompatActivity {
    int[] images = {R.drawable.bird,
                    R.drawable.cow,
                    R.drawable.dog,
                    R.drawable.pirate,
                    R.drawable.sheep,
                    R.drawable.tweety};
    private ImageView imageView;
    private Button nextButton;
    private Button previousButton;
    private int current_image_index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_gallery);
        imageView = (ImageView) findViewById(R.id.imageView);
        nextButton = (Button) findViewById(R.id.nextButton);
        previousButton = (Button) findViewById(R.id.previousButton);
        imageView.setImageResource(images[current_image_index]);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index++;
                if (current_image_index >= 6) {
                    current_image_index = 0;
                }
                imageView.setImageResource(images[current_image_index]);

            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_image_index--;
                if (current_image_index <= 0) {
                    current_image_index = 6;
                }
                imageView.setImageResource(images[current_image_index]);

            }
        });
    }
}
