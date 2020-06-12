/*
A java class to calculate area of simple shapes
*/
public class Area
{
   //calculate the area of square and rectangle
   public void area(double length,double width)
   {
      double result;
      result = length * width;
      System.out.printf("Area is: %f\n",result);
   }

   //calculate the area of the circle
   public void area(double radius)
   {
   final double Pi = 3.14159;//delare a constant pi
   double result;
   result = Pi * radius * radius;
   System.out.printf("Area is: %f\n",result);
   }
}
