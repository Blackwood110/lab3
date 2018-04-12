package com.dergilev.mypc.lab3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FragmentNews extends Fragment {
//    public static FragmentNews newInstance(int index) {
//        FragmentNews f = new FragmentNews();
//        Bundle args = new Bundle();
//        args.putInt("index", index);
//        f.setArguments(args);
//        return f;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    public void showNews(News news) {
        ((TextView)getView().findViewById(R.id.twTitle)).setText(news.title);
        ((TextView)getView().findViewById(R.id.etDescr)).setText(news.description);
        ((TextView)getView().findViewById(R.id.twDate)).setText(news.date);
        ((ImageView) getView().findViewById(R.id.iwImage)).setImageResource(news.image);
    }

//
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//    }
}
