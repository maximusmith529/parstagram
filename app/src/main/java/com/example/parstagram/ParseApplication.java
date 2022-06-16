package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.Parse.Configuration;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Configuration.Builder(this)
                .applicationId("kRUNIjXKyJWKEV5gZVzmRZp6GCq02LgXVjxPABHu")
                .clientKey("aJbdynI3jmzmddPHrMmB3IHPGjgyiItZIQseSqgf")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }

}
