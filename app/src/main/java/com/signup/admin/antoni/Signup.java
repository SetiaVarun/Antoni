package com.signup.admin.antoni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Admin on 11/27/2017.
 */

public class Signup  extends AppCompatActivity {
    TextView referal,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        login=findViewById(R.id.txtLogin);
        referal=findViewById(R.id.txtReferal);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Signup.this,LoginScreen.class);
                startActivity(i);
            }
        });
        referal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Signup.this,addInfo.class);
                startActivity(i);
            }
        });

    }
}