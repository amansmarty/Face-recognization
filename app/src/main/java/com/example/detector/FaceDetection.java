package com.example.detector;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class FaceDetection extends Application {
    public final static String TEXT = "TEXT";
    public final static String DIALOG = "DIALOG";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
