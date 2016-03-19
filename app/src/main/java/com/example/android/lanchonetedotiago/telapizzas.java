package com.example.android.lanchonetedotiago;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telapizzas extends AppCompatActivity {
int carrinho = 0;

    public void PizzaFrango (View v) {
        carrinho = carrinho + 10;
    }

    public void PizzaCarne (View v) {
        carrinho = carrinho + 10;
    }

    public void PizzaChocolate (View v) {
        carrinho = carrinho + 10;
    }

    public void PizzaMilho (View v) {
        carrinho = carrinho + 10;
    }

    public void PizzaTudao (View v) {
        carrinho = carrinho + 10;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telapizzas);
    }
}
