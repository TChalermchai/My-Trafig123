package com.chalouis.mytrafig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView nameTextView, detailTextView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //bund wiget
        nameTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        imageView = (ImageView) findViewById(R.id.imageView2);

        // show view
        String strName = getIntent().getStringExtra("Name");
        nameTextView.setText(strName);

        int intImage = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        imageView.setImageResource(intImage);

        int intInddex = getIntent().getIntExtra("index", 0);
        String[] detalStrings = getResources().getStringArray(R.array.detal_Long);
        detailTextView.setText(detalStrings[intInddex]);

    }   //main Method

    public void clickBank(View view){
        finish();
    }



}   //main Class
