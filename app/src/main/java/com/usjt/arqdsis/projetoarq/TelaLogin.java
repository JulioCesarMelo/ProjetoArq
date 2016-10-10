package com.usjt.arqdsis.projetoarq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaLogin extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.usjt.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tela_login);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
}
