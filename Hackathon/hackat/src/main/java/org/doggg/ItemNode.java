package org.doggg;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;

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
    public BufferedImage getImage(){
        return this.entity;
    }
    private String name;
    private BufferedImage entity;
}
