package com.aliendroid.alienads;

import android.app.Application;
import android.util.Log;

import com.aliendroid.sdkads.config.InitializeAlienAds;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;


public class MyApplication extends Application {
    private static AlienOpenAds alienOpenAds;
    private static InitializeAlienAds sdkads;
    private static AlienNotif notif;
    //Uranus
    @Override
    public void onCreate() {
        super.onCreate();

        sdkads = new InitializeAlienAds(this);
        alienOpenAds = new AlienOpenAds(this);

        notif = new AlienNotif(this);
    }
}