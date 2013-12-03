package net.obviam.starassault;

import com.badlogic.gdx.Game;
import net.obviam.starassault.screens.GameScreen;

public class StarAssault extends Game
{
	@Override
	public void create()
    {
		setScreen(new GameScreen());
	}
}
