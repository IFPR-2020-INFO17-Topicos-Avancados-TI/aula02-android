package com.stiehl.minhaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tUsuario;
    private TextView tSenha;
    private TextView btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tUsuario = findViewById(R.id.tUsuario);
        tSenha = findViewById(R.id.tSenha);
        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btLogin) {
            String usuario = tUsuario.getText().toString();
            String senha = tSenha.getText().toString();
            String mensagem = "Login " + (loginValido(usuario, senha) ? "VÁLIDO" : "INVÁLIDO");
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean loginValido(String usuario, String senha) {
        return usuario.equals("diego") && senha.equals("123");
    }
}