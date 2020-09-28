package com.example.exa_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ControlDeRotacion_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_de_rotacion_2);
    }
    public void volverMenu(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}