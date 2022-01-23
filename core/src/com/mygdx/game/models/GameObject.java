package com.mygdx.game.models;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Rectangle;


public class GameObject {
    Polygon bounds;
    Sprite objects;
    public  GameObject(Texture texture,float x,float y,float width, float height){
        objects = new Sprite(texture);
    }
    public void  draw(SpriteBatch batch){
        objects.draw(batch);
    }
}
