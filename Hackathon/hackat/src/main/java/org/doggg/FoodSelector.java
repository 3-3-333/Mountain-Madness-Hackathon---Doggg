package org.doggg;

public class FoodSelector{
   private String name;
   private ArrayList<FoodNode> foodlist;

   public void choosefood(){
        System.out.printIn("Your food is : ");
        int length=foodlist.size();
        int randnumber=rand.NextInt(length)+1;
        String food = foodlist[randnumber].getName();
        System.out.printIn(food);
   }

    
}