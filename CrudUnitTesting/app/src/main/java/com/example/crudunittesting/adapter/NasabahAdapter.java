package com.example.crudunittesting.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.crudunittesting.R;
import com.example.crudunittesting.model.Nasabah;

import java.util.List;

public class NasabahAdapter extends BaseAdapter {
    Context context;
    private List<Nasabah> list;

    public NasabahAdapter(Context context,List<Nasabah> list){
        this.context=context;
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(this.context);
            convertView=inflater.inflate(R.layout.item_nasabah,null);
        }

        Nasabah nasabah = list.get(position);
        TextView namaTextView=(TextView) convertView.findViewById(R.id.nama);
        TextView alamatTextView =(TextView) convertView.findViewById(R.id.alamat);

        namaTextView.setText(nasabah.getNama());
        alamatTextView.setText(nasabah.getAlamat());

        return convertView;
    }
}
