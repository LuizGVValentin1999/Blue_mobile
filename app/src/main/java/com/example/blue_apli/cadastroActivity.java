package com.example.blue_apli;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.google.android.material.snackbar.Snackbar;

public class cadastroActivity extends AppCompatActivity {
    AlertDialog.Builder contrutorAlenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        final Button Salvar = (Button) findViewById(R.id.button_salvar);

        Salvar.setOnClickListener(new View.OnClickListener() {




            public void onClick(View view) {
                Snackbar mySnackbar = Snackbar.make(view, "Salvo", 1000);
                mySnackbar.show();
            }


        });
    }
}
