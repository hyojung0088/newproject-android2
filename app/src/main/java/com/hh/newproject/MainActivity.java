package com.hh.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText contentUserid;
    EditText contentUserPassword;
    Button loginBtn;
    TextView contentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentUserid = findViewById(R.id.contentUserid);
        contentUserPassword = findViewById(R.id.contentUserPassword);
        loginBtn = findViewById(R.id.loginBtn);
        contentText = findViewById(R.id.contentText);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid = contentUserid.getText().toString();
                String upw = contentUserPassword.getText().toString();
                Toast.makeText(MainActivity.this, uid, Toast.LENGTH_SHORT).show();

                contentText.setText(String.format("ID:%s, PW:%s", uid, upw));
            }
        });
    }
}
