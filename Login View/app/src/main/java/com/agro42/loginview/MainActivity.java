package com.agro42.loginview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tPass = (TextView) findViewById(R.id.tPass);
                String login = tLogin.getText().toString();
                String pass = tPass.getText().toString();

                if("agro".equals(login) && "42".equals(pass)){
                    alert("Bem vindo ao Agro42, Sua fazenda mais inteligente");
                }else {
                    alert("Login e senha incorretos");
                }
            }

        });
    }

    private void alert(String s) {
        //The Class Toast show de temporally mensage in UI device
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
