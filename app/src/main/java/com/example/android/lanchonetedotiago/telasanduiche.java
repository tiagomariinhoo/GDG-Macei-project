package com.example.android.lanchonetedotiago;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class telasanduiche extends AppCompatActivity {
    int carrinho=0;
//    Intent it = new Intent(this, telasanduiche.class);

    public void SandubaCarne (View v) {
    carrinho=carrinho+10;
    }

    public void SandubaBacon (View v) {
        carrinho = carrinho + 10;

    }
    public void SandubaFrango (View v) {
        carrinho = carrinho + 10;

    }
    public void xTudo (View v) {
        carrinho = carrinho + 10;

    }
    public void Minuano (View v) {
        carrinho = carrinho + 10;

    }





    public class MyActivity extends Activity {
        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);

            setContentView(R.layout.telasanduiche);

            final CheckBox checkBox = (CheckBox) findViewById(R.id.SandubaCarne);
            if (checkBox.isChecked()) {
                checkBox.setChecked(false);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telasanduiche);
    }
}
