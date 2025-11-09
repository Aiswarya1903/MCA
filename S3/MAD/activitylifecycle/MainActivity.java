package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.lifecycle);
        updateText("onCreate called");
    }
    @Override
    protected void onStart(){
        super.onStart();
        updateText("onStart called");
    }

    @Override
    protected void onResume(){
        super.onResume();
        updateText("onResume called");
    }

    @Override
    protected void onPause(){
        super.onPause();
        updateText("onPause called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        updateText("onStop called");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        updateText("onRestart called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        updateText("onDestroy called");
    }

    private void updateText(String message){
        tv.setText(message);
    }
}