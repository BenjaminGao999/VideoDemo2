package com.gaos.videodemo2.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gaos.videodemo2.R;
import com.gaos.videodemo2.nicevideoplayer.NiceVideoPlayerManager;


public class UseInFragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_in_frag);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new DemoFragenment())
                .commit();
    }

    @Override
    public void onBackPressed() {
        if (NiceVideoPlayerManager.instance().onBackPressd()) return;
        super.onBackPressed();
    }
}
