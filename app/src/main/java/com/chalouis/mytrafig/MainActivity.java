package com.chalouis.mytrafig;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit หรือการประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButtom = (Button) findViewById(R.id.button);

        //controller button
        controllerButton();

    }   //main Methol หรือเมทอตหลัก

    private void controllerButton() {


        aboutMeButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.cat);
                mediaPlayer.start();

            } //onclick
        });

    }   //controller Button เป็นเมทอตของคอนทรอเลอร์

}   // main class นี่คือ class หลัก
