package com.example.n2_13_ptitplus2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TinTucTapChiActivity extends AppCompatActivity {
    ListView lvDanhmuctintucTapChi;
    ArrayList<Danhmuc> arrayDanhmuctintucTapChi;
    DanhMucAdapter adaptertintucTapChi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tin_tuc_tap_chi);

        lvDanhmuctintucTapChi = (ListView) findViewById(R.id.listviewTinTapChi);
        arrayDanhmuctintucTapChi = new ArrayList<>();

        arrayDanhmuctintucTapChi.add(new Danhmuc("Tạp chí khoa học công nghệ", R.drawable.tapchi));
        arrayDanhmuctintucTapChi.add(new Danhmuc("Chiến lược phát triển khoa học công nghệ giai doạn 2017 – 2022", R.drawable.cl_cong_nghe));
        arrayDanhmuctintucTapChi.add(new Danhmuc("Hội nghị khoa học, đào tạo và nghiên cứu khoa học hướng tới cách mạng công nghệ 4.0", R.drawable.hoithao));
        arrayDanhmuctintucTapChi.add(new Danhmuc("Chiến lược phát triển khoa học công nghệ giai doạn 2017 – 2022", R.drawable.cl_cong_nghe));
        arrayDanhmuctintucTapChi.add(new Danhmuc("Tạp chí khoa học công nghệ", R.drawable.tapchi));
        arrayDanhmuctintucTapChi.add(new Danhmuc("Bài báo đăng tải đề tài nghiên cứu học viện công nghệ bưu chính viễn thông 2019", R.drawable.detai));

        adaptertintucTapChi = new DanhMucAdapter(this , R.layout.dongdanhmuctin, arrayDanhmuctintucTapChi);
        lvDanhmuctintucTapChi.setAdapter(adaptertintucTapChi);
    }
}
