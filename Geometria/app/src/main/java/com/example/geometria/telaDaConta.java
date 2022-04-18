package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class telaDaConta extends AppCompatActivity {

    static int conta;
    EditText et1, et2, et3; // campos para inserir valores
    TextView r; // texto da resposta
    double valorA;
    double valorB;
    double valorC;

    double areaTotal;
    double areaBase;
    double areaBasePeloVolume;
    double areaFaces;
    double numeroLados;
    double volume;
    double altura;

    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_da_conta);
        getSupportActionBar().hide();
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        r = findViewById(R.id.resposta);

        organizaTela();
    }
    public void organizaTela(){
        if (conta == 1){ // Fórmula da área total
            et1.setHint("Digite a área da base");
            et2.setHint("Digite o número de lados");
            et3.setHint("Digite a área de uma face.");

        }
        else if (conta == 2){ // Fórmula da área da base a partir da área total
            et1.setHint("Digite a área total");
            et2.setHint("Digite o número de lados");
            et3.setHint("Digite a área de um lado.");

        }
        else if (conta == 3){ // Fórmula da área da base a partir do volume
            et1.setHint("Digite o volume");
            et2.setHint("Digite a altura");
            et3.setVisibility(View.INVISIBLE); // escondeu o terceiro campo porque não precisa dele

        }
        else if (conta == 4){ // Fórmula da área das faces
            et1.setHint("Digite a área total.");
            et2.setHint("Digite a área da base");
            et3.setHint("Digite o número de lados.");

        }
        else if (conta == 5){ // Fórmula para descobrir o número de lados
            et1.setHint("Digite a área total.");
            et2.setHint("Digite a área da base");
            et3.setHint("Digite a área da face");

        }
        else if (conta == 6){ // Fórmula do volume
            et1.setHint("Digite a área da base");
            et2.setHint("Digite a altura");
            et3.setVisibility(View.INVISIBLE); // escondeu o terceiro campo porque não precisa dele

        }
        else if (conta == 7){ // Fórmula da altura
            et1.setHint("Digite o volume");
            et2.setHint("Digite a área da base");
            et3.setVisibility(View.INVISIBLE); // escondeu o terceiro campo porque não precisa dele

        }
    }

    public void cliqueNoBotao(View botaoCalculoView) {

        if (conta == 1){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());
            valorC = Double.parseDouble(et3.getText().toString());

            areaTotal = 2*valorA + valorB *valorC;
            resultado = String.valueOf(areaTotal);
        }
        else if (conta == 2){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());
            valorC = Double.parseDouble(et3.getText().toString());

            areaBase = (valorA - valorB * valorC)/2;
            resultado = String.valueOf(areaBase);
        }
        else if (conta == 3){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());

            areaBasePeloVolume = valorA/valorB;
            resultado = String.valueOf(areaBasePeloVolume);
        }
        else if (conta == 4){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());
            valorC = Double.parseDouble(et3.getText().toString());

            areaFaces = (valorA - (2*valorB))/valorC;
            resultado = String.valueOf(areaFaces);
        }
        else if (conta == 5){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());
            valorC = Double.parseDouble(et3.getText().toString());

            numeroLados = (valorA - (2*valorB))/valorC;
            resultado = String.valueOf(numeroLados);
        }
        else if (conta == 6){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());

            volume = valorA*valorB;
            resultado = String.valueOf(volume);
        }
        else if (conta == 7){
            valorA = Double.parseDouble(et1.getText().toString());
            valorB = Double.parseDouble(et2.getText().toString());

            altura = valorA/valorB;
            resultado = String.valueOf(altura);
        }

        r.setText("Resultado: "+resultado);
    }
}