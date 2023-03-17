import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        take("Students License");
        scan.close();
    }

    static void take(String drive) {

        System.out.println("Taking Driving exam...");
        get(drive);

        String feedback = results(drive);

        
        if (feedback.equals("no")) {

           
            fixRecipe(drive);

            
            take(drive);
        } else if (feedback.equals("yes")) {
            end(drive);
        }
    }

    static void get(String drive) {
        System.out.println("Results loading...");
    }

    static String results(String drive) {
        System.out.println("Are you qualified for a " + drive + " (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String drive) {
        System.out.println("You are not qualified to get a license, please retake the course");
        
    }

    static void end(String drive) {
        System.out.println("You have passed the final examination, You can now take your license after passing your required documents." );
    }

}
