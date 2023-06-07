package com.example.weswing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.List;

public class MyAdapter extends ArrayAdapter<String> {

    private Context mContext;
    private int mResource;
    private List<String> mData;

    public MyAdapter(Context context, int resource, List<String> data) {
        super(context, resource, data);
        mContext = context;
        mResource = resource;
        mData = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(mResource, parent, false);

        EditText editText = view.findViewById(R.id.Nom);
        editText.setText(mData.get(position));

        return view;
    }
}