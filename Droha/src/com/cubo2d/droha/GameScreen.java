package com.cubo2d.droha;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class GameScreen implements Screen{
	
	Stage stage;
	MyGame game;
	
	Table interfaz;
	Table menu;
	TextButton iMenu;
	TextButton mContinuar;
	TextButton mReiniciar;
	TextButton mSalir;
	
	public GameScreen(MyGame _game,int tipoPersonaje) {
		// TODO Auto-generated constructor stub
		game = _game;
		stage = new Stage();
		interfaz();
		
		stage.addActor(interfaz);
		stage.addActor(menu);
		
	}
	
	public void interfaz(){
		interfaz = new Table();
		interfaz.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		interfaz.setBackground(Assets.skin.getDrawable("fondoMenu"));
		
		iMenu = new TextButton("Menu/Pausa", Assets.skin);
		interfaz.add(iMenu).width(Assets.escala/2).height(Assets.escala/2);
	}
	
	public void menu(){
		menu = new Table();
		menu.setBounds(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		mContinuar = new TextButton("Continuar", Assets.skin);
		mReiniciar = new TextButton("Continuar", Assets.skin);
		mSalir = new TextButton("Continuar", Assets.skin);
		
		menu.add(mContinuar).width(Assets.escala).height(Assets.escala);
		menu.row();
		menu.add(mReiniciar).width(Assets.escala).height(Assets.escala);
		menu.row();
		menu.add(mSalir).width(Assets.escala).height(Assets.escala);
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
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
		dispose();
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
