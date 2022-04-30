package org.doggg;

import java.util.ArrayList;
import java.util.Random;

public class ClothesChooser{
    public ClothesChooser(){
        clothes=new ArrayList<ClothesNode>();
        r=new Random();
    }
    public void append(ClothesNode aCloth){
        clothes.add(aCloth);
    }
    public ClothesNode choose(){
        int selection=r.nextInt(0, clothes.size());
        return clothes.get(selection);
    }
    private ArrayList<ClothesNode> clothes;
    private Random r;
}

