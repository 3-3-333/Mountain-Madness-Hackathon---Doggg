package org.doggg;

public class CategoriesTwo {
    public CategoriesTwo(){
        categoryName = "unnamed";
    }
    private String categoryName;
    public String getCategoryName(){
        System.out.println(categoryName);
        return categoryName;
    }
    public void setCategoryName(String s){
        categoryName = s;
    }
    
}
