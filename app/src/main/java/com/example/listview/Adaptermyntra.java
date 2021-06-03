package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Adaptermyntra extends BaseAdapter {

    Context mcontext;
    List<modelmyntra> modelListview;

    public Adaptermyntra(Context mcontext,List<modelmyntra> modelListview){

        this.mcontext=mcontext;
        this.modelListview=modelListview;

    }
    @Override
    public int getCount() {
        return modelListview.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewlist ;
        if(convertView==null){
            LayoutInflater layoutInflater=LayoutInflater.from(mcontext);
            viewlist=layoutInflater.inflate(R.layout.mycustomview,null);
        }

        else {
          viewlist=convertView;
        }

        TextView txt1=viewlist.findViewById(R.id.txt1);
        TextView txt2=viewlist.findViewById(R.id.txt2);
        ImageView img=viewlist.findViewById(R.id.img);

        modelmyntra modelmyntra=modelListview.get(position);
        txt1.setText(modelmyntra.getTxt1());
        txt2.setText(modelmyntra.getTxt2());

        img.setImageResource(modelmyntra.getImg());
        return viewlist;



    }
}
