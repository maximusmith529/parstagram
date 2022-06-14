package com.example.parstagram;

import android.app.Application;
import com.parse.Parse;
import com.parse.Parse.Configuration;


public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(new Configuration.Builder(this)
                .applicationId("kRUNIjXKyJWKEV5gZVzmRZp6GCq02LgXVjxPABHu")
                .clientKey("aJbdynI3jmzmddPHrMmB3IHPGjgyiItZIQseSqgf")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }

}
