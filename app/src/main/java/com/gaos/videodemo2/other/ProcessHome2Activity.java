package com.gaos.videodemo2.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gaos.videodemo2.R;
import com.gaos.videodemo2.nicevideoplayer.NiceVideoPlayerManager;


public class ProcessHome2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_home2);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new DemoProcessHomeKeyFragenment())
                .commit();
    }

    @Override
    public void onBackPressed() {
        if (NiceVideoPlayerManager.instance().onBackPressd()) return;
        super.onBackPressed();
    }
}
