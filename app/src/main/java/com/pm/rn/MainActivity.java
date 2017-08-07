package com.pm.rn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final String TAG=MainActivity.class.toString();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        RNCacheViewManager.init(this);
        ReactPreLoader.init(this, new ReactInfo("RN", null));
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);
        Button textView = (Button) findViewById(R.id.tv);
        Button button = (Button) findViewById(R.id.button);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LauncherActivity.class));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MyReactActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}