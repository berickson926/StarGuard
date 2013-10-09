package net.obviam.starassault;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import net.obviam.starassault_main.StarAssault;

public class Main
{
	public static void main(String[] args)
    {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "star-assault";
		cfg.useGL20 = false;
		cfg.width = 960;
		cfg.height = 640;
		
		new LwjglApplication(new StarAssault(), cfg);
	}
}
