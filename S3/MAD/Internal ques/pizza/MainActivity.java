package com.example.pizzashop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt1;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt1=findViewById(R.id.editTextText);
        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edt1.getText().toString();
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter your name!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(MainActivity.this,Customise.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edt1.getText().toString();
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter your name!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent=new Intent(MainActivity.this,view.class);
                    intent.putExtra("name",name);
                    startActivity(intent);
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