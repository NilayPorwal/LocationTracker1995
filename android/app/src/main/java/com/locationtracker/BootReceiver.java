package com.locationtracker;

import android.content.BroadcastReceiver;

import android.content.Context;

import android.content.Intent;
import android.os.Build;

public class BootReceiver extends BroadcastReceiver {

   @Override
   public void onReceive(Context context, Intent intent) {

       if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
           //log("Starting the service in >=26 Mode from a BroadcastReceiver")
           context.startForegroundService(new Intent(context, LocationService.class));
           return;
       }

       context.startService(new Intent(context, LocationService.class));

   }

}