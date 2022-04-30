package org.doggg;
import java.awt.image.BufferedImage;
public class FoodNote extends ItemNode{
    private String name;
    private BufferedImage entity;
    public FoodNote(String name, String path){
        super(name,path);
    }
}