package gameObjects;

import graphics.Assets;

import graphics.Sound;
import java.awt.image.BufferedImage;

import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import math.Vector2D;
import states.GameState;

public abstract class MovingObject extends GameObject{
    protected Vector2D velocity;
    protected AffineTransform at;
    protected double angle;
    protected double maxVel;
    
    //almacenamiento de la variable
    protected int width;
    protected int height;
    protected GameState gameState;
    
    private Sound explosion;
    
    protected boolean Dead;
     
    
    public MovingObject(Vector2D position,
            Vector2D velocity,double maxVel, 
            BufferedImage texture,GameState gameState) {
        
        super(position, texture);
        this.velocity = velocity;
        //se inicializa la velcidad maxima permitida
        this.maxVel = maxVel;
        this.gameState = gameState;
        
        
        //ha pasado estos parametros
        // ESTO SON LAS DIMENSIONES DE LAS IMAGENES QUE PASAMOS
        width = texture.getWidth();
        height = texture.getHeight();
        
        
        angle =0;
        explosion = new Sound(Assets.explosion);
        //explosion.changeVolume(-10.0f);
        Dead = false;
        
    }
    
    protected void collidesWith(){
        ArrayList<MovingObject> movingObjects = gameState.getMovingObjects(); 
		
		for(int i = 0; i < movingObjects.size(); i++){
			
			MovingObject m  = movingObjects.get(i);
			
			if(m.equals(this))
				continue;
			
			double distance = m.getCenter().subtract(getCenter()).getMagnitude();
			
			if(distance < m.width/2 + width/2 && movingObjects.contains(this) && !m.Dead && !Dead){
				objectCollision(this, m);
			}
		}
        
    }

    
    
    
    
    
    
     
    private void objectCollision(MovingObject a, MovingObject b){
        Player p = null;
		
		if(a instanceof Player)
			p = (Player)a;
		else if(b instanceof Player)
			p = (Player)b;
		
		if(p != null && p.isSpawning()) 
			return;
		
		if(a instanceof Meteor && b instanceof Meteor)
			return;
		
		if(!(a instanceof PowerUp || b instanceof PowerUp)){
			a.Destroy();
			b.Destroy();
			return;
		}
		
		if(p != null){
			if(a instanceof Player){
				((PowerUp)b).executeAction();
				b.Destroy();
			}else if(b instanceof Player){
				((PowerUp)a).executeAction();
				a.Destroy();
			}
		}
		
		
                
                
    }
    
    
    
    //HCEMOS LA COPIA MEJOR ABAJO

        
    
    
    
    
    
    
    
    protected void Destroy(){
        //explosion.changeVolume(6.0f);
        Dead = true;
        
        
        //ESTO NO FUNCIONARA PARA LOS LASERS
        Dead = true;
	if(!(this instanceof Laser) && !(this instanceof PowerUp))
            explosion.play();
            
            
            /*
            //explosion.changeVolume(6.0f);
            SI PONGO ESTO ACA SONARA INCLUSO
            CON LAS PAREDES
            
            */
            //explosion.changeVolume(6.0f);
            
            
            
            
            
           
        
    }
    //CREAMOS UN METODO UNICO PARA EL CASO DE LOS METEOROS
    
    
    
    //ESTE ES EL METODO PARA OBTENER EL CENTRO 
    //DE CADA COSAS DEL JUEGO
    protected Vector2D getCenter(){
        return new Vector2D(position.getX()+width/2,position.getY() +height/2);
    }
    public boolean isDead() {return Dead;}

    
    

}
