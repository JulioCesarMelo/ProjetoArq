package com.usjt.arqdsis.projetoarq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoSaque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_saque);
        Intent intent = getIntent();
        String valor = intent.getStringExtra(TelaSaque.VALOR);
        TextView text = (TextView) findViewById(R.id.response);

        text.setText("Saque de R$"+ valor+" realizado com sucesso!!");


    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}
