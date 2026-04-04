package com.uemg.atividadelab1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("onCreate Chamado");

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText inputNome = findViewById(R.id.inputNome);
        EditText inputIdade = findViewById(R.id.inputIdade);
        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(view -> {
            String nome = inputNome.getText().toString();
            String idade = inputIdade.getText().toString();

            Intent segundaTela = new Intent(MainActivity.this, MainActivity2.class);
            segundaTela.putExtra("nome", nome);
            segundaTela.putExtra("idade", idade);

            startActivity(segundaTela);

        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("onStart Chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("onResume Chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("onPause Chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("onStop Chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("onRestart Chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("onDestroy Chamado");
    }
}