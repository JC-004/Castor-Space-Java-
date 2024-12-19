package states;


import gameObjects.Constants;
import gameObjects.Message;
import gameObjects.Meteor;
import gameObjects.MovingObject;

import gameObjects.Size;
import gameObjects.Ufo;
import graphics.Animation;
import graphics.Assets;
import io.JSONParser;
import io.ScoreData;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import math.Vector2D;
import gameObjects.Player;
import gameObjects.PowerUp;
import gameObjects.PowerUpTypes;
import ui.Action;


public class GameState extends State{
    public static final Vector2D PLAYER_START_POSITION = new Vector2D(Constants.WIDTH/2 - Assets.player.getWidth()/2,
			Constants.HEIGHT/2 - Assets.player.getHeight()/2);
    //estado menu - estado de records
    private Player player;
    private ArrayList<MovingObject>  movingObjects = new ArrayList<MovingObject>();
    
    
    //PARA LAS ANIMACIONES
    private ArrayList<Animation>  explosions = new ArrayList<Animation>();
    private ArrayList<Message> messages = new ArrayList<Message>();
    
    
    private int score = 0;
    
    
    //SE ESTABLECE EL # DE VIDAS DEL JUGADOR
    public int lives = 5;
    
    
    private int meteors;
    private int waves=1;
    
    //MUSICA DEL DISPARO DEL JUGADOR
    //private Sound playerShoot = new Sound(Assets.playerShoot);
    //MUSICA CUANDO CHOCAS Y PIERDES
    //private Sound playerLoose = new Sound(Assets.playerLoose);
    
    
    
    
    private long gameOverTimer;
    private boolean gameOver;
	
    private long ufoSpawner;
    private long powerUpSpawner;
    
    
    
    
    
    
    //DECLARACION DE LA VARIABLE 
    
    private int copia;

    
    
    
    
    
    
    public GameState (){
        
        //SE ESTABLECIO LA VELOCIDAD MAXIMA EN 5
        //VELOCIDAD DE LA NAVE
        //player = new Player(new Vector2D(100,500),new Vector2D(),7,Assets.player,this);
        
        
        player = new Player(PLAYER_START_POSITION, new Vector2D(),
				Constants.PLAYER_MAX_VEL, Assets.player, this);
	
        
	gameOver = false;
	movingObjects.add(player);
    
        
         // Suponiendo que quieres usar el primer clip de backgroundMusic
        
        
        
       
        
       
         
        
        
            
        
            
        
        
        
        
        
        
        
	meteors = 1;
        
        
        
	
        
        
        
        
        
        
        gameOverTimer = 0;
	ufoSpawner = 0;
	powerUpSpawner = 0;
        
        
        
        
        
        //playerShoot.changeVolume(-20.0f);
        //playerLoose.changeVolume(-20.0f);
        //backgroundMusic.changeVolume(-10.0f);
        //VOLUMEN MAXIMO = 6.0206
        //VOLUMEN MINIMO = -80.0
        
        //ESTO
	
        
        //playerLoose = new Sound(Assets.playerLoose);
        //playerShoot.changeVolume(-5.0f);
        
        
        startWave();
        
    }

    
    
    
    
    
    public void addScore(int value, Vector2D position) {
        Random musica = new Random();
        int m = musica.nextInt(9);
        Color c = null;
        if(m==0){
            c = Color.ORANGE;
        }
        if(m==1){
            c = Color.YELLOW;
        }
        if(m==2){
            c= Color.WHITE;
            
        }
        if(m==3){
            c= Color.GREEN;
        }
        if(m==4){
            c = Color.PINK;
        }
        if(m==5){
            c = Color.RED;
        }
        if(m==6){
            c = Color.magenta;
        }
        if(m==7){
            c= Color.GRAY;
            
        }
        if(m==8){
            c= Color.cyan;
        }
        
                //DEBE DECIR PUNTOS AL GANAR ROCAS
        String text = "+" + value + " PUNTOS";
		if(player.isDoubleScoreOn()) {
			c = Color.YELLOW;
			value = value * 2;
			text = "+" + value + " PUNTOS" + " (X2)";
		}
		
		score += value;
		messages.add(new Message(position, true, text, c, false, Assets.fontMed));
                
                
	
	}
    
  
    
    
    public void divideMeteor(Meteor meteor){
		
		Size size = meteor.getSize();
		
		BufferedImage[] textures = size.textures;
		
		Size newSize = null;
		
		switch(size){
		case BIG:
			newSize =  Size.MED;
			break;
		case MED:
			newSize = Size.SMALL;
			break;
		case SMALL:
			newSize = Size.TINY;
			break;
		default:
			return;
		}
		
		for(int i = 0; i < size.quantity; i++){
			movingObjects.add(new Meteor(
					meteor.getPosition(),
					new Vector2D(0, 1).setDirection(Math.random()*Math.PI*2),
					Constants.METEOR_INIT_VEL*Math.random() + 1,
					textures[(int)(Math.random()*textures.length)],
					this,
					newSize
					));
		}
	}
	
    
    
    
    
