package gameObjects;

//ESTO DE ACA ES UN ENUMERADOR DONDE SE

import graphics.Assets;
import java.awt.image.BufferedImage;

//GUARDAN COSNTANTES
public enum Size {
    BIG(2,Assets.meds),MED(2,Assets.smalls),
    SMALL(2,Assets.tinies),TINY(0,null);
    
    public int quantity ;
    public BufferedImage[] textures;
    
    
    private Size(int quantity,BufferedImage[] textures){
        
        
        this.quantity = quantity;
        this.textures = textures;
        
        
    }
    
}
