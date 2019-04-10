package com.bayufajariyanto.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> data;
    private LayoutInflater mInflater;

    public RecyclerViewAdapter(Context context, ArrayList<String> inputData) {
        this.mInflater = LayoutInflater.from(context);
        data = inputData;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nama;
        public TextView nim;

        public ViewHolder(View v) {
            super(v);
            nama = (TextView) v.findViewById(R.id.nama);
            nim = (TextView) v.findViewById(R.id.nim);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String nama = data.get(position);
        int nomor=position+1;
        holder.nama.setText(data.get(position));
        holder.nim.setText("NIM : " + nomor);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
