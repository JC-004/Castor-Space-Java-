package graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.sound.sampled.Clip;

public class Assets {

    public static boolean loaded = false;
    public static float count = 0;
    public static float MAX_COUNT = 59*15;
    //78-19=59
    // Assests = recursos externos
    public static BufferedImage player;
    public static BufferedImage doubleGunPlayer;
    public static BufferedImage[] shieldEffect = new BufferedImage[3];
    public static Clip powerUp;
    public static BufferedImage orb, doubleScore, doubleGun, fastFire, shield, star;
    public static BufferedImage speed;
    public static BufferedImage[] exp = new BufferedImage[9];
    public static BufferedImage blueLaser, greenLaser, redLaser;
    public static BufferedImage ufo;
    public static BufferedImage[] numbers = new BufferedImage[11];
    public static BufferedImage life;
    public static Font fontBig;
    public static Font fontMed;
    public static BufferedImage[] bigs = new BufferedImage[14];
    public static BufferedImage[] meds = new BufferedImage[2];
    public static BufferedImage[] smalls = new BufferedImage[2];
    public static BufferedImage[] tinies = new BufferedImage[2];

    // Cambia a un array para múltiples clips
    
    public static Clip explosion, playerLoose, playerShoot, ufoShoot;

    // UI - Carga de los botones
    public static BufferedImage blueBtn;
    public static BufferedImage greyBtn;
    public static BufferedImage universo;
    public static BufferedImage universo2;
    public static BufferedImage universo3;

    public static void init() {
        doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        Random dado = new Random();
        int numero = dado.nextInt(7);
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
doubleGunPlayer = loadImage("/JUGADOR/doubleGunPlayer.png");

        for (int i = 0; i < 3; i++) {
            shieldEffect[i] = loadImage("/EFECTOS2/shield" + (i + 1) + ".png");
        }

        powerUp = loadSound("/SONIDOS/BONO/powerUp.wav");

        orb = loadImage("/powers/orb.png");
        doubleScore = loadImage("/powers/doubleScore.png");
        doubleGun = loadImage("/powers/doubleGun.png");
        fastFire = loadImage("/powers/fastFire.png");
        star = loadImage("/powers/star.png");
        shield = loadImage("/powers/shield.png");

        // Carga de música
        
        
        /*for(int i=0;i<19;i++){
            backgroundMusic = loadSound("/SONIDOS/M_FONDO/" + i + ".wav");
            
        }*/
        //20
        
        

        universo = loadImage("/UNIVERSO/u.png");
        universo2 = loadImage("/UNIVERSO/u2.png");
        universo3 = loadImage("/UNIVERSO/u3.png");

        player = loadImage("/JUGADOR/CASTOR.png");
        speed = loadImage("/EFECTOS/propulsor.png");

        blueLaser = loadImage("/LASERS/AZUL.png");
        greenLaser = loadImage("/LASERS/VERDE.png");
        redLaser = loadImage("/LASERS/ROJO.png");

        ufo = loadImage("/JUGADOR/A.png");

        fontBig = loadFont("/fonts/kenvector_future.ttf", 42);
        fontMed = loadFont("/fonts/kenvector_future_thin.ttf", 20);
//31
        
        life = loadImage("/OTROS/" + numero + ".png");

        for (int i = 0; i < bigs.length; i++)
            bigs[i] = loadImage("/METEOROS/big/" + (i + 1) + ".png");

        for (int i = 0; i < meds.length; i++)
            meds[i] = loadImage("/METEOROS/med/" + (i + 1) + ".png");

        for (int i = 0; i < smalls.length; i++)
            smalls[i] = loadImage("/METEOROS/small/" + (i + 1) + ".png");

        for (int i = 0; i < tinies.length; i++)
            tinies[i] = loadImage("/METEOROS/tiny/" + (i + 1) + ".png");
//21+31
        for (int i = 0; i < exp.length; i++)
            exp[i] = loadImage("/EXPLOSION/" + i + ".png");

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = loadImage("/NUMEROS/" + i + ".png");

        explosion = loadSound("/SONIDOS/R_EXPLOTADA/ROCA_EXPLOTADA.wav");
        playerLoose = loadSound("/SONIDOS/PIERDE_CHOCA/CHOCA.wav");
        playerShoot = loadSound("/SONIDOS/BALA_JUGADOR/BALA.wav");
        ufoShoot = loadSound("/SONIDOS/BALA_ENEMIGA/BALA_ENEMIGA.wav");

        greyBtn = loadImage("/MENUCES/grey_button.png");
        blueBtn = loadImage("/MENUCES/blue_button.png");
//26+52 = 78

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

        loaded = true;
    }

    public static BufferedImage loadImage(String path) {
        count++;
        return Loader.ImageLoader(path);
    }

    public static Font loadFont(String path, int size) {
        count++;
        return Loader.loadFont(path, size);
    }

    public static Clip loadSound(String path) {
        count++;
        return Loader.loadSound(path);
    }
}
