package com.example.aeronet.alleart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickEquipe(View view) {
        Intent tela = new Intent(getApplicationContext(), Equipe.class);
        startActivity(tela);
    }

    public void clickCursos(View view) {
        Intent tela = new Intent(getApplicationContext(), Cursos.class);
        startActivity(tela);
    }

    public void clickMidia(View view) {
        Intent tela = new Intent(getApplicationContext(), Midia.class);
        startActivity(tela);
    }
}