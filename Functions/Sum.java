 package Functions;

import java.util.Scanner;

public class Sum {
    public static int sum(int a, int b, int c ){
        int avg=(a+b+c)/3;
        return avg;
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("average of 3 numbers :   "  + sum(a,b,c));
        sc.close();
    }

    
}