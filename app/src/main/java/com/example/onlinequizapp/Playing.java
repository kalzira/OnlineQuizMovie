package com.example.onlinequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.onlinequizapp.Common.Common;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class Playing extends AppCompatActivity implements View.OnClickListener{


    ImageView image_quiestion;
    Button btnA, btnB, btnC, btnD;
    TextView result_text,question_text;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);




        question_text = findViewById(R.id.question_text);
    result_text = findViewById(R.id.result_txt);



        btnA = findViewById(R.id.btnAnswerA);
        btnB = findViewById(R.id.btnAnswerB);
        btnC = findViewById(R.id.btnAnswerC);
        btnD = findViewById(R.id.btnAnswerD);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        Intent intent = getIntent();
        String categoryId = intent.getStringExtra("categoryId");

        if(categoryId.equals("01")) {
            question_text.setText("Saske");
            btnA.setText("Naruto");
            btnB.setText("Death Note");
            btnC.setText("Rangers");
            btnD.setText("One peace");
        } if(categoryId.equals("02")) {
            question_text.setText("SpiderMan");
            btnA.setText("DC");
            btnB.setText("Marvel");
            btnC.setText("Not from comics");
            btnD.setText("Real");
        }if(categoryId.equals("03")) {
            question_text.setText("Joker 2019");
            btnA.setText("Jack Nicholson");
            btnB.setText("Joaquin Phoenix ");
            btnC.setText("Heath Ledger");
            btnD.setText("Jared Leto");
        } if(categoryId.equals("04")) {
            question_text.setText("Elsa");
            btnA.setText("Beauty and the Beast");
            btnB.setText("Cinderella");
            btnC.setText("Frozen");
            btnD.setText("Sleeping Beauty");
        }
        if(categoryId.equals("05")) {
            question_text.setText("HOUSE M.D.");
            btnA.setText("Robert Sean Leonard");
            btnB.setText("Lisa Edelstein");
            btnC.setText("Jesse Gordon Spencer");
            btnD.setText("James Hugh Calum Laurie");
        }

    }

    @Override
    public void onClick(View view) {
        Intent intent = getIntent();
        String categoryId = intent.getStringExtra("categoryId");
        if(categoryId.equals("01")){
            switch(view.getId()){
                case R.id.btnAnswerA:
                    result_text.setText("Yes!");
                    break;
                case R.id.btnAnswerB:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerC:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerD:
                    result_text.setText("Wrong!");
                    break;
            }

        }
        if(categoryId.equals("02")){
            switch(view.getId()){
                case R.id.btnAnswerA:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerB:
                    result_text.setText("Yes!");
                    break;
                case R.id.btnAnswerC:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerD:
                    result_text.setText("Yes!");
                    break;

            }

        }
        if(categoryId.equals("03")){
            switch(view.getId()){
                case R.id.btnAnswerA:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerB:
                    result_text.setText("Yes!");
                    break;
                case R.id.btnAnswerC:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerD:
                    result_text.setText("Wrong!");
                    break;

            }

        }
        if(categoryId.equals("04")){
            switch(view.getId()){
                case R.id.btnAnswerA:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerB:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerC:
                    result_text.setText("Yes!");
                    break;
                case R.id.btnAnswerD:
                    result_text.setText("Wrong!");
                    break;

            }

        }
        if(categoryId.equals("05")){
            switch(view.getId()){
                case R.id.btnAnswerA:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerB:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerC:
                    result_text.setText("Wrong!");
                    break;
                case R.id.btnAnswerD:
                    result_text.setText("Yes!");
                    break;

            }

        }


    }
}
