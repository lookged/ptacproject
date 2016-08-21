package com.example.chakr.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    public final String TAG = "MainActivity";

    @BindView(R.id.buttonToastFromXML)
    Button buttonToast;

    @BindView(R.id.buttonToast2)
    Button buttonToast2;
    @BindView(R.id.goToLogin)
    Button btnGoToLogin;

    @BindView(R.id.etId)
    EditText insertText;

    public int checkColor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);

        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "hahaha", Toast.LENGTH_SHORT).show();
            }
        });
        buttonToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, insertText.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        btnGoToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToLoginIntent = new Intent(MainActivity.this, LoginActivity.class);
                goToLoginIntent.putExtra("value1","hahaha");
                startActivity(goToLoginIntent);
            }
        });
    }
}
