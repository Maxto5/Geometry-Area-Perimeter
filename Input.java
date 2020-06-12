
/* simple java program to ask user for shape and dimensions thereof
The inputs are then used to invoke an object that calculates area
and perimeter

*/

import java.util.Scanner;

public class Input

{
    public static void main(String args [])
   {
       //Brief User Manual 
      System.out.println("USER MANUAL");
      System.out.println("This is a program to calculate area and perimeter of simple geometric figures");
      System.out.println("Program works for shapes circle,square and rectangele");
      System.out.println("1:specify te shape\n2.provide dimensions based on shape");

     //variables to be decide shape to be used
       String shape;
       double width;
       double length;
       double radius;
      //system calls for area and perimeter calculation

      Area calc = new Area();
      Perimeter cal = new Perimeter();

      //collect user input using a Scanner class object
      try
      {
         Scanner in = new Scanner(System.in);

         System.out.print("Enter Shape\t");//prompt user to enter shape
         shape = in.nextLine();
          shape = shape.toLowerCase();
         //prompt for dimensions
               //Quadrilaterals (square and rectangle)
         if (shape.endsWith("are") || shape.endsWith("gle"))
          {
              System.out.print("Enter length\t");
              length = in.nextDouble();

              System.out.print("Enter width\t");
              width = in.nextDouble();

              calc.area(length,width);
              cal.perimeter(length,width);

          }
               //For the circle
         else if (shape.startsWith("cir"))
          {
             System.out.print("Enter radius\t");
             radius = in.nextDouble();

             calc.area(radius);
             cal.perimeter(radius);
         }
         else
         {
         System.out.println("Shapes to choose from are circle,square and rectangle");
         }
  }//end of try block
     catch(Exception exception)
      {
        System.out.print("For Input Mismatch Exception:\n Recommended read User Manual on allowed datatypes");
    }//catch all  errors
  }//end of the main method
}//end of the class
