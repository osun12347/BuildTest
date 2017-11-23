package com.example.v_wngwei.buildtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCenter.start(getApplication(),"ce37104c-7fe4-4f10-9c58-b30c07f7771e", Analytics.class, Crashes.class);

        Button buttoncrash = (Button) findViewById(R.id.bt_crash);
        buttoncrash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //               int a=0;
                //               int b=2/a;
                throw new ArrayIndexOutOfBoundsException();
            }
        });
    }
}
