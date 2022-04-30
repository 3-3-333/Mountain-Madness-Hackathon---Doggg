package org.doggg;

public class Categories {
    public Categories(){
        this.categoryName="default";
    }
    private String categoryName;
    public void setCategoryName (String data){
        this.categoryName = data;
    }
    public void print(String s){}
    public void getCategory (){
        System.out.println("contructor");
    }
}
