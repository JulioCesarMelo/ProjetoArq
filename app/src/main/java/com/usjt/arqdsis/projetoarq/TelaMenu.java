package com.usjt.arqdsis.projetoarq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_menu);
    }

    public void sendMessageSaque(View view){
        Intent intent = new Intent(this, TelaSaque.class);
        startActivity(intent);
    }

    public void sendMessageExtrato(View view){
        Intent intent = new Intent(this, TelaExtrato.class);
        startActivity(intent);
    }

    public void sendMessageSair(View view){
        Intent intent = new Intent(this, TelaLogin.class);
        startActivity(intent);
    }
}
