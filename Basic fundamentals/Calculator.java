package Day2;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("A=");
        int a = sc.nextInt();
        System.out.print("B=");
        int b = sc.nextInt();
        System.out.print("cal=");
        int cal = sc.nextInt();

        switch(cal){
            case 1:
                int add = a + b;
                System.out.println(add);
                break;
            case 2:
                int sub = a - b;
                System.out.println(sub);
                break;
            case 3:
                int mul = a * b;
                System.out.println(mul);
                break;
            case 4:
                int div = a / b;
                System.out.println(div);
                break;
            case 5:
                int mod = a % b;
                System.out.println(mod);
                break;
            default : System.out.println("invalid number");
            sc.close();
                  
        }
    }
}
