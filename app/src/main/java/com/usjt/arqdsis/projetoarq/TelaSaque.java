package com.usjt.arqdsis.projetoarq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaSaque extends AppCompatActivity {
    public static final String VALOR = "br.usjt.arqdesis.projetoarq.valor";
    public EditText chave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saque);
        chave = (EditText)findViewById(R.id.valorSaque);
    }

    public void sendMessage(View view){
        String valor = chave.getText().toString();
        Intent intent = new Intent(this, ResultadoSaque.class);
        intent.putExtra(VALOR,valor);
        startActivity(intent);
    }

    public void sendMessageCancelar(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}