    public void startWave(){
        
        Random mama = new Random();
        int q = mama.nextInt(9);
        Color v = null;
        if(q==0){
            v = Color.BLUE;
        }
        if(q==1){
            v = Color.YELLOW;
        }
        if(q==2){
            v= Color.WHITE;
            
        }
        if(q==3){
            v= Color.GREEN;
        }
        if(q==4){
            v = Color.PINK;
        }
        if(q==5){
            v = Color.RED;
        }
        if(q==6){
            v = Color.magenta;
        }
        if(q==7){
            v= Color.GRAY;
            
        }
        if(q==8){
            v= Color.cyan;
        }
        //SE ESTABLECE EL COLOR DEL MENSAJE
        //PARA LAS RONDAS
        
        
        
        
        messages.add(new Message(new Vector2D(Constants.WIDTH/2, Constants.HEIGHT/2), false,
				"RONDA "+waves, v   , true, Assets.fontBig));
        
        
        double x,y;
        
        
        
        //ACA WAVES EMPIEZA SIENDO UNO
        
		
        
        
        
        
        
		for(int i = 0; i < meteors; i++){
			 
			x = i % 2 == 0 ? Math.random()*Constants.WIDTH : 0;
			y = i % 2 == 0 ? 0 : Math.random()*Constants.HEIGHT;
			
			BufferedImage texture = Assets.bigs[(int)(Math.random()*Assets.bigs.length)];
			
			movingObjects.add(new Meteor(
					new Vector2D(x, y),
					new Vector2D(0, 1).setDirection(Math.random()*Math.PI*2),
					Constants.METEOR_INIT_VEL*Math.random() + 1,
					texture,
					this,
					Size.BIG
					));
			
		}
		meteors ++;
                //LUEGO ACA AUMENTA EN UNO
                //AHORA VALE 2
                waves = waves+1;
                copia = waves-1;
                
    }
    
    
    
    
    
