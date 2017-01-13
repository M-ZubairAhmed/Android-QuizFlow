package com.zubairahmed.udacityquizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

/*    int[] score = new int[9];

    public void question1(View view){
        RadioButton q1 = (RadioButton) findViewById (R.id.ans1);
        if (q1.isChecked ()) {
            score[0] = 1;
            Log.d("ZZZA",String.valueOf(score[0]));
        }
        else {
            score[0]=0;
            Log.d("ZZZB",String.valueOf(score[0]));
        }
    }*/

}
