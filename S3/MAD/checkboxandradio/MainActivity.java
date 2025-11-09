package com.example.checkboxandradio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg;
    RadioButton r1,r2;
    CheckBox c1,c2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        btn=findViewById(R.id.submit);
        r1=findViewById(R.id.female);
        r2=findViewById(R.id.male);
        c1=findViewById(R.id.english);
        c2=findViewById(R.id.malayalam);
        tv=findViewById(R.id.tv);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] s=new String[2];
                tv.setText("Languages Known:");
                if(c1.isChecked()){
                    tv.setText(tv.getText().toString()+" "+c1.getText());
                }
                if(c2.isChecked()){
                    tv.setText(tv.getText().toString()+" "+c2.getText());
                }
            }

        });
        rg=findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                if(checkedId==R.id.female){
                    Toast.makeText(getApplicationContext(), r1.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                if(checkedId==R.id.male){
                    Toast.makeText(getApplicationContext(), r2.getText(), Toast.LENGTH_SHORT).show();
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