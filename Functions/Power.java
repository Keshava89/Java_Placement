package Functions;

import java.util.Scanner;

public class Power {
    public static Long power(Long x, Long n){
        long pow = 1L;
        for (int i=0; i<n; i++){
            pow = pow * x;
        }
        return(pow);
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Long  x = sc.nextLong();
        Long  n = sc.nextLong();
        System.out.println(power(x, n));
        sc.close();
        
    }
}
