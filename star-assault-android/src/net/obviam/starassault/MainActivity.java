package net.obviam.starassault;

import android.os.Bundle;

import android.view.View;
import android.widget.FrameLayout;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MainActivity extends AndroidApplication
{

    View view;
    FrameLayout topSection;

    AndroidApplicationConfiguration cfg;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        //topSection = (FrameLayout) findViewById(R.id.topSection);
        
        cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        cfg.useWakelock = false;
        cfg.useAccelerometer = false;
        cfg.useCompass = false;

        //Use to create the child view/adslot layout available inside this app. Comment out line 41: initialize(...) instead
        //Game testGame = new StarAssault();
        //view = initializeForView(testGame, cfg);

        //topSection.addView(view);

        //original full screen approach
        initialize(new StarAssault(), cfg);
    }
}