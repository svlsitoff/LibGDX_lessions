package com.mygdx.game.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.models.FPick;

public class GameScreen implements Screen {
    private Texture carTexture;
    private FPick fPick;
    private SpriteBatch batch;
    OrthographicCamera camera;
    private float posx =0f;
    boolean flag = true;
    @Override
    public void show() {

        batch = new SpriteBatch();
        carTexture = new Texture(Gdx.files.internal("fuck.png"));
        fPick = new FPick(carTexture,0,0,4f,4f);
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
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        fPick.draw(batch);
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

        float aspectRatio = (float) height/width;
        camera = new OrthographicCamera(20f,20f*aspectRatio);
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

        batch.dispose();
        carTexture.dispose();
    }
}
