package com.inception.samplelayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        String user = getIntent().getStringExtra("user");

        int pass = getIntent().getIntExtra("pas" , 0);



    }
}
