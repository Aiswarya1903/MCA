package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div,res;
    EditText num1,num2;
    TextView tv;
    Double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.button5);
        sub=findViewById(R.id.button6);
        mul=findViewById(R.id.button8);
        div=findViewById(R.id.button9);
        res=findViewById(R.id.button10);
        num1=findViewById(R.id.editTextText);
        num2=findViewById(R.id.editTextText2);
        tv=findViewById(R.id.textView3);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("+");
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate("/");
            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("Result is:"+result);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void calculate(String op){
        if(num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()){
            Toast.makeText(this, "Please eneter both numbers!!", Toast.LENGTH_SHORT).show();
            return;
        }

        Double a=Double.parseDouble(num1.getText().toString());
        Double b=Double.parseDouble(num2.getText().toString());


        switch(op){
            case "+":result=a+b;break;
            case "-":result=a-b;break;
            case "*":result=a*b;break;
            case "/":
                if(b==0){
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    result=a/b;
                }break;


        }



    }
}