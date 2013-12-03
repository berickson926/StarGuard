package net.obviam.starassault.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import net.obviam.starassault.model.World;
import net.obviam.starassault.view.WorldRenderer;

/**
 * Created by: berickson926
 * Date: 9/30/13
 * Time: 4:15 PM
 * Copyright (c) 2012 Enplug, Inc. All rights reserved.
 */
public class GameScreen implements Screen
{
    private World world; //Holds all the objects in the game world
    private WorldRenderer renderer = new WorldRenderer(world);//Draws all the objects in world to screen

    @Override
    public void render(float delta)
    {
        Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
        renderer.render();
    }

    @Override
    public void resize(int width, int height)
    {

    }

    @Override
    public void show()
    {
        world = new World();
        renderer = new WorldRenderer(world);
    }

    @Override
    public void hide()
    {

    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void dispose()
    {

    }
}
