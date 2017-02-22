package com.example.swaggyq.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by swaggyq on 2017/2/22.
 */

public class LoginActivity extends BaseActivity {
    private EditText account;
    private EditText password;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        account = (EditText) findViewById(R.id.account);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login_name = account.getText().toString();
                String pwd = password.getText().toString();
                if(login_name.equals("admin") && pwd.equals(("123456"))){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(LoginActivity.this,"account or password is invaild", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
