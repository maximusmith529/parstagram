package com.example.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.parse.Parse;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private EditText etDescription;
    private Button btnCaptureImage;
    private ImageView ivPostImage;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDescription = findViewById(R.id.etDescription);
        btnCaptureImage = findViewById(R.id.btTakePicture);
        ivPostImage = findViewById(R.id.ivImage);
        btnSubmit = findViewById(R.id.btSubmit);

    }

    public void logout(View view) {

        ParseUser.logOut();
        ParseUser currentUser = ParseUser.getCurrentUser();
        Log.i("User", "User: "+ParseUser.getCurrentUser());
        Intent i = new Intent(this, login.class);
        startActivity(i);
        finish();
    }


}