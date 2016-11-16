package com.usjt.arqdsis.projetoarq;

       import android.widget.ImageView;
       import android.widget.TextView;

public class ViewHolder {
    private ImageView foto;
    private TextView data, valor;

    public ViewHolder(ImageView foto, TextView data, TextView valor) {
        this.foto = foto;
        this.data = data;
        this.valor = valor;
    }

    public ImageView getFoto() {
        return foto;
    }

    public void setFoto(ImageView foto) {
        this.foto = foto;
    }

    public TextView getData() {
        return data;
    }

    public void setData(TextView data) {
        this.data = data;
    }

    public TextView getValor() {
        return valor;
    }

    public void setValor(TextView valor) {
        this.valor = valor;
    }
}

