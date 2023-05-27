package com.example.thumbfight.finalproject;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import Oject.CookBook;
import adapter.CookAdapter;


public class MainActivity extends AppCompatActivity {
    GridView gdvDSMonAn;
    CookAdapter adapter;
    ArrayList<CookBook> cookBookArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
    }
    private void init(){
        cookBookArrayList = new ArrayList<>();
        cookBookArrayList.add(new CookBook("Sườn non kho nước dừa","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2019/05/suon-non-kho-nuoc-dua.jpg"));
        cookBookArrayList.add(new CookBook("Mướp đắng nhồi thịt","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2016/02/canh-muop-dang-nhoi-thit.jpg"));
        cookBookArrayList.add(new CookBook("Nem cua bể","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2016/02/nem-cua-be.jpg"));
        cookBookArrayList.add(new CookBook("Cá Lóc Nướng","Dễ","https://daynauan.info.vn/wp-content/uploads/2018/04/ca-loc-nuong-trui.jpg"));
        cookBookArrayList.add(new CookBook("Sườn non kho nước dừa","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2019/05/suon-non-kho-nuoc-dua.jpg"));
        cookBookArrayList.add(new CookBook("Mướp đắng nhồi thịt","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2016/02/canh-muop-dang-nhoi-thit.jpg"));
        cookBookArrayList.add(new CookBook("Nem cua bể","Dễ  làm","https://daynauan.info.vn/wp-content/uploads/2016/02/nem-cua-be.jpg"));
        cookBookArrayList.add(new CookBook("Cá Lóc Nướng","Dễ","https://daynauan.info.vn/wp-content/uploads/2018/04/ca-loc-nuong-trui.jpg"));
        cookBookArrayList.add(new CookBook("Sườn non kho nước dừa","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2019/05/suon-non-kho-nuoc-dua.jpg"));
        cookBookArrayList.add(new CookBook("Mướp đắng nhồi thịt","Dễ làm","https://daynauan.info.vn/wp-content/uploads/2016/02/canh-muop-dang-nhoi-thit.jpg"));
        cookBookArrayList.add(new CookBook("Nem cua bể","Dễ  làm","https://daynauan.info.vn/wp-content/uploads/2016/02/nem-cua-be.jpg"));
        cookBookArrayList.add(new CookBook("Cá Lóc Nướng","Dễ","https://daynauan.info.vn/wp-content/uploads/2018/04/ca-loc-nuong-trui.jpg"));

        adapter= new CookAdapter(this,0,cookBookArrayList);
    }
    private void anhXa(){
        gdvDSMonAn = findViewById(R.id.gdvDSMonAn);
    }
    private void setUp(){
        gdvDSMonAn.setAdapter(adapter);
    }
    private void setClick(){}
}