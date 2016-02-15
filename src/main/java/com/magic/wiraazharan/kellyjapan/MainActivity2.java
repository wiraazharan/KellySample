package com.magic.wiraazharan.kellyjapan;


        import android.app.Activity;
        import android.content.Intent;

        import android.support.v7.app.AppCompatActivity;

        import android.os.CountDownTimer;

        import android.os.Bundle;

        import android.view.View;

        import android.widget.ImageView;

        import android.widget.Button;

public class MainActivity2 extends Activity implements View.OnClickListener {



    ImageView imageView1;

    int[] question;

    int[] answer;

    int[] imageArray;

    Button buttonYes;

    Button buttonNo;

    MyCountDownTimer timer;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity2_main);

        //Initialization of button

        buttonYes = (Button)findViewById(R.id.buttonYes);

        buttonYes.setVisibility(View.INVISIBLE);

        buttonNo = (Button)findViewById(R.id.buttonNo);

        buttonNo.setVisibility(View.INVISIBLE);

        //Implement onClickListener

        buttonYes.setOnClickListener(this);

        buttonNo.setOnClickListener(this);

//Question array

        int[] question = {R.drawable.ques1, R.drawable.ques2,R.drawable.ques3,R.drawable.ques4,
                R.drawable.ques5, R.drawable.ques6,R.drawable.ques7,R.drawable.ques8,
                R.drawable.ques9, R.drawable.ques10};


//Answer array
        int[] answer = {R.drawable.red1, R.drawable.red2,R.drawable.red3,R.drawable.red4,
                R.drawable.red5, R.drawable.red6,R.drawable.red7,R.drawable.red8,
                R.drawable.red9, R.drawable.red10};


//ImageView array

        int[] imageArray = {R.drawable.img1, R.drawable.img2,R.drawable.img3,R.drawable.img4,
                R.drawable.img5, R.drawable.img6,R.drawable.img7,R.drawable.img8,
                R.drawable.img9, R.drawable.img10};

        //Loop for imageArray

        for (int i = 0;  i<imageArray.length; i++){

            imageView1.setImageResource(imageArray[0]);

            for (int j=0; j<question.length; j++){

                for (int k=0; k<answer.length; k++){

//PreProcess (img1, img2, ques, img1, ans)

                    PreProcess(15000, 15500, 17000, 24000, 26000);



//TimeToShowButton

                    TimeToShowButton(29000);



//Time for one loop to end before continuing another loop

                    timer = new MyCountDownTimer(34000, 1000);

                    timer.start();

                }

            }

        }

    }

//Timer for PreProcess

    public void PreProcess(int timer1, int timer2,  int timer3, int timer4, int timer5) {



        RunTimer(timer1, 1);

        RunTimer(timer2, 2);

        RunTimer(timer3, 2);

        RunTimer(timer4, 3);

        RunTimer(timer5, 4);

    }



//Timer to show button

    private void TimeToShowButton (int mytimer1){



        new CountDownTimer(mytimer, 1000) {



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

    private void RunTimer(int myTimer, final int position){



        new CountDownTimer(myTimer2, 1000) {



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

        switch (view.getId())

        {

            case R.id.buttonYes:

                //CONTINUE LOOP

                break;


            case R.id.buttonNo:

                //CONTINUE LOOP

                break;

        }

    }



    //If there is no button click within 2.0s, loop continue

    private class MyCountDownTimer extends CountDownTimer{



        public MyCountDownTimer(long millisinfuture , long countDownInterval){

            super(millisinfuture,countDownInterval);

        }



        @Override

        public void onTick(long l) {



        }



        @Override

        public void onFinish() {

            //CONTINUE LOOP

        }

    }





}

