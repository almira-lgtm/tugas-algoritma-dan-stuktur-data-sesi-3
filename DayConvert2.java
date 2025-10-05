import java.util.Scanner;

public class DayConvert2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 1-7: ");
        int number = scanner.nextInt();
        String day = "";
        switch(number) {
            case 1 :
                day = "Monday";
            break;
            case 2 :
                day = "Tuesday";
            break;
            case 3 :
                day = "Wednesday";
            break;
            case 4 :
                day = "Thursday";
            break;
            case 5 :
                day = "Friday";
            break;
            case 6 :
                day = "Saturday";
            break;
            case 7 :
                day = "Sunday";
            break;
        }
        System.out.print(day);
        scanner.close();
        
    }
}
