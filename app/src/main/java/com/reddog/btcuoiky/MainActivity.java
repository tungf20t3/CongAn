package com.reddog.btcuoiky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.reddog.btcuoiky.adapter.CongAnAdapter;
import com.reddog.btcuoiky.model.CongAn;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvCaSi;
    ImageView imgLogout;
    ArrayList<CongAn> arraySinger;
    CongAnAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new CongAnAdapter(this, R.layout.row_singer, arraySinger);
        lvCaSi.setAdapter(adapter);

        imgLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });
    }
    private void AnhXa(){
        lvCaSi = (ListView) findViewById(R.id.lvSinger);
        imgLogout = findViewById(R.id.logOut);
        arraySinger = new ArrayList<>();
        arraySinger.add(new CongAn("Võ Nguyên Giáp", "Việt Nam", "Nơi công tác: Hà Nội", "Cấp bậc: Đại tướng" ,R.drawable.vonguyengiap));
        arraySinger.add(new CongAn("Hồ Thị Cẩm Nhung", "Việt Nam", "Nơi công tác: Đà Nẵng", "Cấp bậc: Thiếu tá" ,R.drawable.nucongan));
        arraySinger.add(new CongAn("Nguyễn Thị Lan", "Việt Nam", "Nơi công tác: Đà Nẵng", "Cấp bậc: Thiếu tá" ,R.drawable.imgcongan));
        arraySinger.add(new CongAn("Lưu Thị Hoa", "Việt Nam", "Nơi công tác: Đà Nẵng", "Cấp bậc: Thiếu tá" ,R.drawable.nucongan));

    }
}