package com.dergilev.mypc.lab3;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        FragmentNews fragmentNews = (FragmentNews) getFragmentManager().findFragmentById(R.id.frDet);
        String title=getIntent().getStringExtra("title");
        String date=getIntent().getStringExtra("date");
        String description=getIntent().getStringExtra("descr");
        int imange=getIntent().getIntExtra("image", 0);
        News myNews=new News(title, imange, description, date);

        fragmentNews.showNews(myNews);

//        ((TextView)(fragment.getView().findViewById(R.id.twTitle))).setText(title);
//        fragment.setArguments(getIntent().getExtras());

    }
}
