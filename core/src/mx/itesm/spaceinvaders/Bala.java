package mx.itesm.spaceinvaders;

import com.badlogic.gdx.graphics.Texture;

public class Bala extends Objecto {

    // Velocidad
    private float vy = 360; // pixeles por segundo

    public Bala(Texture textura, float x, float y){
        super(textura,x,y);
    }

    public void mover(float dt){
        float dy = vy * dt;
        sprite.setY(sprite.getY() + dy);
    }

}
