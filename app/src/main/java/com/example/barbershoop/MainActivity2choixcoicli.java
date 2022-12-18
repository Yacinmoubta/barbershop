package com.example.barbershoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2choixcoicli extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2choixcoicli);
        button = findViewById(R.id.button5);
        button.setOnClickListener(view ->  openactivity_cnxcli());


    }
    private void openactivity_cnxcli() {
        Intent intent = new Intent(this, cnxcli.class);
        startActivity(intent);
}
}