package org.doggg;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class ItemNode {
    public ItemNode(String name, String path){
        this.name=name;
        try {
            entity = ImageIO.read(getClass().
                    getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getName(){
        return this.name;
    }
    public Image getImage(){
        return this.entity;
    }
    protected String name;
    protected Image entity;
}
