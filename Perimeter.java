/*
A java class to calculate perimeters of simple shapes
*/
public class Perimeter
{
   public void perimeter(double length,double width)
   {
      double result;
      result = 2 * (length + width);
      System.out.printf("Perimeter is: %f\n",result);
   }
   
   public void perimeter(double radius)
   {
     final double Pi = 3.14159;
     double result;
     result = 2 * radius * Pi;
     System.out.printf("Perimeter is: %f\n",result);
   }
}
