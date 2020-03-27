package com.example.blue_apli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button entrar = (Button) findViewById(R.id.button_login);

        entrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, estoquevActivity.class);
                startActivity(it);
            }
        });

    }


}
