import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        
        if (score >0) {
            System.out.print("positif");
        }else if (score <0) {
            System.out.print("negatif");
        }else if (score ==0 ) {
            System.out.print("nol");
        }
        scanner.close();
    }
    
}
    

