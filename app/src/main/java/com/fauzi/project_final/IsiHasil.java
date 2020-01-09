package com.fauzi.project_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.fauzi.project_uts.R;

public class IsiHasil extends AppCompatActivity {

    Button keluar;
    TextView nim,nama,jk,tempat,tgl;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isi_main);

        nim = findViewById(R.id.tvNim);
        nama = findViewById(R.id.tvNama);
        jk = findViewById(R.id.tvJk);
        tempat = findViewById(R.id.tvTempat);
        tgl = findViewById(R.id.tvTgl);

        Bundle getform = getIntent().getExtras();
        nim.setText("NIM \t\t\t\t : "+getform.getString("nim"));
        nama.setText("Nama \t\t\t : "+getform.getString("nama"));
        jk.setText("J K  \t\t\t\t  : "+getform.getString("jk"));
        tempat.setText("Tempat Lahir : "+getform.getString("tempat"));
        tgl.setText("Tgl Lahir \t\t  : "+getform.getString("tanggal"));

        keluar = findViewById(R.id.keluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(IsiHasil.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
