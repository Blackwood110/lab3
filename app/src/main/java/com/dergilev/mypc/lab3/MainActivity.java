package com.dergilev.mypc.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{ //implements FragmentList.onSomeEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void someEvent(News news) {
//     Intent intent = new Intent(this, DetailActivity.class);
//     intent.putExtra(DetailActivity.title, news.title);
//    }
}
