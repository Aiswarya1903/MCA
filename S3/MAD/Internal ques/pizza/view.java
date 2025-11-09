package com.example.pizzashop;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class view extends AppCompatActivity {
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view);
        tv = findViewById(R.id.textView4);
        btn = findViewById(R.id.button3);
        Intent i = getIntent();
        String name = i.getStringExtra("name");

        SharedPreferences sp = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String size = sp.getString(name + "size", "no size");
        String toppings = sp.getString(name + "toppings", "no toppings");
        int total = sp.getInt(name + "total", -1);

        if (total == -1) {
            tv.setText("NO DATA FOUND");
        } else {
            String bill = "BILL GENERATION\n\n";
            bill += "Name :" + name + "\n";
            bill += "size: " + size + "\n";
            bill += "Toppings: " + toppings + "\n";

            tv.setText(bill);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(view.this, MainActivity.class);
                startActivity(in);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}