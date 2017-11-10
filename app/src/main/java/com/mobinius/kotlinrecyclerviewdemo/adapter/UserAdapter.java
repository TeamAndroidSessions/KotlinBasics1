package com.mobinius.kotlinrecyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobinius.kotlinrecyclerviewdemo.R;
import com.mobinius.kotlinrecyclerviewdemo.model.UserClass;

import java.util.List;

/**
 * Created by prajna on 26/10/17.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.CustomViewHolder> {
    private List<UserClass> usersList;

    public UserAdapter(List<UserClass> usersList) {
        this.usersList = usersList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_layout, parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserAdapter.CustomViewHolder holder, int position) {
        UserClass user = usersList.get(position);
        holder.name.setText(user.getName());
        holder.address.setText(user.getAddress());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView name, address;

        public CustomViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.textViewUserName);
            address = (TextView) view.findViewById(R.id.textViewAddress);
        }
    }
}

