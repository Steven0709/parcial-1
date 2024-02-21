package com.example.parcial_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TabHost tbh;
    Spinner spn;
    TextView temVal;
    Button btn;
    metro miobj = new metro();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhCalcularValor);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("Metros").setIndicator("METROS").setContent(R.id.tabMetros));
        tbh.addTab(tbh.newTabSpec("Conversor de Areas").setIndicator("CONVERSOR DEAREAS").setContent(R.id.tabConversor de Areas));
    }
}