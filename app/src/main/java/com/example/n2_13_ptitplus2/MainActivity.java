package com.example.n2_13_ptitplus2;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button buttonphai;
    ArrayList<Integer> arrayList;
    ListView lvDanhmuc;
    ArrayList<Danhmuc> arrayDanhmuc;
    DanhMucAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        arrayList = new ArrayList<>();
        arrayList.add(R.drawable.nhaa2);
        arrayList.add(R.drawable.anh1);
        arrayList.add(R.drawable.anh2);
        arrayList.add(R.drawable.anh3);

        final CountDownTimer countDownTimer = new CountDownTimer(1000000, 3000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Random random = new Random();
                int vt = random.nextInt(arrayList.size());
                imageView.setImageResource(arrayList.get(vt));
            }

            @Override
            public void onFinish() {

            }
        }.start();
        buttonphai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int vt = random.nextInt(arrayList.size());
                imageView.setImageResource(arrayList.get(vt));

            }
        });
        adapter = new DanhMucAdapter(this , R.layout.dongdanhmuc, arrayDanhmuc);
        lvDanhmuc.setAdapter(adapter);

        lvDanhmuc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent1 = new Intent(MainActivity.this, TinTucActivity.class);
                        startActivity(intent1);
                        overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
                        break;
                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, BanDoActivity.class);
                        startActivity(intent2);
                        overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
                        break;
                    case 2:
                        Intent intent3 = new Intent(MainActivity.this, TuyenBusActivity.class);
                        startActivity(intent3);
                        overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
                        break;
                    case 3:
                        Intent intent4 = new Intent(MainActivity.this, NganhHocActivity.class);
                        startActivity(intent4);
                        overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit);
                        break;
                }
            }
        });
    }

    private void Anhxa() {
        imageView = (ImageView) findViewById(R.id.Anhchinh);
        buttonphai = (Button) findViewById(R.id.buttonphai);
        lvDanhmuc = (ListView) findViewById(R.id.listViewDanhMuc);
        arrayDanhmuc = new ArrayList<>();

        arrayDanhmuc.add(new Danhmuc("Tin tức", R.drawable.icontintuc));
        arrayDanhmuc.add(new Danhmuc("Bản đồ khu vực", R.drawable.iconbando));
        arrayDanhmuc.add(new Danhmuc("Điểm bus đến và đi", R.drawable.iconbus));
        arrayDanhmuc.add(new Danhmuc("Thông tin ngành học", R.drawable.iconnganh));
    }
}
