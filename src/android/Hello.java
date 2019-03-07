package com.example.plugin;

//import android.content.DialogInterface;
//import android.support.v7.app.AlertDialog;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.widget.Toast;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("greet")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);
            
            Toast.makeText(this.cordova.getActivity(), Toast.LENGTH_LONG).show();
            
            
            
            return true;

        } else {
            
            return false;

        }
    }
}
