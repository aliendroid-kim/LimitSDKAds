package com.aliendroid.alienads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;


import java.util.Date;

public class AlienOpenAds implements LifecycleObserver, Application.ActivityLifecycleCallbacks {
    public static String IDOPEN ="";
    public static MyApplication myApplication;
    public static AppOpenAdManager appOpenAdManager;
    public static Activity currentActivity;
    public static boolean LOADADS;
    public static String SELECT_ADS = "";

    public AlienOpenAds(MyApplication myApplication) {

    }

    public static void LoadOpenAds(String idOpenAds, boolean loadads) {

    }

    public static void LoadOpenAds(String idOpenAds, boolean loadads, String selectADS) {

    }

    /** LifecycleObserver method that shows the app open ad when the app moves to foreground. */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    protected void onMoveToForeground() {
        // Show the ad (if available) when the app moves to foreground.
        appOpenAdManager.showAdIfAvailable(currentActivity);
    }

    /** ActivityLifecycleCallback methods. */
    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {}

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {}

    @Override
    public void onActivityPaused(@NonNull Activity activity) {}

    @Override
    public void onActivityStopped(@NonNull Activity activity) {}

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {}

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {}


    /**
     * Interface definition for a callback to be invoked when an app open ad is complete
     * (i.e. dismissed or fails to show).
     */
    public interface OnShowAdCompleteListener {
        void onShowAdComplete();
    }

    /** Inner class that loads and shows app open ads. */
    public static class AppOpenAdManager {
        public static void loadAd(Context context) {
            // Do not load ad if there is an unused ad or one is already loading.
        }

        /** Check if ad was loaded more than n hours ago. */
        private static boolean wasLoadTimeLessThanNHoursAgo(long numHours) {
            return true;
        }
        private static boolean isAdAvailable() {
            return wasLoadTimeLessThanNHoursAgo(4);
        }

       public static void showAdIfAvailable(@NonNull final Activity activity) {
            showAdIfAvailable(
                    activity,
                    new OnShowAdCompleteListener() {
                        @Override
                        public void onShowAdComplete() {

                        }
                    });
        }

        public static void showAdIfAvailable(
                @NonNull final Activity activity,
                @NonNull OnShowAdCompleteListener onShowAdCompleteListener) {


        }
    }
}