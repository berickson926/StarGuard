package net.obviam.starassault_main;

import com.badlogic.gdx.Game;
import net.obviam.starassault_main.screens.GameScreen;

public class StarAssault extends Game
{
	@Override
	public void create()
    {
		setScreen(new GameScreen());
	}
}
