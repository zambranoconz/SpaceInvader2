package mx.itesm.spaceinvaders;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class Nave extends Objecto {

    public Nave(Texture textura, float x, float y) {
        super(textura, x, y);
        sprite.setColor(Color.GREEN);
    }

    public void mover(float dx){
        sprite.setX(sprite.getX()+dx);
    }
}
