package com.inception.samplelayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);


    }


    public void moveNext(View v)
    {
        EditText username = findViewById(R.id.username_et);

        EditText password = findViewById(R.id.password_et);

        String user = username.getText().toString();

        String pass = password.getText().toString();

        Intent i = new Intent(Login1.this , AfterLogin.class);

        i.putExtra("user" , user);
        i.putExtra("pas" , 1234);

        startActivity(i);


    }


}
