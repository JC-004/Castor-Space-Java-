package gameObjects;

import javax.swing.filechooser.FileSystemView;

public class Constants {
    //lo nuevo es la velocidad de las balas
    //DIMENSIONES POR DEFECTO (FRAMES)
    public static final int WIDTH = 1366;
    public static final int HEIGHT = 720;
    
    //PROPIEDADES DEL JUGADOR
    
    
    //velocidad de disparo
    public static final int FIRERATE = 200;
    //angulo de rotacion
    public static final double DELTAANGLE = 0.1;
    //aceleracion
    public static final double ACC = 0.2;
    //maxima velocidad de la nave permitida
    public static final double PLAYER_MAX_VEL = 7.0;
    
    //PROPIEDADES DEL JUGADOR
    //TIEMPO DE PARPADEO
    public static final long FLICKER_TIME = 200;
    //TIEMPO EN REAPARECER
    public static final long SPAWNING_TIME = 3000;
    //ESTO
    public static final long GAME_OVER_TIME = 3000;
    
    
    
    
    //PROPIEDADES DEL LASER
    //velocidad de que adquieren los lasers
    public static final double LASER_VEL = 15.0;
    
    //VELOCIDAD MAXIMA DEL METEORO
    public static final double METEOR_INIT_VEL = 2.0;
    //PUNTAJE PARA DESTRUIR EL METEORO
    public static final int METEOR_SCORE = 20;
    
    
    public static final double METEOR_MAX_VEL = 6.0;
	
    public static final int SHIELD_DISTANCE = 150;
    
    
    
    
    
    
    
    
    
    
    
    
    
    //PROPIEDADES DE UFO
    public static final int NODE_RADIUS = 160;
    public static final double UFO_MASS = 60;
    public static final int UFO_MAX_VEL = 3;
    
    
    //ESTE ES EL DISPARO DE LA BALA DEL ENEMIGO
    public static long UFO_FIRE_RATE = 1000;
    public static double UFO_ANGLE_RANGE = Math.PI / 2;
    //SCORE-PUNTAJE POR MATAR A STEVEN
    public static final int UFO_SCORE = 999;
    
    //ESTO
    public static final long UFO_SPAWN_RATE = 30000;
    
    //COSNTANTES (ACA PONES EL NOMBRE QUE VA IR EN EL MENU)
    public static final String PLAY = "JUGAR";
	
    public static final String EXIT = "SALIR";
    //CARGA DE LA BARRA DE MENU DE CARGA
    public static final int LOADING_BAR_WIDTH = 500;
    public static final int LOADING_BAR_HEIGHT = 50;
    //TABLA DE PUNTAJES
    public static final String RETURN = "RETROCEDER";
    public static final String HIGH_SCORES = "MAX. PUNTAJES";
	
    public static final String SCORE = "PUNTUACIÓN";
    public static final String DATE = "FECHA";
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //CARGAR EL ARCHIVO JSON
    //LO GUARDAREMOS EN LOS DOCUMENTOS
    public static final String SCORE_PATH = FileSystemView.getFileSystemView().getDefaultDirectory().getPath() +
			"\\(DATOS) CASTOR SPACE MATA A STEVEN TRAIDOR\\data.json"; // data.xml if you use XMLParser
    
    
    
    
    // This variables are required to use XMLParser
	
	public static final String PLAYER = "PLAYER";
	public static final String PLAYERS = "PLAYERS";
	
	// =============================================
	
	public static final long POWER_UP_DURATION = 10000;
	public static final long POWER_UP_SPAWN_TIME = 8000;
	
	public static final long SHIELD_TIME = 12000;
	public static final long DOUBLE_SCORE_TIME = 10000;
	public static final long FAST_FIRE_TIME = 14000;
	public static final long DOUBLE_GUN_TIME = 12000;
	
	public static final int SCORE_STACK = 1000;
    
}
