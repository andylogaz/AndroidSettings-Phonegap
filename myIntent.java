//////////////////////////////////////////////////////////////////////////////
// Licensing: This is released under the MIT License
// Original author: A Loxley
// Feel free to modify as you see fit
// PLEASE DO NOT REMOVE THIS LICENSING INFORMATION
//////////////////////////////////////////////////////////////////////////////
// Version 1.0.0
// Build 120715.1
//////////////////////////////////////////////////////////////////////////////
package com.phonegap.plugins.myIntent;

import org.json.JSONArray;
import android.content.Intent;
import com.phonegap.api.Plugin;
import com.phonegap.api.PluginResult;

import android.provider.Settings;

public class myIntent extends Plugin {

    public PluginResult execute(String action, JSONArray args, String callbackId) {
        PluginResult.Status status = PluginResult.Status.OK;
        String result = "";

        if (action.equals("showSettings")) {
		    result = this.showSettings();
		}
		return new PluginResult(status, result);
    }

    public boolean isSynch(String action) {
        return false;
    }

    public void onDestroy() {
    }

    public String showSettings() {
        try {
        	this.ctx.startActivity(new Intent(Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS));
        	return ("OK");
        } catch (android.content.ActivityNotFoundException e) {
            System.out.println("MyIntent: Error launching settings");
            return e.toString();
        }
    }

}
