package com.example.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

public class PostDetailsActivity extends AppCompatActivity {

    public static final String TAG = "Detailed View";
    private TextView tvUsername;
    private ImageView ivImage;
    private TextView tvDescription, tvDescriptionUsername;
    private Post mPost;
    private ImageButton ibFavorite, ibDirect, ibComment, ibSavedPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_details);
        tvUsername = findViewById(R.id.tvUsername);
        ivImage = findViewById(R.id.ivImage);
        tvDescription = findViewById(R.id.tvDescription);
        tvDescriptionUsername = findViewById(R.id.tvUsername2);

        ibFavorite = findViewById(R.id.ibFavorite);
        ibDirect = findViewById(R.id.ibDirect);
        ibComment = findViewById(R.id.ibComment);
        ibSavedPost = findViewById(R.id.ibSavedPost);

        mPost = (Post) getIntent().getParcelableExtra("post");

        bind(mPost);
    }

    public void bind(Post post) {
        // Bind the post data to the view elements
        tvDescription.setText(post.getDescription());
        tvUsername.setText(post.getUser().getUsername());
        tvDescriptionUsername.setText(post.getUser().getUsername());
        ParseFile image = post.getImage();
        if (image != null) {
            Glide.with(this).load(image.getUrl()).into(ivImage);
        }
        Log.d(TAG, "Bind Ran \nUser:" + post.getUser() + "\nDescription: "+post.getDescription());
    }
}