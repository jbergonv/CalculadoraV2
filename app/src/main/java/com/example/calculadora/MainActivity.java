package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton1,boton0,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,botonComa;
    Button borrar,borrarTodo,botonSuma,botonIgual,botonMenos,botonDivi,botonMulti;
    TextView resultado;
    int flagComa=0;
    int operacion =0; //Suma = 1 || Resta = 2 || Multiplicación = 3 || División = 4
    double operando1,operando2,aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Botones de los números

        boton0 = findViewById(R.id.boton0);
        boton1 = findViewById(R.id.boton1);
        boton2 = findViewById(R.id.boton2);
        boton3 = findViewById(R.id.boton3);
        boton4 = findViewById(R.id.boton4);
        boton5 = findViewById(R.id.boton5);
        boton6 = findViewById(R.id.boton6);
        boton7 = findViewById(R.id.boton7);
        boton8 = findViewById(R.id.boton8);
        boton9 = findViewById(R.id.boton9);
        botonComa = findViewById(R.id.botonComa);

        //Acciones

        borrar = findViewById(R.id.borrar);
        borrarTodo = findViewById(R.id.borrarTodo);
        botonSuma = findViewById(R.id.botonSuma);
        botonIgual = findViewById(R.id.button);
        botonMenos = findViewById(R.id.botonMenos);
        botonDivi = findViewById(R.id.botonDividir);
        botonMulti = findViewById(R.id.botonMulti);
        resultado = findViewById(R.id.resultado);


        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"0");

            }
        });


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"1");

            }
        });


        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"2");

            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"3");

            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"4");

            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"5");

            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"6");

            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"7");

            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"8");

            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText(resultado.getText()+"9");

            }
        });

        botonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(flagComa == 0){

                    resultado.setText(resultado.getText()+".");
                    flagComa=1;

                }
                else{

                    Toast toast1 = Toast.makeText(getApplicationContext(),
                                    "No puedes poner mas puntos..", Toast.LENGTH_SHORT);

                    toast1.show();

                }

            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(resultado.length()>0){

                    String str = (String) resultado.getText();

                    str = str.substring(0,str.length()-1);

                    resultado.setText(str);

                }
                else{

                    Toast toast2 = Toast.makeText(getApplicationContext(),
                            "No hay nada que borrar..", Toast.LENGTH_SHORT);

                    toast2.show();

                }



            }
        });

        borrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultado.setText("");

            }
        });

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = 1;
                operando1 = Double.parseDouble((String)resultado.getText());
                resultado.setText("");
                flagComa=0;

            }
        });

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = 2;
                operando1 = Double.parseDouble((String)resultado.getText());
                resultado.setText("");
                flagComa=0;

            }
        });

        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = 3;
                operando1 = Double.parseDouble((String)resultado.getText());
                resultado.setText("");
                flagComa=0;

            }
        });

        botonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = 4;
                operando1 = Double.parseDouble((String)resultado.getText());
                resultado.setText("");
                flagComa=0;

            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            flagComa=0;

            operando2 = Double.parseDouble((String)resultado.getText());

            switch(operacion){

                case 1:

                        aux=operando1+operando2;
                        resultado.setText(String.valueOf(aux));

                    break;


                case 2:

                    aux=operando1-operando2;
                    resultado.setText(String.valueOf(aux));

                    break;

                case 3:

                    aux=operando1*operando2;
                    resultado.setText(String.valueOf(aux));

                    break;

                case 4:

                    aux=operando1/operando2;
                    resultado.setText(String.valueOf(aux));

                    break;


            }


            }
        });


    }
}