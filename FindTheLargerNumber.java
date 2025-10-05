import java.util.Scanner;

public class FindTheLargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number a : ");
        int a = scanner.nextInt();
        System.out.print("Number b : ");
        int b = scanner.nextInt();
        System.out.print("Number c : ");
        int c = scanner.nextInt();
        int largestValue;
        String largestVariable;
        
        if (a >= b && a >= c){
            largestValue = a;
            largestVariable = "a";
        }else if (b >= a && b >= c){
            largestValue = b;
            largestVariable = "b";
        }else {
            largestValue = c;
            largestVariable = "c";
        }
        System.out.println("\nvalues a = " + a);
        System.out.println("values b = " + b);
        System.out.println("values c = " + c);
        System.out.printf("The largest number is %s = %d\n", largestVariable, largestValue);


        scanner.close();
    }
}

