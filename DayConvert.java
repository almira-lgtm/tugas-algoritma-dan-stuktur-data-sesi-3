import java.util.Scanner;

public class DayConvert {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1-7: ");
        int number = scanner.nextInt();
        if (number == 1)
            System.out.print("Monday");
        else if (number == 2)
            System.out.print("Tuesdey");
        else if (number == 3)
            System.out.print("Wednesday");
        else if (number == 4)
            System.out.print("Thursday");
        else if (number == 5)
            System.out.print("Friday");
        else if (number == 6)
            System.out.print("Saturday");
        else if (number == 7)
            System.out.print("Sunday");
        scanner.close();
    }
}
