package com.example.n2_13_ptitplus2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class TinTucActivity extends AppCompatActivity {
    Button button;
    ListView lvDanhmuctintuc;
    ArrayList<Danhmuc> arrayDanhmuctintuc;
    DanhMucAdapter adaptertintuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tin_tuc);
        button = (Button) findViewById(R.id.buttonDanhmuc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowMenu();
            }
        });

        lvDanhmuctintuc = (ListView) findViewById(R.id.listViewTinTuc);
        arrayDanhmuctintuc = new ArrayList<>();
        arrayDanhmuctintuc.add(new Danhmuc("Chiến lược phát triển khoa học công nghệ giai doạn 2017 – 2022", R.drawable.cl_cong_nghe));
        arrayDanhmuctintuc.add(new Danhmuc("Tạp chí khoa học công nghệ", R.drawable.tapchi));
        arrayDanhmuctintuc.add(new Danhmuc("Bài báo đăng tải đề tài nghiên cứu học viện công nghệ bưu chính viễn thông 2019", R.drawable.detai));
        arrayDanhmuctintuc.add(new Danhmuc("Hội nghị khoa học, đào tạo và nghiên cứu khoa học hướng tới cách mạng công nghệ 4.0", R.drawable.hoithao));
        arrayDanhmuctintuc.add(new Danhmuc("Chiến lược phát triển khoa học công nghệ giai doạn 2017 – 2022", R.drawable.cl_cong_nghe));
        arrayDanhmuctintuc.add(new Danhmuc("Tạp chí khoa học công nghệ", R.drawable.tapchi));
        arrayDanhmuctintuc.add(new Danhmuc("Bài báo đăng tải đề tài nghiên cứu học viện công nghệ bưu chính viễn thông 2019", R.drawable.detai));
        arrayDanhmuctintuc.add(new Danhmuc("Hội nghị khoa học, đào tạo và nghiên cứu khoa học hướng tới cách mạng công nghệ 4.0", R.drawable.hoithao));

        adaptertintuc = new DanhMucAdapter(this , R.layout.dongdanhmuctin, arrayDanhmuctintuc);
        lvDanhmuctintuc.setAdapter(adaptertintuc);

        lvDanhmuctintuc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TinTucActivity.this, "tin chi tiet", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private  void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this, button);
        popupMenu.getMenuInflater().inflate(R.menu.menu_pop, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menuChienLuoc:
                        Intent intent5 = new Intent(TinTucActivity.this, TinTucChienLuocActivity.class);
                        startActivity(intent5);
                        break;
                    case R.id.menuTapChi:
                        Intent intent6 = new Intent(TinTucActivity.this, TinTucChienLuocActivity.class);
                        startActivity(intent6);
                        break;
                    case R.id.menuNghienCuuc:
                        Intent intent7 = new Intent(TinTucActivity.this, TinTucChienLuocActivity.class);
                        startActivity(intent7);
                        break;
                    case R.id.menuHoiThao:
                        Intent intent8 = new Intent(TinTucActivity.this, TinTucChienLuocActivity.class);
                        startActivity(intent8);
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
