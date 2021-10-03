package com.example.admin.relaxappmp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listBHnoibat ;
    ArrayList<BHnoibat> arrayBH ;
    BHnoibatAdapter adapter ;


    ImageButton imgMenu,imgLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        adapter = new BHnoibatAdapter(this,R.layout.bhnoibat_layout,arrayBH);
        listBHnoibat.setAdapter(adapter);


        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu();
            }
        });
    }

    private void showMenu()
    {
        PopupMenu popupMenu = new PopupMenu(this,imgMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_option,popupMenu.getMenu());
        popupMenu.show();
    }
    private void anhxa() {
        imgMenu = (ImageButton) findViewById(R.id.imgMenu);
        imgLogin = (ImageButton) findViewById(R.id.ImageButtonLogin);

        listBHnoibat = (ListView) findViewById(R.id.listBHnoibat);
        arrayBH = new ArrayList<>();

        arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",2));
        arrayBH.add(new BHnoibat(R.drawable.item3,"Khuê Mộc Lan","Hương Ly",5));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",7));
        arrayBH.add(new BHnoibat(R.drawable.item5,"Túp Lều Vàng","Nguyễn Đình Vũ",12));
        arrayBH.add(new BHnoibat(R.drawable.item6,"Sai Cách Yêu","Lê Bảo Bình",10));
        arrayBH.add(new BHnoibat(R.drawable.item7,"Chiều Đồng Quê","H2K",2));
        arrayBH.add(new BHnoibat(R.drawable.item8,"Kiêu Ngạo","Huy Vạc",4));
        arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",2));
        arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",2));
        arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",2));


    }
}
