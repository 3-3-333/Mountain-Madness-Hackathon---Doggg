package org.doggg;
// import org.doggg.Categories;

import java.io.IOException;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        System.out.println("test test");
        // Categories myCategory = new Categories();
        // myCategory.setCategoryName("something");
        
        CategoriesTwo myCategory = new CategoriesTwo();
        myCategory.setCategoryName("hello");
        myCategory.getCategoryName();

        int colm = 16;
        int rows = 12;
        int pacSize = 48; //industry standard 48x48

        JFrame frame = new JFrame("dogggg");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        GameFrame gameFrame = new GameFrame(colm, rows, pacSize);
        frame.add(gameFrame);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        gameFrame.beginThread();

    }
}
