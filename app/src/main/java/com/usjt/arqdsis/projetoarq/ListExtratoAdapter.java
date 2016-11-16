package com.usjt.arqdsis.projetoarq;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Victor José on 02/11/2016.
 */
    public class ListExtratoAdapter extends BaseAdapter
    {
        Activity context;
        ExtratoList[] extratoLists;
        Object[] sectionHeaders;

        public ListExtratoAdapter(Activity context, ExtratoList[] extratoLists) {
            this.context = context;
            this.extratoLists = extratoLists;
        }
        public int getCount()
        {
            return extratoLists.length;
        }

        public Object getItem(int position) {
            if(position >= 0 && position < extratoLists.length)
                return extratoLists[position];
            else
                return null;
        }

        public long getItemId(int position) {
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            //o list view recicla os layouts para melhor performance
            //o layout reciclado vem no parametro convert view
            View view = convertView;
            //se nao recebeu um layout para reutilizar deve inflar um
            if(view == null) {
                //um inflater transforma um layout em uma view
                LayoutInflater inflater = (LayoutInflater) context.getSystemService
                        (Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.activity_extrato_linha, parent, false);

                ImageView foto = (ImageView)view.findViewById(R.id.foto);
                TextView data = (TextView)view.findViewById(R.id.data);
                TextView valor = (TextView)view.findViewById(R.id.valor);
                //faz cache dos widgets instanciados na tag da view para reusar quando houver reciclagem
                view.setTag(new ViewHolder(foto, data, valor));
            }
            //usa os widgets cacheados na view reciclada
            ViewHolder holder = (ViewHolder)view.getTag();
            //carrega os novos valores
            Drawable drawable = Util.getDrawable(context, extratoLists[position].getFoto());
            holder.getFoto().setImageDrawable(drawable);
            Locale locale = new Locale("pt", "BR");
            holder.getData().setText(extratoLists[position].getDataString());
            holder.getValor().setText(extratoLists[position].getValorString());

            return view;
        }


    }


