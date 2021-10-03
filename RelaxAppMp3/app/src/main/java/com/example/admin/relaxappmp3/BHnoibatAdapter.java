package com.example.admin.relaxappmp3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static com.example.admin.relaxappmp3.R.id.imgBHnoibat;

/**
 * Created by ADMIN on 02/10/2021.
 */

public class BHnoibatAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<BHnoibat> listBHnoibat;


    public BHnoibatAdapter(Context context, int layout, List<BHnoibat> listBHnoibat) {
        this.context = context;
        this.layout = layout;
        this.listBHnoibat = listBHnoibat;
    }

    @Override
    public int getCount() {
        return listBHnoibat.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    private class ViewHolder{
        ImageView imgHinh ;
        TextView txtBH , txtcasi , txtsoluotxem ;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder ;

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);

            holder = new ViewHolder();

//        ánh xạ View
            holder.imgHinh = (ImageView) view.findViewById(imgBHnoibat);
            holder.txtBH = (TextView) view.findViewById(R.id.txtBHnoibat);
            holder.txtcasi  = (TextView) view.findViewById(R.id.txtcaSi);
            holder.txtsoluotxem = (TextView) view.findViewById(R.id.txtNumber);


            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }



//        gán giá trị
        BHnoibat bhnoibat = listBHnoibat.get(i);

        holder.imgHinh.setImageResource(bhnoibat.getHinh());
        holder.txtBH.setText(bhnoibat.getTenbaihat());
        holder.txtcasi.setText(bhnoibat.getTencasi());
        holder.txtsoluotxem.setText(String.valueOf(bhnoibat.getSoluotxem()));
        return view;
    }



}
