package org.doggg;

import java.util.ArrayList;
import java.util.Random;

public class FoodSelector{
   private String name;
   private ArrayList<FoodNode> foodlist;
   private Random r=new Random();
   public void choosefood(){
        System.out.println("Your food is : ");
        int length=foodlist.size();
        int randnumber=r.nextInt(length)+1;
        String food = foodlist.get(randnumber).getName();
        System.out.println(food);
   }
}