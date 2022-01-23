package com.mygdx.game.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;


public class GameObject {
    Rectangle bounds;
    Sprite objects;
    public  GameObject(Texture texture,float x,float y,float width, float height){
        objects = new Sprite(texture);
        bounds = new Rectangle(x,y,width,height);
    }
    public void  draw(SpriteBatch batch){
        objects.setBounds(bounds.getX(), bounds.getY(),bounds.getWidth(),bounds.getHeight());
        objects.draw(batch);
    }
}
