package day1;
import java.util.Scanner;

public class Circle {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        double r =sc.nextDouble();
        double area = 3.142 * r * r;
        System.out.println(area);
        sc.close();

    }
    
}
