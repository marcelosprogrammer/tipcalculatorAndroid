package br.disciplina.custoveiculo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCalcular;
    private TextView percentualDistribuidor;
    private TextView impostos;
    private TextView custoVeiculo;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        percentualDistribuidor = (TextView) findViewById(R.id.margemDistribuidorEditText);
        impostos = (TextView) findViewById(R.id.impostosEditText);
        custoVeiculo = (TextView) findViewById(R.id.custoEditText);
        resultado = (TextView) findViewById(R.id.resultado);



        btnCalcular = (Button) findViewById(R.id.btnCalcularTotal);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    double percentDistribuidor = Double.parseDouble(percentualDistribuidor.getText().toString());

                    double percentualImposto = Double.parseDouble(impostos.getText().toString());
                    double valorC = Double.parseDouble(custoVeiculo.getText().toString());
                    Double valorFinal = (valorC * percentDistribuidor / 100.0) + (valorC * percentualImposto / 100.0) + valorC;
                    resultado.setText(valorFinal.toString());
                }catch(Exception e){

                }

            }
        });
    }
}
