package com.example.dellpc.customlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import static android.graphics.Color.*;


public class CustomAdapter extends ArrayAdapter<CustomData> {
   private int resource;
   private Context Ccontext;
   private ArrayList<CustomData> arrayList;

    // View lookup cache

        TextView Oname;
        TextView Onumber;
        TextView Oicon;
        ImageView imageView;

    public CustomAdapter(ArrayList<CustomData> data, Context context,int resource) {
        super(context, R.layout.activity_custom_list, data);
        this.arrayList=data;
        this.Ccontext=context;
    }

    public View getView(  int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) Ccontext.getSystemService(getContext().LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_custom_list,null,false);
        Oname = view.findViewById(R.id.name);
        Onumber = view.findViewById(R.id.number);
        Oicon = view.findViewById(R.id.ic);
        imageView = view.findViewById(R.id.ico);

        CustomData CD = arrayList.get(position);
        imageView.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
        Oname.setText(CD.getName());
        Onumber.setText(CD.getNumber());
        Oicon.setText(CD.getIcon()+"");
        Random r = new Random();

        imageView.setColorFilter(Color.argb(255, r.nextInt(256), r.nextInt(256), r.nextInt(256) ));


        if(position%2==0){
            view.setBackgroundColor(Color.WHITE);
        }    else{
            view.setBackgroundColor(Color.GRAY);
        }

        return view;
    }
}

