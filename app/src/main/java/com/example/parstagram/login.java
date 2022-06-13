package com.example.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class login extends AppCompatActivity {

    public static final String TAG = "login";
    private EditText etUsername;
    private EditText etPassword;
    private ImageButton ibConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        ibConfirm = findViewById(R.id.ibConfirm);

        ibConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "confirm login clicked");
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                loginUser(username, password);
            }


        });
    }
    private void loginUser(String user, String pass) {

        Log.i(TAG, "Attempting to login: " +user);
    }



}