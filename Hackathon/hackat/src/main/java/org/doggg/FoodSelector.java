package org.doggg;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class FoodSelector{
   private Random rand;
   private ArrayList<FoodNode> foodlist;
   private ArrayList<Image> foodImage;


   public FoodSelector(){
     rand=new Random();
     foodlist=new ArrayList<FoodNode>();  
     foodImage=new ArrayList<Image>();
     this.creatlist();
   }

   public void creatlist(){
       foodlist.add(new FoodNode("Icecream","resources/Food1_24x24.png"));
       foodlist.add(new FoodNode("Bread","resources/Food2_24x24.png"));
       foodlist.add(new FoodNode("Hamburg","resources/Food3_24x24.png"));
       foodlist.add(new FoodNode("Juice","resources/Food4_24x24.png"));

       foodImage.add(foodlist.get(0).getImage());
       foodImage.add(foodlist.get(1).getImage());
       foodImage.add(foodlist.get(2).getImage());
       foodImage.add(foodlist.get(3).getImage());
   }
   public void choosefood(Graphics2D g){
        System.out.println("Your food is : ");
        int randnumber=rand.nextInt(4)+1;
        g.drawImage(foodImage.get(randnumber), 1, 1, 48,48,null);
           
        
   }


   public void draw(Graphics2D g)
   {
        g.drawImage(foodImage.get(0), 1, 1, 48, 48, null);
        g.drawImage(foodImage.get(1), 1, 50,48, 48, null);
        g.drawImage(foodImage.get(2), 1,100, 48, 48, null);
        g.drawImage(foodImage.get(3), 1, 150, 48, 48, null);
   }



    
}