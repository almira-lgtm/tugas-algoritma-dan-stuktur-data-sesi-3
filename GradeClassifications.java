import java.util.Scanner;

public class GradeClassifications {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        if (score >=80 && score <=100) {
            System.out.print("A");
        }else if (score >=70 && score <=80) {
            System.out.print("B");
        }else if (score >=60 && score <=70 ) {
            System.out.print("C");
        }else if (score >=50 && score <=60 ) {
            System.out.print("D");
        }else if (score ==0 && score <=50 ) {
            System.out.print("F");
        }
        scanner.close();
    }
    
}
    