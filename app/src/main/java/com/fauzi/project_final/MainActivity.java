package com.fauzi.project_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.fauzi.project_uts.R;

import static java.lang.Integer.valueOf;

public class MainActivity extends AppCompatActivity {

    Button save;
    EditText eNim, eNama, eTmpt, eTgl;
    RadioGroup rgjk;
    CalendarView tgl2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = findViewById(R.id.save);
        eNim = findViewById(R.id.nim);
        eNama = findViewById(R.id.nama);
        eTmpt = findViewById(R.id.tempat);
        eTgl = findViewById(R.id.tgl);
        rgjk = (RadioGroup) findViewById(R.id.jeka);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nim = eNim.getText().toString();
                String nama = eNama.getText().toString();
                String tempat = eTmpt.getText().toString();
                String tanggal = eTgl.getText().toString();
                int gen = rgjk.getCheckedRadioButtonId();
                RadioButton jk = (RadioButton) findViewById(gen);
                final String inputjk = jk.getText().toString();

                if (nim.equals("") | nama.equals("") | tempat.equals("")| tanggal.equals("")) {
                    Toast.makeText(MainActivity.this, "Masukan Dulu Data Kamu", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, IsiHasil.class);
                    intent.putExtra("nim", nim);
                    intent.putExtra("nama", nama);
                    intent.putExtra("jk", inputjk);
                    intent.putExtra("tempat", tempat);
                    intent.putExtra("tanggal", tanggal);
                    startActivity(intent);
                }
            }
        });
    }
}