    public void playExplosion(Vector2D position){
		explosions.add(new Animation(
				Assets.exp,
				50,
				position.subtract(new Vector2D(Assets.exp[0].getWidth()/2, Assets.exp[0].getHeight()/2))
				));
	}
    
    
    private void spawnUfo(){
		
		int rand = (int) (Math.random()*2);
		
		double x = rand == 0 ? (Math.random()*Constants.WIDTH): Constants.WIDTH;
		double y = rand == 0 ? Constants.HEIGHT : (Math.random()*Constants.HEIGHT);
		
		ArrayList<Vector2D> path = new ArrayList<Vector2D>();
		
		double posX, posY;
		
		posX = Math.random()*Constants.WIDTH/2;
		posY = Math.random()*Constants.HEIGHT/2;	
		path.add(new Vector2D(posX, posY));

		posX = Math.random()*(Constants.WIDTH/2) + Constants.WIDTH/2;
		posY = Math.random()*Constants.HEIGHT/2;	
		path.add(new Vector2D(posX, posY));
		
		posX = Math.random()*Constants.WIDTH/2;
		posY = Math.random()*(Constants.HEIGHT/2) + Constants.HEIGHT/2;	
		path.add(new Vector2D(posX, posY));
		
		posX = Math.random()*(Constants.WIDTH/2) + Constants.WIDTH/2;
		posY = Math.random()*(Constants.HEIGHT/2) + Constants.HEIGHT/2;	
		path.add(new Vector2D(posX, posY));
		
		movingObjects.add(new Ufo(
				new Vector2D(x, y),
				new Vector2D(),
				Constants.UFO_MAX_VEL,
				Assets.ufo,
				path,
				this
				));
		
	}
    private void spawnPowerUp() {
		
		final int x = (int) ((Constants.WIDTH - Assets.orb.getWidth()) * Math.random());
		final int y = (int) ((Constants.HEIGHT - Assets.orb.getHeight()) * Math.random());
		
		int index = (int) (Math.random() * (PowerUpTypes.values().length));
		
		PowerUpTypes p = PowerUpTypes.values()[index];
		
		final String text = p.text;
		Action action = null;
		Vector2D position = new Vector2D(x , y);
		
		switch(p) {
		case LIFE:
			action = new Action() {
				@Override
				public void doAction() {
					
					lives ++;
					messages.add(new Message(
							position,
							false,
							text,
							Color.GREEN,
							false,
							Assets.fontMed
							));
				}
			};
			break;
		case SHIELD:
			action = new Action() {
				@Override
				public void doAction() {
					player.setShield();
					messages.add(new Message(
							position,
							false,
							text,
							Color.DARK_GRAY,
							false,
							Assets.fontMed
							));
				}
			};
			break;
		case SCORE_X2:
			action = new Action() {
				@Override
				public void doAction() {
					player.setDoubleScore();
					messages.add(new Message(
							position,
							false,
							text,
							Color.YELLOW,
							false,
							Assets.fontMed
							));
				}
			};
			break;
		case FASTER_FIRE:
			action = new Action() {
				@Override
				public void doAction() {
					player.setFastFire();
					messages.add(new Message(
							position,
							false,
							text,
							Color.BLUE,
							false,
							Assets.fontMed
							));
				}
			};
			break;
		case SCORE_STACK:
			action = new Action() {
				@Override
				public void doAction() {
					score += 1000;
					messages.add(new Message(
							position,
							false,
							text,
							Color.MAGENTA,
							false,
							Assets.fontMed
							));
				}
			};
			break;
		case DOUBLE_GUN:
			action = new Action() {
				@Override
				public void doAction() {
					player.setDoubleGun();
					messages.add(new Message(
							position,
							false,
							text,
							Color.ORANGE,
							false,
							Assets.fontMed
							));
				}
			};
			break;
		default:
			break;
		}
		
		this.movingObjects.add(new PowerUp(
				position,
				p.texture,
				action,
				this
				));
		
		
	}
    


	
        //------------------------------------YO---------------------
        
