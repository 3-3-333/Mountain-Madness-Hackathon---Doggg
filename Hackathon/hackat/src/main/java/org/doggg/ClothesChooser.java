package org.doggg;

import java.util.ArrayList;
import java.util.Random;

public class ClothesChooser{
    public ClothesChooser(){
        up=new ArrayList<ClothesNode>();
        r=new Random();
    }
    public void MakeList()){
        up.add(new ClothesNode("Up1", "resources/Up1.png"));
        up.add(new ClothesNode("Up2", "resources/Up2.png"));
        for(int i=1;i<6;i++){
            bodysuit.add(new ClothesNode("bodysuit"+i, 
                 "resources/bodysuit"+i+".png"));
        }
    }
    public void randomSet(){
        
    }
    private ArrayList<ClothesNode> up;
    ClothesNode down;
    private ArrayList<ClothesNode> bodysuit;
    private ClothesNode body;
    private Random r;
}

