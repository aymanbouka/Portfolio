package pkg1213debugginglab;
/**
 * ITSC 1213 @author Nanajjar
 * The Circle class represents a circle with a radius and color.
 */
/**
 * Circle Method created a private double variable called radius and a private String called color
 * @author Nanajjar
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;

   // The default constructor with no argument.
   // It sets the radius and color to their default value.
   /**
    * Circle method sets radius to 1.0 and color to red
    */
   public Circle() {
      radius = 1.0;
      color = "red";
   }

   // 2nd constructor with given radius and color
   /**
    * circle method with parameters double r and String clr
    * @param r radius is set to r
    * @param clr  color is set to clr
    */
   public Circle(double r, String clr) {
      radius = r;//r is radius
      color = clr;// clr is color
   }

   // A public method for retrieving the radius
   /**
    * getRadius Method
    * @return  returns radius
    */
   public double getRadius() {
     return radius;
   }

   // A public method for retrieving the area of circle
   /**
    * area is set to calculateArea method
    * @return returns area
    */
   public double getArea() {
     double area = calculateArea();
      return area;
   }

   // A private method for computing the area of circle
   /**
    * calculateArea Method
    * @return returns radius times radius times PI
    */
   private double calculateArea(){
     return radius*radius*Math.PI;
   }
}
