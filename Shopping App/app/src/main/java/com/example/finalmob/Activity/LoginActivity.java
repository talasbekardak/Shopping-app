package com.example.finalmob.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.finalmob.R;

public class LoginActivity extends Activity {
    private EditText userEdt, passEdt;
    private Button loginBtn;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        initView();

    }

    private void initView() {
        userEdt=findViewById(R.id.editTextText2);
        passEdt=findViewById(R.id.editTextPassword);
        loginBtn=findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userEdt.getText().toString().isEmpty() || passEdt.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please, Fill your User and Password",Toast.LENGTH_SHORT).show();
                }else if (userEdt.getText().toString().equals("test") && passEdt.getText().toString().equals("test")){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class ));
                }else {
                    Toast.makeText(LoginActivity.this,"Your user and password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
