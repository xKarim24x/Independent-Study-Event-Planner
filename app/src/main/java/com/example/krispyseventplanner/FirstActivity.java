package com.example.krispyseventplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;

public class FirstActivity extends AppCompatActivity {


    private TextView createEventButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createEventButton = findViewById(R.id.createEventPlanButton);

    }
    public void eventButtonOnClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "data");
        startActivity(intent);
    }
}