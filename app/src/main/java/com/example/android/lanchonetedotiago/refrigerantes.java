package com.example.android.lanchonetedotiago;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class refrigerantes extends AppCompatActivity {
    int carrinho = 0;

    public void cocacola (View v) {
        carrinho = carrinho + 2;
    }
    public void guarana (View v) {
        carrinho = carrinho + 2;
    }
    public void sucocopo (View v) {
        carrinho = carrinho + 2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refrigerantes);
    }
}
