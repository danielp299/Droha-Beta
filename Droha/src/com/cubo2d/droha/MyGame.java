package com.cubo2d.droha;
import com.badlogic.gdx.Game;

public class MyGame extends Game {
	private MenuScreen menu;
	
	@Override
	public void create() {		
		Assets.cargar();
		menu = new MenuScreen(this);
		setScreen(menu);
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {
		super.render();
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
}
