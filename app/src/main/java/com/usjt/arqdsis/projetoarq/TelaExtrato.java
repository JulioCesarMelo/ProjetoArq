package com.usjt.arqdsis.projetoarq;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;
import java.util.Locale;

public class TelaExtrato extends AppCompatActivity {

    private EditText dias;
    private Date data;
    public static final String CHAVE = "br.usjt.arqdesis.projetoarq.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extrato);
        dias = (EditText)findViewById(R.id.dataInicio);
    }

    public void consultarExtrato(View view) {
        Intent intent = new Intent(this, ResultadoExtrato.class);
        RadioButton rb7 = (RadioButton)findViewById(R.id.r7Dias);
        RadioButton rb15 = (RadioButton)findViewById(R.id.r15Dias);
        if(!rb7.isChecked()) {
            if (!rb15.isChecked()) {
                String chave = dias.getText().toString();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ParsePosition pos = new ParsePosition(0);
                sdf.setLenient(false);
                data = sdf.parse(chave, pos);
            } else {
                // data final igual a hoje
                Date dataFinal = new Date();
                // usa calendar para subtrair data
                Calendar calendarData = Calendar.getInstance();
                calendarData.setTime(dataFinal);
                int numeroDiasParaSubtrair = 15;
                // achar data de início
                calendarData.add(Calendar.DATE, numeroDiasParaSubtrair*(-1));
                data = calendarData.getTime();
            }
        }
        else {
            // data final igual a hoje
            Date dataFinal = new Date();
            // usa calendar para subtrair data
            Calendar calendarData = Calendar.getInstance();
            calendarData.setTime(dataFinal);
            int numeroDiasParaSubtrair = 7;
            // achar data de início
            calendarData.add(Calendar.DATE, numeroDiasParaSubtrair*(-1));
            data = calendarData.getTime();
        }

        SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-dd");
        String chave = fr.format(data);

        intent.putExtra(CHAVE,chave);
        startActivity(intent);
    }

    public void sendMessageCancelar(View view) {
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }
/*
    public void buscarClientes(View view){
        Intent intent = new Intent(this, ListaClientesActivity.class);
        String chave = nome.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent); }
*/
}

