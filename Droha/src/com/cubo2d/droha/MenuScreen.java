package com.cubo2d.droha;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class MenuScreen implements Screen {
	MyGame game;
	Stage stage;
	
	//menu Principal
	Table menuPrincipal;
	
	TextButton pNuevo;
	TextButton pAcerca;
	
	
	public MenuScreen(MyGame _game) {
		// TODO Auto-generated constructor stub
		stage = new Stage();
		game = _game;
		
		menuPrincipal();
		
		stage.addActor(menuPrincipal);
	}
	
	public void menuPrincipal(){
		menuPrincipal = new Table();
		menuPrincipal.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		menuPrincipal.setVisible(true);
		
		pNuevo = new TextButton("Nuevo", Assets.skin);
		pAcerca = new TextButton("Acerca", Assets.skin);
		
		menuPrincipal.add(pNuevo).width(Assets.escala*2).height(Assets.escala);
		menuPrincipal.row();
		menuPrincipal.add(pAcerca).width(Assets.escala*2).height(Assets.escala);
		
	}
	
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stage.act(delta);
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
