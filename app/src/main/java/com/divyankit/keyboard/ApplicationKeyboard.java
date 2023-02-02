package com.divyankit.keyboard;

import android.app.Application;
import android.content.Intent;
import android.provider.Settings;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by ankit on 26/4/16.
 */
public class ApplicationKeyboard extends Application {
    @Override
    public void onCreate() {
      /*  Intent enableIntent = new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS);
        enableIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(enableIntent);

        InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
        imeManager.showInputMethodPicker();*/

        super.onCreate();
    }
}
