package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener{
    
    
    private boolean[] keys = new boolean[256];
    
    
    public static boolean UP,LEFT,RIGHT, SHOOT;
    public KeyBoard(){
        UP = false;
        LEFT = false;
        RIGHT= false;
        SHOOT = false;
        
    }
    public void update(){
        /*ACA SE DEFINEN LAS 
        TECLAS DE MOVIMIENTO
        */
        UP = keys[KeyEvent.VK_W] ;
        LEFT = keys[KeyEvent.VK_A] ;
        RIGHT = keys[KeyEvent.VK_D] ;
        SHOOT = keys[KeyEvent.VK_P] ;
        
    }
    

    @Override
    public void keyPressed(KeyEvent ke) {
        keys[ke.getKeyCode()] = true;
        
        
    }
    
    

    @Override
    public void keyReleased(KeyEvent ke) {
        keys[ke.getKeyCode()] = false;
    }
    
    
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

}
