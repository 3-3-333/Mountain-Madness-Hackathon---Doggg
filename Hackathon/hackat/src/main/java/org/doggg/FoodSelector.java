package org.doggg;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class FoodSelector{
   private Random rand;
   private ArrayList<FoodNode> foodlist;
   Image IcecreamImage,BreadImage,HamburgImage,JuiceImage;

   public FoodSelector(){
     rand=new Random();
     foodlist=new ArrayList<FoodNode>();     
     this.creatlist();
   }

   public void creatlist(){
       foodlist.add(new FoodNode("Icecream","resources/Food1_24x24.png"));
       foodlist.add(new FoodNode("Bread","resources/Food2_24x24.png"));
       foodlist.add(new FoodNode("Hamburg","resources/Food3_24x24.png"));
       foodlist.add(new FoodNode("Juice","resources/Food4_24x24.png"));

       IcecreamImage=foodlist.get(0).getImage();
       BreadImage=foodlist.get(1).getImage();
       HamburgImage=foodlist.get(2).getImage();
       JuiceImage=foodlist.get(3).getImage();
   }
   public void choosefood(){
        System.out.println("Your food is : ");
        int length=foodlist.size();
        int randnumber=rand.nextInt(length)+1;

        foodlist.get(randnumber);
        
   }


   public void draw(Graphics2D g)
   {
        g.drawImage(IcecreamImage, 1, 1, 48, 48, null);
        g.drawImage(BreadImage, 1, 50,48, 48, null);
        g.drawImage(HamburgImage, 1,100, 48, 48, null);
        g.drawImage(JuiceImage, 1, 150, 48, 48, null);
        
        
   }

    
}