package com.example.news;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewsDetails extends AppCompatActivity {
    private int image;
    private String title;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_details);

        image = getIntent().getIntExtra("image", 0);
        title = getIntent().getStringExtra("title");
        description = getIntent().getStringExtra("description");

        ImageView newsImage = findViewById(R.id.newsImage);
        TextView newsTitle = findViewById(R.id.newsTitle);
        TextView newsDescription = findViewById(R.id.newsDescription);
        Button shareButton = findViewById(R.id.share_button);
        newsImage.setImageResource(image);
        newsTitle.setText(title);
        newsDescription.setText(description);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, title);
        emailIntent.putExtra(Intent.EXTRA_TEXT, description);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "choose an email to share with"));
    }
}
