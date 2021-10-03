//package com.example.admin.relaxappmp3;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
///**
// * Created by ADMIN on 02/10/2021.
// */
//
//public class MenuAdapter extends BaseAdapter {
//
//    private Context context;
//    private int layout ;
//    private List<Menu> menuList;
//
//    public MenuAdapter(Context context, int layout, List<Menu> menuList) {
//        this.context = context;
//        this.layout = layout;
//        this.menuList = menuList;
//    }
//
//    @Override
//    public int getCount() {
//        return menuList.size();
//    }
//
//    @Override
//    public Object getItem(int i) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int i) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int i, View view, ViewGroup viewGroup) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        view = inflater.inflate(layout,null);
////        ánh xạ view
//        ImageView imgMenuName = (ImageView) view.findViewById(R.id.imgMenuName);
//        TextView txtMenuName = (TextView) view.findViewById(R.id.txtMenuName);
//
////        Gán giá trị
//        Menu menu = menuList.get(i);
//
//        imgMenuName.setImageResource(menu.getHinh());
//        txtMenuName.setText(menu.getTen());
//
//        return view;
//    }
//}
