/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iscu_u2summative;
import java.util.Scanner;

       
/**
 *
 * @author tyatk9075
 */
public class ISCU_U2SUMMATIVE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner keyedinput = new Scanner(System.in);
          // Variable Declerations
           int choice = 0;
          double angle;
           double radius;
        
            String word;
           String letter;
           String newLetter;
                   
                   //loop program for user conveneance
                   while (choice !=7) {
                    System.out.println  ("Would you like to:\n\n1: Find the area of a Triangle\n2: Find the circumference of a circle\n3: Find the Surface area of a sphere\n4: Find the SIN of a angle\n5: Find the area of a rectangle\n6: Add the sumer of 5 numbers\n7: Exit");
                   
                    choice = keyedinput.nextInt();
                   switch(choice){
                case 1:
                       System.out.println("Please enter the height of your triangle");
                        double height = keyedinput.nextDouble();
                        System.out.println("Please enter the base");
                        double base = keyedinput.nextDouble();
                      areaOfTriangle(height, base);
                    break;
                     case 2:
                    System.out.println("Please enter the radius:");
                    radius = keyedinput.nextDouble();
                    areaOfCircle(radius);
                    break;
                          case 3:
                    
                    System.out.println("Please enter the radius:");
                    radius = keyedinput.nextDouble();
                    surAreaOfSphere(radius);
                    break;
                              
                    case 4:
                        System.out.println("Please enter the angle you woud like to convert");
                        angle = keyedinput.nextDouble();
                        sinOfAnAngle(angle);
                       break;
                    case 5:
                       System.out.println("Enter the length of the rectangle");
                        double length = keyedinput.nextDouble();
                         System.out.println("Enter the width of the rectangle");
                        double width = keyedinput.nextDouble();
                        PeramaterOfARectangle(length, width);
                        break;
                    case 6:
                        double [ ] numbers = new double [5];
                        System.out.println("Enter 5 numbers youd like to add together");
                        numbers[0] = keyedinput.nextDouble();
                        numbers[1] = keyedinput.nextDouble();
                        numbers[2] = keyedinput.nextDouble();
                        numbers[3] = keyedinput.nextDouble();
                        numbers[4] = keyedinput.nextDouble();
                        double sum;
                        sum = numbers [1] + numbers [2]  + numbers [3]  + numbers [0] +numbers[4];
                        System.out.println("The total is" + sum +".");
                                
                            
                       
                       
                        break;
                    case 7:
                    System.out.println("Exiting.");
                    break;
                        
                            
                              }
    }
    }
    /**
     * This method finds and outputs the area of a circle.
     * @param rad 
     */ 
    // Area of a triangle method
                  public static void areaOfTriangle(double height, double base){
                       double area = base * height;
                       area = area/2;
                       System.out.println("The area is" +  area +"Squared units");
                   }
                  // sin of angle method
                  public static void sinOfAnAngle (double angle){ 
                      double sin = (Math.sin(angle));
                      sin = (Math.round(sin));
                      System.out.println("The sin of your angle is: " + sin +".");
                  }
                  // Surface area of a sphere
                      public static void surAreaOfSphere(double rad){
        double area = 4*Math.PI*Math.pow(rad, 2);
        area = Math.round(area*100);
        area/=100;
        System.out.println("The surface area is " + area + " squared.");
    }
                 
                  
               
                  // Area of a circle method
                  public static void areaOfCircle(double radius){
        double area = Math.PI*radius*radius;
        area = (Math.round(area*100));
        area/=100;
        System.out.println("The area is " + area + " square units.");
    }
     /**
     * This method finds and outputs the area of a rectangle.
     * @param length
     * @param width 
     */
                  // Area of a rectangle method
    public static void PeramaterOfARectangle(double length, double width){
        double area = length * width;
       area = length * width;
        area = Math.round(area*100);
        area = 100;
        System.out.println("The area is " + area + "Units.");
    }}
 

