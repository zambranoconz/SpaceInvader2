package mx.itesm.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Objecto {

    protected Sprite sprite;

    public Objecto(Texture textura, float x, float y){
        sprite = new Sprite(textura);
        sprite.setPosition(x,y);
    }

    public void render(SpriteBatch batch){
        sprite.draw(batch);
    }

}
