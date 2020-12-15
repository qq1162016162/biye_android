package com.example.graduationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText personName;
    private EditText password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        personName = findViewById(R.id.PersonName);
        password = findViewById(R.id.Password);
        btnLogin = findViewById(R.id.btnlogin);
        btnLogin.setOnClickListener(view -> {
            String pn = personName.getText().toString();
            String pw = password.getText().toString();
            if (pn.length() == 0 || pw.length() == 0) {
                Toast.makeText(LoginActivity.this, "用户名与密码不能为空！", Toast.LENGTH_SHORT).show();
            } else {
                if (pn.equals("123") && pw.equals("123")) {
                    Toast.makeText(LoginActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainPageActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "用户名与密码错误，重新输入用户名和密码！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}