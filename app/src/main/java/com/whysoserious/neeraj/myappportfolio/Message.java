package com.whysoserious.neeraj.myappportfolio;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Neeraj on 25-Mar-16.
 */
public class Message {
    //to show toast
    public static void message(Context context,String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
