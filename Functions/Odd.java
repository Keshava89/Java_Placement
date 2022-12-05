package Functions;

import java.util.Scanner;

public class Odd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        printSumOfAddNum(n);
        sc.close();
    }
    public static void printSumOfAddNum(int num) {
        int sum = 0;
        for(int i=0; i<=num; i++){
            if(i%2!=0){
                System.out.print(i+ "\n");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("sum is:  "+sum);
        
        
    }
}
