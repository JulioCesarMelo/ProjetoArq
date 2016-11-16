package com.usjt.arqdsis.projetoarq;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ResultadoExtrato extends AppCompatActivity {
    public static final String DATA = "br.usjt.arqdesis.clientep1.data";
    ArrayList<ExtratoList> lista;
    Activity atividade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_extrato);
        atividade = this;
        Intent intent = getIntent();
        SimpleDateFormat p =  new SimpleDateFormat("yyyy-MM-dd");
        String chave = intent.getStringExtra(TelaExtrato.CHAVE);
        Date data = null;
        try {
            data = p.parse(chave);
        }catch (ParseException ex ){
            ex.printStackTrace();
        }
        lista = geraExtrato(data);
        ExtratoList[] list=(ExtratoList[])lista.toArray(new ExtratoList[lista.size()]);
        BaseAdapter adapter = new ListExtratoAdapter(this, list);
        ListView listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);


        /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // manda para a tela de detalhe
                Intent intent = new Intent(atividade, DetalheClienteActivity.class);
                intent.putExtra(NOME, lista.get(position));
                startActivity(intent);
            }
        });*/
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, TelaMenu.class);
        startActivity(intent);
    }


    public ArrayList<ExtratoList> geraExtrato(Date chave) {
        ArrayList<ExtratoList> lista = geraListaExtrato();
        ArrayList<ExtratoList> subLista = new ArrayList<ExtratoList>();
        if (chave == null) {
            return lista;
        } else {

            for (int i = 0;i<lista.size();i++) {
                if (chave.before(lista.get(i).data)) {
                    subLista.add(lista.get(i));
                }
            }
            return subLista;
        }
    }

    public ArrayList<ExtratoList> geraListaExtrato() {
        ArrayList<ExtratoList> lista = new ArrayList<ExtratoList>();
        Calendar c = Calendar.getInstance();

        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        ExtratoList extratoList = new ExtratoList(data,1000.00, 's');
        lista.add(extratoList);

        c.set(2013, Calendar.DECEMBER, 1);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 'd');
        lista.add(extratoList);

        c.set(2014, Calendar.FEBRUARY, 28);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 's');
        lista.add(extratoList);

        c.set(2014, Calendar.NOVEMBER, 1);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 's');
        lista.add(extratoList);

        c.set(2015, Calendar.FEBRUARY, 28);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 'd');
        lista.add(extratoList);

        c.set(2015, Calendar.JUNE, 28);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 's');
        lista.add(extratoList);

        c.set(2015, Calendar.NOVEMBER, 15);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 'd');
        lista.add(extratoList);

        c.set(2016, Calendar.JANUARY, 28);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 's');
        lista.add(extratoList);

        c.set(2016, Calendar.OCTOBER, 28);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 'd');
        lista.add(extratoList);

        c.set(2016, Calendar.NOVEMBER, 01);
        data = c.getTime();
        extratoList = new ExtratoList(data,1500.00, 's');
        lista.add(extratoList);

        c.set(2016, Calendar.NOVEMBER, 07);
        data = c.getTime();
        extratoList = new ExtratoList(data,2000.00, 'd');
        lista.add(extratoList);


        return lista;
    }


}
