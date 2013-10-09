package net.obviam.starassault_main.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by: berickson926
 * Date: 9/30/13
 * Time: 3:45 PM
 * Copyright (c) 2012 Enplug, Inc. All rights reserved.
 */
public class Player
{
    public enum State {IDLE, WALKING, JUMPING, DYING}

    static final float SPEED = 2f; // Units per second
    static final float JUMP_VELOCITY = 1f;
    static final float SIZE = 0.5f; // half a unit

    private Vector2    position = new Vector2();
    private Vector2    acceleration = new Vector2();
    private Vector2    velocity = new Vector2();
    private Rectangle  bounds = new Rectangle();
    private State      state = State.IDLE;
    private boolean    facingLeft = true;

    public Player(Vector2 position)
    {
        this.position = position;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }

    //Accessors -------------------------------------------------------------

    public Rectangle getBounds()
    {
        return bounds;
    }

    public Vector2 getPosition()
    {
        return position;
    }

}
