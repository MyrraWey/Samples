package com.zinitsolutions.pushnotifications;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.Subscription;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;
import com.backendless.messaging.Message;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static String APP_ID = "41588A70-0C49-C762-FF4C-E09443867200";
    public static String APP_SECRET = "C5345A94-A36D-7EE1-FF15-0E9451844F00";
    public static String APP_VERSION = "v1";
    public static String APP_GCM = "305545266795";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Backendless.initApp(
                this,
                APP_ID,
                APP_SECRET,
                APP_VERSION
        );

        Backendless.Messaging.registerDevice(
                APP_GCM,
                new AsyncCallback<Void>() {
                    @Override
                    public void handleResponse(Void response) {
                        Toast.makeText(MainActivity.this, "Registered", Toast.LENGTH_SHORT).show();
                        messagingSubscribe();
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Toast.makeText(MainActivity.this, "Registered failure", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    private void messagingSubscribe() {
        Backendless.Messaging.subscribe(
                new AsyncCallback<List<Message>>() {
                    @Override
                    public void handleResponse(List<Message> response) {
                        Log.d("getMessage", "successful");
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Log.d("getMessage", "failed");
                    }
                },
                new AsyncCallback<Subscription>() {
                    @Override
                    public void handleResponse(Subscription response) {
                        Log.d("getMessage", "successful");
                    }

                    @Override
                    public void handleFault(BackendlessFault fault) {
                        Log.d("getMessage", "failed");
                    }
                }
        );
    }
}
