package com.example.barbershoop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cnxcli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnxcli);
        EditText username=(EditText)findViewById(R.id.idEdtUserName);
        EditText password = (EditText)findViewById(R.id.idEdtPassword);
        Button btn =(Button)findViewById(R.id.idBtnLogin);
        Intent intent1 = new Intent(this,rndv_cli.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    startActivity(intent1);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Wrong Credentials",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
