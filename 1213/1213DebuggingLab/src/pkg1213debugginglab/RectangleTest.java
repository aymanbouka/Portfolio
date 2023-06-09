/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1213debugginglab;

import java.awt.Rectangle;

/**
 *
 * @author aymanboukharraz
 */
public class RectangleTest 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        Rectangle box2 = new Rectangle(100, 50);
       
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
       
        
        box1.setLocation(20, 20);
        box2.setSize(50, 30);
        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
       
        Rectangle box3 = box1.intersection(box2);
        double area = box3.getWidth() * box3.getHeight();
        
        System.out.println("Area of intersecting rectangle:" + area);
        System.out.println(box3);
        

       
       
    } 
    
//    public void move(int x, int y)
//    {
//        this.x = x;
//    }
//    
}
