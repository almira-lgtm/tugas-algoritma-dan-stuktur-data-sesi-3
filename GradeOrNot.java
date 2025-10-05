import java.util.Scanner;

public class GradeOrNot {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int grade = scanner.nextInt();
        
        if (grade >=70 && grade <=100) {
            System.out.print("You passed");
        }else if (grade >=0 && grade <=70) {
            System.out.print("You failed");
        }else{
            System.out.print("you put invalide number, only accept 0-100");
        }
        scanner.close();
    }
    
}
