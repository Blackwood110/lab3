package com.dergilev.mypc.lab3;

import android.app.ListFragment;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.ArrayList;

public class FragmentList extends ListFragment implements AdapterView.OnItemClickListener {
    //    public interface onSomeEventListener {
//        public void someEvent(News news);
//    }
    public static Intent intent;
//    onSomeEventListener someEventListener;
    ArrayList<News> news = new ArrayList<>();
    NewsAdapter newsAdapter;
//
//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        try {
//            someEventListener = (onSomeEventListener) activity;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(activity.toString());
//        }
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fillData();
        newsAdapter = new NewsAdapter(getActivity(), news);
        setListAdapter(newsAdapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        someEventListener.someEvent(news.get(i));
//        Intent intent=new Intent(getActivity(), DetailActivity.class);
//      //  startActivity(intent);
        intent = new Intent(getActivity(), DetailActivity.class);
//        intent.putExtra("index", i);
        intent.putExtra("title", news.get(i).title);
        intent.putExtra("descr", news.get(i).description);
        intent.putExtra("date", news.get(i).date);
        intent.putExtra("image", news.get(i).image);
       startActivity(intent);
    }

    void fillData() {
        TypedArray images = getResources().obtainTypedArray(R.array.icons);
        String[] newsArray = getResources().getStringArray(R.array.news_names);
        String[] descrArray = getResources().getStringArray(R.array.news_descr);
        String[] dateArray = getResources().getStringArray(R.array.data_news);


        for (int i = 0; i < newsArray.length; i++) {
            news.add(new News(newsArray[i], images.getResourceId(i, 0), descrArray[i], dateArray[i]));
        }
    }
}