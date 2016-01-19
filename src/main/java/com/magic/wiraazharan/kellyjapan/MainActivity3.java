package com.magic.wiraazharan.kellyjapan;

import android.app.Activity;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.Timer;

public class MainActivity3 extends Activity {

    Button buttonyes;
    Button buttonno;

    MyCountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        timer = new MyCountDownTimer(4000,1000);
        //timer.start();
    }


    private class MyCountDownTimer extends CountDownTimer{

        public MyCountDownTimer(long millisinfuture , long countDownInterval){
            super(millisinfuture,countDownInterval);
        }

        @Override
        public void onTick(long l) {

        }

        @Override
        public void onFinish() {
            Intent myIntent3 = new Intent(MainActivity3.this,MainActivity.class);
        }
    }
}
