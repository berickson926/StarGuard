package net.obviam.starassault_main.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import net.obviam.starassault_main.model.Block;
import net.obviam.starassault_main.model.Player;
import net.obviam.starassault_main.model.World;

/**
 * Created by: berickson926
 * Date: 9/30/13
 * Time: 4:27 PM
 * Copyright (c) 2012 Enplug, Inc. All rights reserved.
 */
public class WorldRenderer
{
    private World world;
    private OrthographicCamera camera;

    //For debug rendering
    ShapeRenderer debugRenderer = new ShapeRenderer();

    public WorldRenderer(World world)
    {
        this.world = world;
        this.camera = new OrthographicCamera(10, 7);
        this.camera.position.set(5, 3.5f, 0);
        this.camera.update();
    }

    public void render()
    {
        //Render the blocks
        debugRenderer.setProjectionMatrix(camera.combined);
        debugRenderer.begin(ShapeRenderer.ShapeType.Rectangle);

        for(Block block : world.getBlocks())
        {
            Rectangle blockBounds = block.getBounds();
            float x1 = block.getPosition().x + blockBounds.x;
            float y1 = block.getPosition().y + blockBounds.y;

            debugRenderer.setColor(new Color(1, 0, 0, 1));
            debugRenderer.rect(x1, y1, blockBounds.width, blockBounds.height);
        }

        //Render player
        Player player = world.getPlayer();
        Rectangle playerBounds = player.getBounds();
        float x1 = player.getPosition().x + playerBounds.x;
        float y1 = player.getPosition().y + playerBounds.y;
        debugRenderer.setColor(new Color(0, 1, 0, 1));
        debugRenderer.rect(x1, y1, playerBounds.width, playerBounds.height);

        debugRenderer.end();
    }
}
