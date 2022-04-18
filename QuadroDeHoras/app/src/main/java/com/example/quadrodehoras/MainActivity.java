package com.example.quadrodehoras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText horaInicial, minutoInicial, horaFinal, minutoFinal;
    TextView horaTotal, minutoTotal;

    int hInicial ,mInicial ,hFinal,mFinal,hTotal,mTotal;

    String hTresultado, mTresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        horaInicial = findViewById(R.id.hInicial);
        minutoInicial = findViewById(R.id.mInicial);

        horaFinal = findViewById(R.id.hFinal);
        minutoFinal = findViewById(R.id.mFinal);

        horaTotal = findViewById(R.id.hTotal);
        minutoTotal = findViewById(R.id.mTotal);
    }
    public void SomarHora(View somar) {
        hInicial = Integer.parseInt(horaInicial.getText().toString());
        mInicial = Integer.parseInt(minutoInicial.getText().toString());

        hFinal = Integer.parseInt(horaFinal.getText().toString());
        mFinal = Integer.parseInt(minutoFinal.getText().toString());



        mTotal = mInicial + mFinal;
        hTotal = hInicial + hFinal;

        while (mTotal > 59) {
            hTotal++;
            mTotal = mTotal - 60;
        }
        horaTotal.setText("resultado:" +hTotal);
        minutoTotal.setText("resultado:" +mTotal);
    }

    public void subtrairHora(View subtrair) {
        hInicial = Integer.parseInt(horaInicial.getText().toString());
        mInicial = Integer.parseInt(minutoInicial.getText().toString());

        hFinal = Integer.parseInt(horaFinal.getText().toString());
        mFinal = Integer.parseInt(minutoFinal.getText().toString());



        mTotal = mInicial - mFinal;
        hTotal = hInicial - hFinal;
        while (mTotal > 59) {
            hTotal++;
            mTotal = mTotal - 60;
        }

        while (mTotal < 0) {
            hTotal--;
            mTotal = mTotal + 60;

        }
        hTresultado = String.valueOf(hTotal);
        mTresultado = String.valueOf(mTotal);
        horaTotal.setText("resultado :" +hTresultado);
        minutoTotal.setText("resultado :" +mTresultado);
    }

    public void resetarHora(View resetar) {
        horaInicial.setText("");
        minutoInicial.setText("");
        horaFinal.setText("");
        minutoFinal.setText("");
        horaTotal.setText("");
        minutoTotal.setText("");
    }
}