	public void update(float dt)
	{       if(gameOver){
            gameOverTimer += dt;
            
        }
        //SI VIDA ES -1 SE APAGA LA MUSICA
        
        
        
			
		
		powerUpSpawner += dt;
		ufoSpawner += dt;
		for(int i = 0; i < movingObjects.size(); i++) {
			
			MovingObject mo = movingObjects.get(i);
			
			mo.update(dt);
			if(mo.isDead()) {
				movingObjects.remove(i);
				i--;
			}
			
		}
		
		for(int i = 0; i < explosions.size(); i++){
			Animation anim = explosions.get(i);
			anim.update(dt);
			if(!anim.isRunning()){
				explosions.remove(i);
			}
			
		}
		
                
                
		if(gameOverTimer > Constants.GAME_OVER_TIME) {
			
			try {
				ArrayList<ScoreData> dataList = JSONParser.readFile();
				dataList.add(new ScoreData(score));
				JSONParser.writeFile(dataList);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			State.changeState(new MenuState());
		}
		 
		if(powerUpSpawner > Constants.POWER_UP_SPAWN_TIME) {
			spawnPowerUp();
			powerUpSpawner = 0;
		}
		
		
		if(ufoSpawner > Constants.UFO_SPAWN_RATE) {
			spawnUfo();
			ufoSpawner = 0;
		}
		
		for(int i = 0; i < movingObjects.size(); i++)
			if(movingObjects.get(i) instanceof Meteor)
				return;
		
                
                
                
		startWave();
                
                
		
	}
        
        //--------------------------YO------------------
	
	public void draw(Graphics g){
            Graphics2D g2d = (Graphics2D)g;
            
            
            //EMPIEZA SIENDO 2
            //SI ES PAR
            
                g.drawImage(Assets.universo, 0, 0, null);
            
            
            
            
            //si es impar
            if(copia%3==0){
                g.drawImage(Assets.universo3, 0, 0, null);
                
                
            }
            if(copia%5==0){
                g.drawImage(Assets.universo2, 0, 0, null);
            }
            
            
		
            g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		
            for(int i = 0; i < messages.size(); i++) {
                    messages.get(i).draw(g2d);
                    if(messages.get(i).isDead())
			messages.remove(i);
		}
		
            for(int i = 0; i < movingObjects.size(); i++)
			movingObjects.get(i).draw(g);
		
            for(int i = 0; i < explosions.size(); i++){
                    Animation anim = explosions.get(i);
                    g2d.drawImage(anim.getCurrentFrame(), (int)anim.getPosition().getX(), (int)anim.getPosition().getY(),
			null);
			
		}
            
            
            drawScore(g);
            drawLives(g);
            
            
        }
	
		
	
	
	private void drawScore(Graphics g) {
		
		
		
		
                
                Vector2D pos = new Vector2D(Constants.WIDTH-150, 25);
		
		String scoreToString = Integer.toString(score);
		
		for(int i = 0; i < scoreToString.length(); i++) {
			
			g.drawImage(Assets.numbers[Integer.parseInt(scoreToString.substring(i, i + 1))],
					(int)pos.getX(), (int)pos.getY(), null);
			pos.setX(pos.getX() + 20);
			
		}
                
                
		
	}
	
        
	private void drawLives(Graphics g){
		
                
		
		
                    
                    
                
			
		
		Vector2D livePosition = new Vector2D(25, 25);
		//CARGA EL ICONO DE LAS VIDAS
		g.drawImage(Assets.life, (int)livePosition.getX(), (int)livePosition.getY(), null);
		//CARGAR LA X EN EL JUEGO
		g.drawImage(Assets.numbers[10], (int)livePosition.getX() + 40,(int)livePosition.getY() + 5, null);
                //SE SIGUE VIENDO LAS IMAGENES Y LA X
		
                
                
                if(lives ==-1 || lives ==0){
                    Vector2D pos = new Vector2D(livePosition.getX(), livePosition.getY());
                    g.drawImage(Assets.numbers[0],
			(int)pos.getX() + 60, (int)pos.getY() + 5, null);
			pos.setX(pos.getX() + 20);
                    
                    
                    return;
                    
                }
                
		String livesToString = Integer.toString(lives);
                
		
                
                
		Vector2D pos = new Vector2D(livePosition.getX(), livePosition.getY());
		
		
                
                //numero de vidas
                
                
                
                
		for(int i=0;i <livesToString.length();i++){
                    
                    
                    int number = Integer.parseInt(livesToString.substring(i,i+1));
                    
                    g.drawImage(Assets.numbers[number],
                    (int)pos.getX() + 60, (int)pos.getY() + 5, null);
                    pos.setX(pos.getX() + 20);
                    
                        
                        
                        
                       
                }
                
                
                
                
	}
        
        
        
        
	
	public ArrayList<MovingObject> getMovingObjects() {
		return movingObjects;
	}
	
	public ArrayList<Message> getMessages() {
		return messages;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public boolean subtractLife(Vector2D position) {
            
            
            
            Random miercoles = new Random();
        int u = miercoles.nextInt(9);
        Color l = null;
        if(u==0){
            l = Color.BLUE;
        }
        if(u==1){
            l = Color.YELLOW;
        }
        if(u==2){
            l= Color.WHITE;
            
        }
        if(u==3){
            l= Color.GREEN;
        }
        if(u==4){
            l = Color.PINK;
        }
        if(u==5){
            l = Color.RED;
        }
        if(u==6){
            l = Color.magenta;
        }
        if(u==7){
            l= Color.GRAY;
            
        }
        if(u==8){
            l= Color.cyan;
        }
                lives --;
		
		Message lifeLostMesg = new Message(
				position,
				false,
				"-1 VIDA",
				l,
				false,
				Assets.fontMed
				);
		messages.add(lifeLostMesg);
		
		return lives >-1;
		
	}
	
	public void gameOver() {
            Random w = new Random();
        int b = w.nextInt(9);
        Color c = null;
        if(b==0){
            c = Color.BLUE;
        }
        if(b==1){
            c = Color.YELLOW;
        }
        if(b==2){
            c= Color.WHITE;
            
        }
        if(b==3){
            c= Color.GREEN;
        }
        if(b==4){
            c = Color.PINK;
        }
        if(b==5){
            c = Color.RED;
        }
        if(b==6){
            c = Color.magenta;
        }
        if(b==7){
            c= Color.GRAY;
            
        }
        if(b==8){
            c= Color.cyan;
        }
		Message gameOverMsg = new Message(
				PLAYER_START_POSITION,
				true,
				"FIN DEL JUEGO",
				c,
				true,
				Assets.fontBig);
		
		this.messages.add(gameOverMsg);
		
		gameOver = true;
                
                
	}
	
    //ACTUALIZAR POSICION

    
        

        
        
    
}

