package com.mobinius.kotlinrecyclerviewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mobinius.kotlinrecyclerviewdemo.R;
import com.mobinius.kotlinrecyclerviewdemo.adapter.UserAdapter;
import com.mobinius.kotlinrecyclerviewdemo.model.UserClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prajna on 26/10/17.
 */

public class UserActivity extends Activity {

    private List<UserClass> users = new ArrayList<>();
    private RecyclerView recyclerView;
    private UserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new UserAdapter(users);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        users.add(new UserClass("JAVA", "Example"));
        users.add(new UserClass("abc", "Mobinius"));
        users.add(new UserClass("xyz", "Mobinius"));
        users.add(new UserClass("ijk", "Mobinius"));
        mAdapter.notifyDataSetChanged();
    }
}
