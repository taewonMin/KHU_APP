package com.studylink.khu_app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AccountSetActivity extends AppCompatActivity {

    TextView gender_male, gender_female, account_set_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_set);

        gender_male = findViewById(R.id.gender_male);
        gender_female = findViewById(R.id.gender_female);
        account_set_next = findViewById(R.id.account_set_next);

        gender_male.setClickable(true);
        gender_female.setClickable(true);
        account_set_next.setClickable(true);

        gender_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChange(gender_male, gender_female);
            }
        });
        gender_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorChange(gender_female, gender_male);
            }
        });

        account_set_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountSetActivity.this, AccountFinActivity.class);
                startActivity(intent);
            }
        });

    }

    public void colorChange(TextView change_blue, TextView change_gray){
        change_blue.setBackground(getResources().getDrawable(R.drawable.blue_border_register));
        change_gray.setBackground(getResources().getDrawable(R.drawable.gray_border_register));
        change_blue.setTextColor(Color.parseColor("#2f78db"));
        change_gray.setTextColor(Color.parseColor("#e4e4e4"));
    }

}