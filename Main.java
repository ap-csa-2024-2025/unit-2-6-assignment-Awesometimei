import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    //Problem 1
    double pi = 3.14159265359;
    System.out.println("Enter the radius of the circle");
    double rad = sc.nextDouble();
    Circle circ1 = new Circle(rad);
    double circumference = 2*rad*pi;
    double area = pi*rad*rad;
    System.out.println(circ1.toString() + " has a circumference of " + circumference + " and an area of " + area + ".");

    //Problem 2
    System.out.println("Enter a number of sides: ");
    int sideNum = sc.nextInt();
    System.out.println("Enter a side length: ");
    double sideLen = sc.nextDouble();
    RegularPolygon regPoly = new RegularPolygon(sideNum, sideLen);
    System.out.println("Area with " + regPoly.getNumSides() + " sides is " + regPoly.getArea());
    regPoly.addSides(2);
    System.out.println("Incrementing the number of sides by two");3
    System.out.println("Area with " + regPoly.getNumSides()  + " sides is " + regPoly.getArea());
  }
}
