package com.example.student.usingstring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i("LifeCycle", "onCreate() invoked here");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifeCycle", "onStart() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle", "onPause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle", "onStop() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("LifeCycle", "onRestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle", "onResume() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle", "onDestroy() invoked");
    }

}
