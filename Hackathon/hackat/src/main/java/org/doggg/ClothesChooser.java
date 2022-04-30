package org.doggg;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ClothesChooser{
    public ClothesChooser(){
        up=new ArrayList<ClothesNode>();
        r=new Random();
    }
    public void MakeList(){
        up.add(new ClothesNode("Up1", "resources/Up1.png"));
        up.add(new ClothesNode("Up2", "resources/Up2.png"));
        for(int i=1;i<6;i++){
            bodysuit.add(new ClothesNode("bodysuit"+i, 
                 "resources/bodysuit"+i+".png"));
        }
        down=new ClothesNode("down1", "resources/Up1.png");
        body=new ClothesNode("body", "resources/body.png");
    }
    public void randomSet(Graphics2D g2){
        g2.drawImage(body.getImage(), 1, 1, 1668, 2224, null);
        int isBodySuit=r.nextInt(0, 2);
        if(isBodySuit==1){
            int index=r.nextInt(0,bodysuit.size());
            ClothesNode bodysuitPic=bodysuit.get(index+1);

        }else{
            int upIndex=r.nextInt(0,up.size());
            ClothesNode upPic=up.get(upIndex+1);
        }
    }
    private ArrayList<ClothesNode> up;
    ClothesNode down;
    private ArrayList<ClothesNode> bodysuit;
    private ClothesNode body;
    private Random r;
}

