package com.usjt.arqdsis.projetoarq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultadoExtrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_extrato);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}
