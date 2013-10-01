package net.obviam.starassault.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created by: berickson926
 * Date: 9/30/13
 * Time: 4:02 PM
 * Copyright (c) 2012 Enplug, Inc. All rights reserved.
 */
public class World
{
    /* THe Blocks making up the game world */
    private Array blocks = new Array();

    private Player player;

    //Accessor methods -----------------------------------------------------
    public Array<Block> getBlocks()
    {
        return blocks;
    }

    public Player getPlayer()
    {
        return player;
    }


    //-----------------------------------------------------------------------

    public World()
    {
        createDemoWorld();
    }

    private void createDemoWorld()
    {
        player = new Player(new Vector2(7,2));

        for(int i=0; i < 10; i++)
        {
            blocks.add(new Block(new Vector2(i, 0)));
            blocks.add(new Block(new Vector2(i, 7)));

            if (i > 2)
            {
                blocks.add(new Block(new Vector2(i, 1)));
            }
        }

        blocks.add(new Block(new Vector2(9, 2)));
        blocks.add(new Block(new Vector2(9, 3)));
        blocks.add(new Block(new Vector2(9, 4)));
        blocks.add(new Block(new Vector2(9, 5)));
        blocks.add(new Block(new Vector2(6, 3)));
        blocks.add(new Block(new Vector2(6, 4)));
        blocks.add(new Block(new Vector2(6, 5)));
    }

}
