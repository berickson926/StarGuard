package net.obviam.starassault_main.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by: berickson926
 * Date: 9/30/13
 * Time: 3:58 PM
 * Copyright (c) 2012 Enplug, Inc. All rights reserved.
 */
public class Block
{
    private static final float SIZE = 1f;

    private Vector2 position = new Vector2();
    private Rectangle bounds = new Rectangle();

    public Block(Vector2 position)
    {
        this.position = position;
        this.bounds.width = SIZE;
        this.bounds.height = SIZE;
    }

    public Rectangle getBounds()
    {
        return bounds;
    }

    public Vector2 getPosition()
    {
        return position;
    }

}
