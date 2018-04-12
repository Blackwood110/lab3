package com.dergilev.mypc.lab3;

import android.graphics.drawable.Drawable;

public class News {
    String title;
    int image;
    String description;
    String date;

    News(String _title, int _image, String _description, String _date) {
        title = _title;
        image = _image;
        description = _description;
        date = _date;
    }
}
