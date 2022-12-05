package Functions;

import java.util.Scanner;

public class Greater {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        greater(a,b);
        sc.close();
    }

    public static void greater(int a, int b){
        if(a>b){
            System.out.println(a+ ":A is greater:");
        }else{
            System.out.println(b+ ":B is greater");
        }

    }
}
