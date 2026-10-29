package com.example.parcial2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private static final String USUARIO_VALIDO = "juan";
    private static final String PASSWORD_VALIDA = "12345678";

    private EditText etUsuario, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> validarLogin());
    }

    private void validarLogin() {
        String usuario = etUsuario.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (TextUtils.isEmpty(usuario)) {
            etUsuario.setError("Ingresa el usuario");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            etPassword.setError("Ingresa la contraseña");
            return;
        }

        if (usuario.equalsIgnoreCase(USUARIO_VALIDO) && password.equals(PASSWORD_VALIDA)) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("usuario", usuario);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}