package org.doggg;
import java.awt.image.BufferedImage;
public class FoodNode extends ItemNode{
    private String name;
    private BufferedImage entity;
    public FoodNode(String name, String path){
        super(name,path);
    }
}