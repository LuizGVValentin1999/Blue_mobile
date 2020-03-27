package com.example.blue_apli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class estoquevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estoquev);

        Button cadastrar = (Button) findViewById(R.id.button_Cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent it = new Intent(estoquevActivity.this, cadastroActivity.class);
                startActivity(it);
            }
        });


    }
}
