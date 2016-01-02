package com.nnews.android;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Viewer extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
