package com.example.exa_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Mandar a llamar view
    public void ControlDeRotacion1(View view) {
        Intent ControlDeRotacion1 = new Intent(this, ControlDeRotacion_1.class);
    startActivity(ControlDeRotacion1);
    }
    public void ControlDeRotacion2(View view) {
        Intent ControlDeRotacion2 = new Intent(this, ControlDeRotacion_2.class);
        startActivity(ControlDeRotacion2);
    }

    public void INTERMEDIOS(View view) {
        Intent Intermedios = new Intent(this, Intermedios.class);
        startActivity(Intermedios);
    }

    public void VOLUMEN(View view) {
        Intent Volumen = new Intent(this, Volumen.class);
        startActivity(Volumen);
    }


}