package com.magic.wiraazharan.kellyjapan;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends Activity {

    AnimationDrawable animation;
    Timer timer;
    //MyTimerTask myTimerTask;


    ImageView imageView1;

    int[] imageArray = { R.drawable.greycross, R.drawable.redcross, R.drawable.image1};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView1  = (ImageView) findViewById(R.id.imageView1);
        imageView1.setImageResource(imageArray[0]);


        PreProcess(15500, 17000);

        TimeToShowQuestion(18000);


//        animation = (AnimationDrawable) imageView1.getDrawable();
//
//        imageView1.post(new Runnable() {
//            @Override
//            public void run() {
//                animation.start();
//            }
//        });
//
//
//        int duration = 0;
//        for ( int i= 0 ; i < animation.getNumberOfFrames(); i++)
//        {
//            duration += animation.getDuration(i);
//        }
//
//        timer = new Timer();
//        myTimerTask = new MyTimerTask();
//        timer.schedule(myTimerTask,duration);
//

    }


    public void PreProcess(int timerone,int timertwo){

            RunTimer(timerone,1);
            RunTimer(timertwo,0);



    }

    private void TimeToShowQuestion(int mytimer){

        new CountDownTimer(mytimer, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                Intent myIntent2 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(myIntent2);
                finish();
            }
        }.start();


    }

    private void RunTimer(int mytimer, final int position){


        new CountDownTimer(mytimer, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                imageView1.setImageResource(imageArray[position]);
                imageView1.setVisibility(View.VISIBLE);
            }
        }.start();


    }




//    class MyTimerTask extends TimerTask
//    {
//
//        @Override
//        public void run() {
//            try {
//                timer.cancel();
//                animation.stop();
//                finish();
//            }finally {
//                Intent myIntent2 = new Intent(MainActivity2.this, MainActivity3.class);
//                startActivity(myIntent2);
//                finish();
//            }
//        }
//    }


}
