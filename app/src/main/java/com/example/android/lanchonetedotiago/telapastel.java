package com.example.android.lanchonetedotiago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telapastel extends AppCompatActivity {
int carrinho =0;

    public void PastelCarne (View v) {
        carrinho = carrinho + 10;

    }

    public void PastelFrango (View v) {
        carrinho = carrinho + 10;

    }

    public void PastelCharque (View v) {
        carrinho = carrinho + 10;

    }

    public void PastelQueijo (View v) {
        carrinho = carrinho + 10;

    }

    public void PastelBacon (View v) {
        carrinho = carrinho + 10;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telapastel);
    }
}
