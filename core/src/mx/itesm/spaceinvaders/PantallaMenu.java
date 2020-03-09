package mx.itesm.spaceinvaders;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

class PantallaMenu extends Pantalla {

    private final Juego juego;
    private Texture texturaFondo;

    //MENU
    private Stage escenaMenu; //botones, ...

    public PantallaMenu(Juego juego) {
        this.juego = juego;
    }

    @Override
    public void show() {
        texturaFondo = new Texture("fondo.jpg");
        crearMenu();
    }

    private void crearMenu() {
        escenaMenu = new Stage(vista);
        //Boton Jugar
        Texture texturaBtnJugar = new Texture("btn_jugar.png");
        TextureRegionDrawable trdJugar = new TextureRegionDrawable(new TextureRegion(texturaBtnJugar));
        //Imagen btn presionado
        Texture texturaBtnJugarP = new Texture("btn_jugarP.png");
        TextureRegionDrawable trdJugarP = new TextureRegionDrawable(new TextureRegion(texturaBtnJugarP));

        ImageButton btnJugar = new ImageButton(trdJugar, trdJugarP);

        btnJugar.setPosition(ANCHO/2-btnJugar.getWidth()/2 , 2*ALTO/3 );
        //Listener
        btnJugar.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                juego.setScreen(new PantallaSpaceInvaders(juego));
            }
        });

        escenaMenu.addActor(btnJugar);

        Gdx.input.setInputProcessor(escenaMenu);
    }

    @Override
    public void render(float delta) {
        borrarPantalla();
        batch.setProjectionMatrix(camara.combined);

        batch.begin();
        batch.draw(texturaFondo,0,0);
        batch.end();

        escenaMenu.draw();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        texturaFondo.dispose();
    }
}
