package com.example.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class signupActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnConfirm = findViewById(R.id.btnConfirm);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                signUp(etUsername.getText().toString(), etPassword.getText().toString());
            }
        });
    }


    public void signUp(String username, String password) {
        ParseUser user = new ParseUser();
        // Set core properties
        user.setUsername(username);
        user.setPassword(password);

        // Invoke signUpInBackground
        user.signUpInBackground(new SignUpCallback() {
            public void done(ParseException e) {
                if (e != null) {
                    Toast.makeText(signupActivity.this, "Signup " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    return;
                }
                goToMain();


            }
        });

    }

    private void goToMain() {
        Intent i = new Intent(signupActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}