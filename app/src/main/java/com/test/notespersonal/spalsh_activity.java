package com.test.notespersonal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class spalsh_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spalsh);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    //spalsh Screen
        Handler handler = new Handler(Looper.getMainLooper()); //(the main thread looper)
        handler.postDelayed(() -> // postDelayed is the method used to delay, "->" this is the lambda expression
        {
            Intent intent = new Intent(spalsh_activity.this, home_activity.class);
            startActivity(intent);
            finish(); // finish so that if the user presses back, they don't return to the splash screen
        }, 5000); // 2 seconds delay
    }
    }