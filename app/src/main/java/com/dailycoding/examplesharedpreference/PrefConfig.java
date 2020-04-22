package com.dailycoding.examplesharedpreference;


import android.content.Context;
import android.content.SharedPreferences;

/********************************************
 *     Created by DailyCoding on 4/15/2020.  *
 ********************************************/

public class PrefConfig {

    private static final String MY_PREFERENCE_NAME = "com.dailycoding.examplesharedpreference";
    private static final String PREF_TOTAL_KEY = "pref_total_key";

    public static void saveTotalInPref(Context context, int total) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(PREF_TOTAL_KEY, total);
        editor.apply();
    }

    public static int loadTotalFromPref(Context context) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return pref.getInt(PREF_TOTAL_KEY, 0);
    }

    public static void removeDataFromPref(Context context) {
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(PREF_TOTAL_KEY);
        editor.apply();
    }

}
