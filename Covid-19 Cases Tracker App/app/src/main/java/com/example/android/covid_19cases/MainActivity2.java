package com.example.android.covid_19cases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.covid_19cases.MainActivity;
import com.example.android.covid_19cases.R;


public class MainActivity2 extends AppCompatActivity {

    TextView allcities;
    ImageView guidlines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        allcities=findViewById(R.id.allcities);
        guidlines=findViewById(R.id.ib1);


        allcities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        guidlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/health-topics/coronavirus#tab=tab_2"));
                startActivity(intent);
            }
        });

    }
}