package com.example.viewmodel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import static com.example.viewmodel.R.id.puntosA1;

public class MainActivity extends AppCompatActivity {


    TextView marcadorA, marcadorB;

    PuntuacionViewModel puntuaciónViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        puntuaciónViewModel = ViewModelProviders.of(MainActivity.this).get(PuntuacionViewModel.class);

        marcadorA = findViewById(R.id.marcadorA);
        marcadorB = findViewById(R.id.marcadorB);

        marcadorA.setText(String.valueOf(puntuaciónViewModel.puntosA));
        marcadorB.setText(String.valueOf(puntuaciónViewModel.puntosB));



        findViewById(R.id.puntosA1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuaciónViewModel.puntosA += 1;
                marcadorA.setText(String.valueOf(puntuaciónViewModel.puntosA));
            }
        });

        findViewById(R.id.puntosA2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuaciónViewModel.puntosA += 2;
                marcadorA.setText(String.valueOf(puntuaciónViewModel.puntosA));
            }
        });

        findViewById(R.id.puntosA3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuaciónViewModel.puntosA += 3;
                marcadorA.setText(String.valueOf(puntuaciónViewModel.puntosA));
            }
        });

        findViewById(R.id.puntosB1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuaciónViewModel.puntosB += 1;
                marcadorB.setText(String.valueOf(puntuaciónViewModel.puntosB));
            }
        });

        findViewById(R.id.puntosB2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuaciónViewModel.puntosB += 2;
                marcadorB.setText(String.valueOf(puntuaciónViewModel.puntosB));
            }
        });

        findViewById(R.id.puntosB3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuaciónViewModel.puntosB += 3;
                marcadorB.setText(String.valueOf(puntuaciónViewModel.puntosB));
            }
        });
    }
}
