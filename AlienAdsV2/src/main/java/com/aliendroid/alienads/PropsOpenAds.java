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


public class PropsOpenAds implements LifecycleObserver, Application.ActivityLifecycleCallbacks {
    public static String IDOPEN = "";
    public static MyApplication myApplication;
    public static AppOpenAdManager appOpenAdManager;
    public static Activity currentActivity;
    public static boolean LOADADS;
    public static String SELECT_ADS = "";

    public PropsOpenAds(MyApplication myApplication) {
        PropsOpenAds.myApplication = myApplication;
        PropsOpenAds.myApplication.registerActivityLifecycleCallbacks(this);

    }

    public static void LoadOpenAds(String idOpenAds, boolean loadads) {


    }

    public static void LoadOpenAds(String idOpenAds, boolean loadads, String selectADS) {
        LOADADS = loadads;
        SELECT_ADS = selectADS;
        try {
            if (LOADADS) {
            } else {
                IDOPEN = "";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    protected void onMoveToForeground() {
        // Show the ad (if available) when the app moves to foreground.
        appOpenAdManager.showAdIfAvailable(currentActivity);
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
    }


    public interface OnShowAdCompleteListener {
        void onShowAdComplete();
    }

    public static class AppOpenAdManager {


        public AppOpenAdManager() {
        }

        public static void loadAd(Context context) {


        }

        private static boolean wasLoadTimeLessThanNHoursAgo(long numHours) {
            return false;
        }

        private static boolean isAdAvailable() {
            return false;
        }
        public static void showAdIfAvailable(@NonNull final Activity activity) {
            showAdIfAvailable(activity, new OnShowAdCompleteListener() {
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