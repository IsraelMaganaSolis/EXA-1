package com.example.exa_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Volumen extends AppCompatActivity {
    private TextView textView;
    private ProgressBar progressBar;
    private SeekBar seekBar;
    private TextView textView2;
    private ProgressBar progressBar2;
    private SeekBar seekBar2;
    private TextView textView4;
    private TextView textview5;
    private EditText editText;
    int v;

    int iAngulo;
    int iRadio;
    double dResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_volumen);


        seekBar = (SeekBar) findViewById(R.id.seekBar1);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView3);


        textView4 = (TextView) findViewById(R.id.textView4);
        textview5 = (TextView) findViewById(R.id.textView5);
        editText = (EditText) findViewById(R.id.edtText);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                iAngulo = i;


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });



    }




    public void onClick(View view) {


            String edtText = editText.getText().toString();
            iRadio = Integer.parseInt(edtText);

            Toast.makeText(this, "Con un radio de: " + iRadio + " y un angulo de: " + iAngulo, Toast.LENGTH_SHORT).show();
            float numero1 = 2;
            float numero2 = 3;
            float fraccion = (numero1 / numero2);

            dResultado = fraccion * (iAngulo * iRadio * 3);

            Toast.makeText(this, "El resultado es: " + dResultado, Toast.LENGTH_SHORT).show();

            Toast.makeText(this, "Porfavor, ingrese solo numeros :b", Toast.LENGTH_SHORT).show();


    }
    public void volverMenu(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }

}

