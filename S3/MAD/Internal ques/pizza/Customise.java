package com.example.pizzashop;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Customise extends AppCompatActivity {
    Button btn;
    CheckBox c1,c2,c3;
    RadioGroup rg;
    RadioButton r1,r2,r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_customise);

        btn=findViewById(R.id.button4);
        c1=findViewById(R.id.cheese);
        c2=findViewById(R.id.ketchup);
        c3=findViewById(R.id.special);
        rg=findViewById(R.id.size);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String name=intent.getStringExtra("name");
                int selectedid=rg.getCheckedRadioButtonId();
                if(selectedid==-1){
                    Toast.makeText(Customise.this, "Choose a size", Toast.LENGTH_SHORT).show();
                }
                else{
                    int total=0;

                    String size="";
                    String toppings="";

                    if(selectedid==R.id.small){
                        size="small";
                        total+=100;
                    }
                    else if(selectedid==R.id.medium){
                        size="medium";
                        total+=200;
                    }
                    else{
                        size="large";
                        total+=300;
                    }
                    if(c1.isChecked()){
                        toppings+=" cheeese ";
                        total+=40;
                    }
                    if(c2.isChecked()){
                        toppings+=" ketchup ";
                        total+=50;
                    }
                    if(c3.isChecked()){
                        toppings+=" special ";
                        total+=100;
                    }
                    SharedPreferences sp=getSharedPreferences("MyPrefs",MODE_PRIVATE);
                    SharedPreferences.Editor se= sp.edit();
                    se.putString(name+"size",size);
                    se.putString(name+"toppings",toppings);
                    se.putInt(name+"total",total);
                    se.apply();

                    Intent i=new Intent(Customise.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}