package com.example.savedpreferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class SecondActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.activityb);
    }
}
