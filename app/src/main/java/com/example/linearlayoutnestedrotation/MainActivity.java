package com.example.linearlayoutnestedrotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.mainLayout).postDelayed(new Runnable() {
            @Override
            public void run() {
                doRotation();
            }
        }, 3000L);
    }

    private void doRotation() {
        final LinearLayout topPlayers = (LinearLayout) findViewById(R.id.topPlayers);
        final RelativeLayout p2 = (RelativeLayout) findViewById(R.id.p2);
        final RelativeLayout p3 = (RelativeLayout) findViewById(R.id.p3);
        final TextView p2tv = (TextView) findViewById(R.id.p2text);
        final TextView p3tv = (TextView) findViewById(R.id.p3text);
        LinearLayout.LayoutParams parms;

        topPlayers.setOrientation((LinearLayout.HORIZONTAL));

        parms = (LinearLayout.LayoutParams) p2.getLayoutParams();
        parms.width = 0;
        parms.height = LinearLayout.LayoutParams.MATCH_PARENT;
        p2.setLayoutParams(parms);
        p2tv.setRotation(-90f);

        parms = (LinearLayout.LayoutParams) p3.getLayoutParams();
        parms.width = 0;
        parms.height = LinearLayout.LayoutParams.MATCH_PARENT;
        p3.setLayoutParams(parms);
        p3tv.setRotation(90f);
    }
}
