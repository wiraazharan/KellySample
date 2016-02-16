package com.magic.wiraazharan.kellyjapan;


import android.app.Activity;
import android.content.Intent;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

import android.os.CountDownTimer;

import android.os.Bundle;

import android.view.View;

import android.widget.ImageView;

import android.widget.Button;

public class MainActivity2 extends Activity implements View.OnClickListener {


//    ImageView imageView1;
//
//    int[] question;
//
//    int[] answer;
//
//    int i;
//
//    int[] imageArray;
//
//    Button buttonYes;
//
//    Button buttonNo;
//
//    MyCountDownTimer timer;
//
//    @Override
//
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_main2);
//
//        //Initialization of button
//
//        buttonYes = (Button)findViewById(R.id.buttonYes);
//
//        buttonYes.setVisibility(View.INVISIBLE);
//
//        buttonNo = (Button)findViewById(R.id.buttonNo);
//
//        buttonNo.setVisibility(View.INVISIBLE);
//
//        //Implement onClickListener
//
//        buttonYes.setOnClickListener(this);
//
//        buttonNo.setOnClickListener(this);
//
////Question array
//
//        int[] question = {R.drawable.image1, R.drawable.image1,R.drawable.image1,R.drawable.image1,
//                R.drawable.image1, R.drawable.image1,R.drawable.image1,R.drawable.image1,
//                R.drawable.image1, R.drawable.image1};
//
//
////Answer array
//        int[] answer = {R.drawable.greycross, R.drawable.greycross,R.drawable.greycross,R.drawable.greycross,
//                R.drawable.greycross, R.drawable.greycross,R.drawable.greycross,R.drawable.greycross,
//                R.drawable.greycross, R.drawable.greycross};
//
//
////ImageView array
//
//        int[] imageArray = {R.drawable.image1, R.drawable.image2,question[i],R.drawable.image1,
//                answer[i]};
//
//        //Loop for imageArray
//
//        for ( i = 0;  i<imageArray.length; i++){
//
//            imageView1.setImageResource(imageArray[0]);
//
//            for (int j=0; j<question.length; j++){
//
//                for (int k=0; k<answer.length; k++){
//
////PreProcess (img1, img2, ques, img1, ans)
//
//                    PreProcess(15000, 15500, 17000, 24000, 26000);
//
//
//
////TimeToShowButton
//
//                    TimeToShowButton(29000);
//
//
//
////Time for one loop to end before continuing another loop
//
//                    timer = new MyCountDownTimer(34000, 1000);
//
//                    timer.start();
//
//                }
//
//            }
//
//        }
//
//    }
//
////Timer for PreProcess
//
//    public void PreProcess(int timer1, int timer2,  int timer3, int timer4, int timer5) {
//
//
//
//        RunTimer(timer1, 1);
//
//        RunTimer(timer2, 2);
//
//        RunTimer(timer3, 2);
//
//        RunTimer(timer4, 3);
//
//        RunTimer(timer5, 4);
//
//    }
//
//
//
////Timer to show button
//
//    private void TimeToShowButton (int mytimer1){
//
//
//
//        new CountDownTimer(mytimer1, 1000) {
//
//
//
//            public void onTick(long millisUntilFinished) {
//
//
//
//            }
//
//
//
//            public void onFinish() {
//
//                buttonYes.setVisibility(View.VISIBLE);
//
//                buttonNo.setVisibility(View.VISIBLE);
//
////Button visible at 29000ms
//
//            }
//
//        }.start();
//
//    }
//
//    //Timer to display multiple images with different time interval
//
//    private void RunTimer(int myTimer, final int position){
//
//
//
//        new CountDownTimer(myTimer, 1000) {
//
//
//
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//
//
//            public void onFinish() {
//
//                imageView1.setImageResource(imageArray[position]);
//
//                imageView1.setVisibility(View.VISIBLE);
//
//            }
//
//        }.start();
//
//    }
//
//
//
////Implement onClick on button
//
////Prompt to button click, loop continue
//
//    public void onClick(View view) {
//
//        switch (view.getId())
//
//        {
//
//            case R.id.buttonYes:
//
//                //CONTINUE LOOP
//
//                break;
//
//
//            case R.id.buttonNo:
//
//                //CONTINUE LOOP
//
//                break;
//
//        }
//
//    }
//
//
//
//    //If there is no button click within 2.0s, loop continue
//
//    private class MyCountDownTimer extends CountDownTimer{
//
//
//
//        public MyCountDownTimer(long millisinfuture , long countDownInterval){
//
//            super(millisinfuture,countDownInterval);
//
//        }
//
//
//
//        @Override
//
//        public void onTick(long l) {
//
//
//
//        }
//
//
//
//        @Override
//
//        public void onFinish() {
//
//            //CONTINUE LOOP
//
//        }
//
//    }
//
//
//
//
//
//}

    ImageView imageView1;

    int[] question;

    int[] answer;

    int[] imageArray;

    int k = 0;

    Button buttonYes;
    Button buttonNo;

    MyCountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Initialization of button
        buttonYes = (Button) findViewById(R.id.buttonYes);
        buttonYes.setVisibility(View.INVISIBLE);

        buttonNo = (Button) findViewById(R.id.buttonNo);
        buttonNo.setVisibility(View.INVISIBLE);

        //Implement onClickListener
        buttonYes.setOnClickListener(this);
        buttonNo.setOnClickListener(this);

