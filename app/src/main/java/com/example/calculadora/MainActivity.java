package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = findViewById(R.id.boton1);
        resultado = findViewById(R.id.resultado);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+" 1");

            }
        });

    }
}