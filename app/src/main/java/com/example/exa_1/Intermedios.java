package com.example.exa_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Intermedios  extends AppCompatActivity {
    private TextView textView;
    private ProgressBar progressBar;
    private SeekBar seekBar;
    private TextView textView2;
    private ProgressBar progressBar2;
    private SeekBar seekBar2;

    private TextView textview5;
    int v;
    int f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermedios);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView3);

        seekBar2 = (SeekBar) findViewById(R.id.seekBar2);

        textview5 = (TextView) findViewById(R.id.textView5);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                textView.setText("" + i + "%");

                v=i;




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Intermedios.this, "El nuevo valor es "+v, Toast.LENGTH_SHORT).show();
                if (v<=f){
                    textview5.setText( "ACREDITADO!!!");
                }else
                    textview5.setText("NO ACREDITADO!");

            }

        });


        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar2, int c, boolean b) {

                textView2.setText("" + c + "%");
                f=c;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Intermedios.this, "El nuevo valor es:"+f, Toast.LENGTH_SHORT).show();

                if (v<=f){
                    textview5.setText( "ACREDITADO");
                }else
                    textview5.setText("NO ACREDITADO!!!");

            }
        });






    }


}


