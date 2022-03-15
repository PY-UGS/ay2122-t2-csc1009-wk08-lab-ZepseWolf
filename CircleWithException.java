package week8;

import java.util.Scanner;

public class CircleWithException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle:");
        double rad = sc.nextDouble();
        try{
            if(rad< 0){
                throw new IllegalArgumentException(Double.toString(rad) + " is not a positive number");
            }else{
                Circle c = new Circle(rad);
                if( c.getArea() > 1000 ){
                    throw new Exception("Area should not be bigger then 1000 .");
                }else{
                    System.out.println("Area is : " + c.getArea());
                }
            }

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
