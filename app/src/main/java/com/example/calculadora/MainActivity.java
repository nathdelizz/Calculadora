package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText PrimeiroValor;
    EditText SegundoValor;
    TextView tvResultado;

    Button buttonSoma;

    Button buttonSubtracao;

    Button buttonMulti;

    Button buttonDivisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrimeiroValor = findViewById(R.id.PrimeiroValor);
        SegundoValor = findViewById(R.id.SegundoValor);
        tvResultado = findViewById(R.id.tvResultado);
        buttonSoma = findViewById(R.id.buttonSoma);
        buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonMulti = findViewById(R.id.buttonMulti);
        buttonDivisao = findViewById(R.id.buttonDivisao);

        buttonSoma.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 +valor2;
                tvResultado.setText( String.valueOf(resultado));
            }
        });
        buttonSubtracao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 - valor2;
                tvResultado.setText( String.valueOf(resultado));
            }
        });//teste
        buttonMulti.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 * valor2;
                tvResultado.setText( String.valueOf(resultado));
            }
        });
        buttonDivisao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                double valor1 = Double.parseDouble(PrimeiroValor.getText().toString());
                double valor2 = Double.parseDouble(SegundoValor.getText().toString());
                double resultado = valor1 / valor2;
                tvResultado.setText( String.valueOf(resultado));
            }
        });

    }
}