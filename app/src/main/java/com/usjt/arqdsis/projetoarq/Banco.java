package com.usjt.arqdsis.projetoarq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Banco extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.banco);

        ArrayList<String> lista = Date.buscaBancos(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(tihs,
                android.R.layout.simple_list_item_1, lista);
        ListView listView = (ListView) findViewById(R.id.lista_banco);
        listView.setAdapter(adapter);
    }


}
