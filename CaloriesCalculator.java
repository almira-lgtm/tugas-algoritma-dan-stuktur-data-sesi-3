import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n-----CALORIES CALCULATOR-----");
        System.out.print("\nEnter Running Duration (minutes): ");
        int runningDurations = scanner.nextInt();
        double runningCalories = (runningDurations / 5.0) * 60;

        System.out.print("\nEnter PushUp Duration (minutes): ");
        int pushupDurations = scanner.nextInt();
        double pushupCalories = (pushupDurations / 30.0) * 200;
        
        System.out.print("\nEnter Plank Duration (minutes): ");
        int plankDurations = scanner.nextInt();
        double plankCalories = (plankDurations * 5);

        double totalCalories = runningCalories + pushupCalories + plankCalories;

        System.out.println("\nTotal :");
        System.out.println("\nCalories Burned From Running : "+ runningCalories);
        System.out.println("\nCalories Burned From Push-Up : "+ pushupCalories);
        System.out.println("\nCalories Burned From Plank : "+ plankCalories);
        System.out.println("\nTotal Calories Burned : "+ totalCalories);

        scanner.close();
        }
    }
    

