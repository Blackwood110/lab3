package com.dergilev.mypc.lab3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {
    Context ctx;
    LayoutInflater lInflater;
    ArrayList<News> objects;

    NewsAdapter(Context context, ArrayList<News> news) {
        ctx = context;
        objects = news;
        lInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //getLayoutInflater
    }

    //кол-во элементов
    @Override
    public int getCount() {
        return objects.size();
    }

    //элемент по позиции
    @Override
    public Object getItem(int i) {
        return objects.get(i);
    }

    //id по позиции
    @Override
    public long getItemId(int i) {
        return i;
    }

    //пункт списка
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //используем созданные, но не испльзованные view
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.list_item, null);
        }
        News n = (News) getItem(position);
        //заполнение view в пункте списка данными
        ((TextView) view.findViewById(R.id.twTitle)).setText(n.title);
        ((TextView) view.findViewById(R.id.etDescr)).setText(n.description);
        ((TextView) view.findViewById(R.id.twDate)).setText(n.date);
        ((ImageView) view.findViewById(R.id.iwImage)).setImageResource(n.image);
        return view;
    }
}
