package gameObjects;

import java.awt.image.BufferedImage;

import graphics.Assets;


public enum PowerUpTypes {
	SHIELD("ESCUDO", Assets.shield),
	LIFE("+1 VIDA", Assets.life),
	SCORE_X2("PUNTAJE x2", Assets.doubleScore),
	FASTER_FIRE("DISPARO RAPIDO", Assets.fastFire),
	SCORE_STACK("+1000 PUNTOS", Assets.star),
	DOUBLE_GUN("DOBLE DISPARO", Assets.doubleGun);
	
	public String text;
	public BufferedImage texture;
	
	private PowerUpTypes(String text, BufferedImage texture){
		this.text = text;
		this.texture = texture;
	}
}
