package graphics;

import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.util.Random;

public class Sound {
    public Clip clip;
    public FloatControl volume;
    public FloatControl volume2;

    public Sound(Clip clip) {
        this.clip = clip;
        
    }

    

    public void play() {
        clip.setFramePosition(0);
        clip.start();
    }

    
    /*public void R(){
        clip.setFramePosition(0);
        volume2 = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume2.setValue(-20.0f);
        clip.start();
        chekeo();
        
    }*/
    
    
    
    
    
    /*public void chekeo(){
        new Thread(() -> {
            while (true) {
                if (!clip.isRunning() && clip.getFramePosition() >= clip.getFrameLength()) {
                    // Cuando termina, vuelve a cargar una pista aleatoria y reproduce
                    ACTUALIZAR();
                }
                try {
                    Thread.sleep(10000); // Chequeo cada 100ms
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
        
        
    }*/
    

    public void stop() {
        clip.stop();
    }
    /*public void cerrar(){
        clip.stop();
        clip.close();
    }*/
    public int getFramePosition() {
	return clip.getFramePosition();
	}

    public void changeVolume(float value) {
        volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(value);
    }
    
    // Método para actualizar la música
    /*public void ACTUALIZAR() {
        Random meme = new Random();
        int MEME = meme.nextInt(23);
        
        if (clip != null) {
            clip.stop();
            clip.close();
            
            
            
            Clip newClip = Loader.loadSound("/SONIDOS/M_FONDO/"+MEME+".wav");
            clip = newClip;
            R();
            
            
        }
        
        
        
        
        
        if(clip == null){
            
            Clip newClip =  Loader.loadSound("/SONIDOS/M_FONDO/"+MEME+".wav");
            clip = newClip;
            R();
            
        }
        

        
        
        //SI EL CLIP ES NULO
        
        
        

        
        

        // Ajusta el volumen del nuevo clip
        
        
        
        
        
    }*/
}
