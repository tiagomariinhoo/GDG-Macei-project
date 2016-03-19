package com.example.android.lanchonetedotiago;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


  //  Button sanduba = (Button) findViewById(R.id.sanduba);

   //  sanduba.setOnClickListener(new View.OnClickListener() {
   //          public void onClick(View view) {
        // Intent it = new Intent(MainActivity.this, telasanduiche.class);

        // startActivity(it);
        //  }
    //});

    public void sanduba (View v) {
         Intent it = new Intent(MainActivity.this, telasanduiche.class);
         startActivity(it);
    }

    public void pizza (View v) {
        Intent it = new Intent(MainActivity.this, telapizzas.class);
        startActivity(it);
    }

    public void refrigerantes (View v) {
        Intent it = new Intent(MainActivity.this, refrigerantes.class);
        startActivity(it);
    }

    public void pastel (View v) {
        Intent it = new Intent(MainActivity.this, telapastel.class);
        startActivity(it);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
