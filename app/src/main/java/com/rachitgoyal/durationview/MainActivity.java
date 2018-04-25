package com.rachitgoyal.durationview;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.rachitgoyal.durationitem.DurationView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    DurationView mDurationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDurationView = findViewById(R.id.programmatic_dv);

        final Handler handler = new Handler();
        final int delay = 2000;

        final Random rnd = new Random();

        handler.post(new Runnable() {
            public void run() {
                mDurationView.setDays(rnd.nextInt(100));
                mDurationView.setHours(rnd.nextInt(24));
                mDurationView.setMins(rnd.nextInt(60));
                mDurationView.setSecs(rnd.nextInt(60));
                mDurationView.setDaysColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setHoursColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setMinsColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setSecsColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setDaysLabelColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setHoursLabelColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setMinsLabelColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                mDurationView.setSecsLabelColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));

                mDurationView.setShowDividers(rnd.nextBoolean());
                mDurationView.setDividersColor(Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
                handler.postDelayed(this, delay);
            }
        });
    }
}
