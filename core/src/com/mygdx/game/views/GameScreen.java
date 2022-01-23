package com.mygdx.game.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
    private Texture texture;
    private SpriteBatch spriteBatch;
    private float posx =0f;
    boolean flag = true;
    @Override
    public void show() {

        spriteBatch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("car.png"));
    }

    @Override
    public void render(float delta) {


        if(flag){
            posx++;
            if(posx==60){
                flag=false;
            }
        }else {
            posx--;
            if(posx==0){
                flag=true;
            }
        }
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        spriteBatch.begin();
        spriteBatch.draw(texture,posx,0);
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

        spriteBatch.dispose();
        texture.dispose();
    }
}
