package com.example.geometria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RadioButton  rBtAt, rBtAbPorAt, rBtAbPorV, rBtAf, rBtNl, rBtV, rBtH;

    ArrayList<telaDaConta> listaBotoes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        rBtAt = findViewById(R.id.radioBt_areaTotal);
        rBtAbPorAt = findViewById(R.id.radioBt_areaBasePelaAreaTotal);
        rBtAbPorV = findViewById(R.id.radioBt_areaBasePeloVolume);
        rBtAf = findViewById(R.id.radioBt_areaFaces);
        rBtNl = findViewById(R.id.radioBt_numeroLados);
        rBtV = findViewById(R.id.radioBt_volume);
        rBtH = findViewById(R.id.radioBt_altura);
    }

    public void botaoProsseguir(View bProsseguir){

        Intent i = new Intent( this, telaDaConta.class);

        if(rBtAt.isChecked()){ // Fórmula da área total
            telaDaConta.conta = 1;
            startActivity(i);
        }
        else if (rBtAbPorAt.isChecked()){ // Fórmula da área da base a partir da área total
            telaDaConta.conta = 2;
            startActivity(i);
        }
        else if (rBtAbPorV.isChecked()){ // Fórmula da área da base a partir do volume
            telaDaConta.conta = 3;
            startActivity(i);
        }
        else if (rBtAf.isChecked()){ // Fórmula da área das faces
            telaDaConta.conta = 4;
            startActivity(i);
        }
        else if (rBtNl.isChecked()){ // Fórmula para descobrir o número de lados
            telaDaConta.conta = 5;
            startActivity(i);
        }
        else if (rBtV.isChecked()){ // Fórmula do volume
            telaDaConta.conta = 6;
            startActivity(i);
        }
        else if (rBtH.isChecked()){ // Fórmula da altura
            telaDaConta.conta = 7;
            startActivity(i);
        }
        else{ // Quando nenhum é selecionado
            telaDaConta.conta = 0;
            Toast.makeText(this, "Nenhum cálculo foi selecionado.", Toast.LENGTH_SHORT).show();
        }
    }
}