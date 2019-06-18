package com.example.n2_13_ptitplus2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TinTucHoiThaoActivity extends AppCompatActivity {
    ListView lvDanhmuctintucHoiThao;
    ArrayList<Danhmuc> arrayDanhmuctintucHoiThao;
    DanhMucAdapter adaptertintucHoiThao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tin_tuc_hoi_thao);

        lvDanhmuctintucHoiThao = (ListView) findViewById(R.id.listviewTinHoiThao);
        arrayDanhmuctintucHoiThao = new ArrayList<>();
        arrayDanhmuctintucHoiThao.add(new Danhmuc("Chiến lược phát triển khoa học công nghệ giai doạn 2017 – 2022", R.drawable.cl_cong_nghe));
        arrayDanhmuctintucHoiThao.add(new Danhmuc("Tạp chí khoa học công nghệ", R.drawable.tapchi));
        arrayDanhmuctintucHoiThao.add(new Danhmuc("Bài báo đăng tải đề tài nghiên cứu học viện công nghệ bưu chính viễn thông 2019", R.drawable.detai));
        arrayDanhmuctintucHoiThao.add(new Danhmuc("Tạp chí khoa học công nghệ", R.drawable.tapchi));

        adaptertintucHoiThao = new DanhMucAdapter(this , R.layout.dongdanhmuctin, arrayDanhmuctintucHoiThao);
        lvDanhmuctintucHoiThao.setAdapter(adaptertintucHoiThao);
    }
}