//Question array
        question = new int[10];
        question[0] = R.drawable.image1;
        question[1] = R.drawable.image2;
        question[2] = R.drawable.image3;
        question[3] = R.drawable.image1;
        question[4] = R.drawable.image1;
        question[5] = R.drawable.image1;
        question[6] = R.drawable.image1;
        question[7] = R.drawable.image1;
        question[8] = R.drawable.image1;
        question[9] = R.drawable.image1;


//Answer array
        answer = new int[10];
        answer[0] = R.drawable.image4;
        answer[1] = R.drawable.image5;
        answer[2] = R.drawable.image4;
        answer[3] = R.drawable.image4;
        answer[4] = R.drawable.image4;
        answer[5] = R.drawable.image4;
        answer[6] = R.drawable.image4;
        answer[7] = R.drawable.image4;
        answer[8] = R.drawable.image4;
        answer[9] = R.drawable.image4;



        imageView1 = (ImageView) findViewById(R.id.imageView1);

        loopimageArray();

    }
//        }
//    }

    public void loopimageArray() {

        //ImageView array
        imageArray = new int[5];
        imageArray[0] = R.drawable.greycross;
        imageArray[1] = R.drawable.redcross;
        imageArray[2] = question[k];
        imageArray[3] = R.drawable.redcross;
        imageArray[4] = answer[k];



            imageView1.setImageResource(imageArray[0]);


//PreProcess (img1, img2, ques, img1, ans)
            PreProcess(15000, 15500, 17000, 24000, 26000);

//TimeToShowButton
            TimeToShowButton(29000);


            timer = new MyCountDownTimer(34000, 1000);
            timer.start();
        //}
    }


    //Timer for PreProcess
    public void PreProcess(int timer1, int timer2, int timer3, int timer4, int timer5) {

        RunTimer(timer1, 1 );
        RunTimer(timer2, 2 );
        RunTimer(timer3, 2 );
        RunTimer(timer4, 3 );
        RunTimer(timer5, 4 );
    }

    //Timer to show button
    private void TimeToShowButton(int mytimer1) {

        new CountDownTimer(mytimer1, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                buttonYes.setVisibility(View.VISIBLE);
                buttonNo.setVisibility(View.VISIBLE);
//Button visible at 29000ms
            }
        }.start();
    }

    //Timer to display multiple images with different time interval
    private void RunTimer(int myTimer, final int position) {

        new CountDownTimer(myTimer, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                imageView1.setImageResource(imageArray[position]);
                imageView1.setVisibility(View.VISIBLE);
            }
        }.start();
    }
    

    //Implement onClick on button
//Prompt to button click, loop continue
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonYes:
                if (k<10) {
                    k++;
                    loopimageArray();
                    buttonYes.setVisibility(View.INVISIBLE);
                    buttonNo.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.buttonNo:
                if (k<10) {
                    k++;
                    loopimageArray();
                    buttonYes.setVisibility(View.INVISIBLE);
                    buttonNo.setVisibility(View.INVISIBLE);
                }
        }
    }


    //If there is no button click within 2.0s, loop continue
    private class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisinfuture, long countDownInterval) {
            super(millisinfuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {

        }

        @Override
        public void onFinish() {
            if (k<10) {
                k++;
                loopimageArray();
                buttonYes.setVisibility(View.INVISIBLE);
                buttonNo.setVisibility(View.INVISIBLE);
            }
        }
    }

}

