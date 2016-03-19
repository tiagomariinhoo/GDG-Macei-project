package com.example.android.lanchonetedotiago;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

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

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.SandubaCarne:
                if (checked)
                carrinho=carrinho+10;
                TelaDoCarro(carrinho=carrinho+10);

                // Remove the meat
                break;
            case R.id.SandubaFrango:
                if (checked)
                carrinho=carrinho+10;
                else
                // I'm lactose intolerant
                break;
            // TODO: Veggie sandwich
        }
    }
    public void TelaDoCarro(int score) {
        TextView scoreView = (TextView) findViewById(R.id.TelaCarrinho);
        scoreView.setText(String.valueOf(score));
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
