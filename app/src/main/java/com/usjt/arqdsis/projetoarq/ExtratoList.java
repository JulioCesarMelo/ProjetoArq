package com.usjt.arqdsis.projetoarq;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Victor José on 02/11/2016.
 */

public class ExtratoList {
    Date data;
    double valor;
    char tipo;

    public ExtratoList(Date data, double valor, char tipo) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }
    public String getDataString() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        return s.format(data);
    }

    public double getValor() {
        return valor;
    }

    public String getValorString()
    {
        return valor+"";
    }
    public void setData(Date data) {
        this.data = data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getFoto(){
        String foto = ""+tipo;
        return foto;
    }
}
