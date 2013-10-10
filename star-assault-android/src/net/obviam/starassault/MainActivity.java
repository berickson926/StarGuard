package net.obviam.starassault;

import android.os.Bundle;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import net.obviam.starassault_main.StarAssault;
import net.obviam.starassault_main.view.StarAssaultAlternate;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AndroidApplication
{

    View view;
    FrameLayout topSection;

    AndroidApplicationConfiguration cfg;

    private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    boolean flag = false;
    ApplicationListener game;
    private final Handler myHandler = new Handler();

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
        game = new StarAssault();
        initialize(game, cfg);

        //Test for multiple initialize calls!

//        Log.d("StarGuardActivity", "About to call start task schedulerer!");
//        scheduler.scheduleAtFixedRate(
//                new Runnable()
//                {
//                    @Override
//                    public void run()
//                    {
//                        Log.d("StarGuardActivity", "Running multiple initialization task!");
//
//                            myHandler.post(new Runnable()
//                            {
//                                @Override
//                                public void run()
//                                {
//                                    try
//                                    {
//                                        if(flag)
//                                        {
//                                            //game.dispose();
//                                            game = new StarAssaultAlternate();
//                                            Log.d("StarGuardActivity", "Initializing StarGuard Alternate");
//                                            initialize(game, cfg);
//                                            flag = false;
//                                        }
//                                        else
//                                        {
//                                            //game.dispose();
//                                            game = new StarAssault();
//                                            Log.d("StarGuardActivity", "Initializing StarGuard original");
//                                            flag = true;
//                                            initialize(game, cfg);
//                                        }
//                                }
//                                catch (Exception e)
//                                {
//                                    Log.e("StarGuardActivity", e.toString());
//                                }
//                                }
//                            });
//
//                        Log.d("StarGuardActivity", "Finished multiple initialization task!");
//                    }
//                }, 5, 10, TimeUnit.SECONDS);

        Log.d("StarGuardActivity", "Reached end of onCreate()");
    }
}