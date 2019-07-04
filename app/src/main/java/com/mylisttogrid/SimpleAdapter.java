package com.mylisttogrid;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>{

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    class SimpleViewHolder extends RecyclerView.ViewHolder {

        SimpleViewHolder(View itemView) {
            super(itemView);
        }
    }

/*    public void addPagingData(List<Integer> mList) {
List<Integer> mList=new ArrayList<>();
mList.add(1);
mList.add(2);
mList.add(3);
mList.add(4);
mList.add(5);
mList.add(6);
mList.add(7);
mList.add(8);
mList.add(9);
mList.add(10);
mList.add(11);
mList.add(12);
        for (Integer temp : mList
        ) {
            mList.add(temp);
        }
        notifyDataSetChanged();
    }*/
}