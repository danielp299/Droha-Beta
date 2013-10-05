package com.cubo2d.droha;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;

public class Assets {
	
	public static float escala;
	
	public static TextureRegion fondo;
	
	public static BitmapFont fuenteBoton;
	public static Skin skin;

	public Assets() {
		// TODO Auto-generated constructor stub
	}
	
	public static void cargar(){
		
		if(Gdx.graphics.getWidth() > Gdx.graphics.getHeight()){
			escala = Gdx.graphics.getHeight()/6;
		}else{
			escala = Gdx.graphics.getWidth()/6;
		}
		
		TextureAtlas atlas = new TextureAtlas(Gdx.files.internal("data/empaquetado.atlas"));
		fuenteBoton = new BitmapFont(Gdx.files.internal("data/forte.fnt"),atlas.findRegion("menu/forte"), false);
		if(Gdx.graphics.getWidth() < 400){
			fuenteBoton.setScale(0.7f);	
		}else if(Gdx.graphics.getWidth() < 900){
			fuenteBoton.setScale(0.9f);	
		}else if(Gdx.graphics.getWidth() < 1200){
			fuenteBoton.setScale(1.3f);	
		}else if(Gdx.graphics.getWidth() < 1600){
			fuenteBoton.setScale(1.5f);
		}else {
			fuenteBoton.setScale(2f);
		}
		
		skin = new Skin();
		skin.add("boton", new TextureRegion(atlas.findRegion("menu/boton1")));
		
		
		TextButtonStyle textButtonStyle = new TextButtonStyle();
		textButtonStyle.up = skin.newDrawable("boton",Color.WHITE);
		textButtonStyle.down = skin.newDrawable("boton", Color.GREEN);
		textButtonStyle.over = skin.newDrawable("boton", Color.LIGHT_GRAY);
		textButtonStyle.font = fuenteBoton;
		skin.add("default", textButtonStyle);
		
		LabelStyle labelStyle =new LabelStyle();
		labelStyle.font = fuenteBoton;
		skin.add("default", labelStyle);
	}
}
