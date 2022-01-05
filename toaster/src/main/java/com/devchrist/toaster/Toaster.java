package com.devchrist.toaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void simpletoast(Context context, String message){

        Toast.makeText(context, message,Toast.LENGTH_LONG ).show();
    }
}
