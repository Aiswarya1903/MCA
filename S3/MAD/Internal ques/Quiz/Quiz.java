package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Quiz extends AppCompatActivity {
    Button submit;
    RadioGroup rg1,rg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_quiz);

        submit=findViewById(R.id.button3);
        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.radioGroup2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalculateScore();
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void CalculateScore(){
        int score=0;
        if(rg1.getCheckedRadioButtonId()==R.id.ans){
            score++;
        }
        if(rg2.getCheckedRadioButtonId()==R.id.ans2){
            score++;
        }

        Intent intent=new Intent(Quiz.this,result.class);
        intent.putExtra("Score",score);
        startActivity(intent);
    }
}