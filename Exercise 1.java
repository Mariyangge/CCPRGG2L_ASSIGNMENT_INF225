import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class exercise1 {
    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        Pattern pattern = null;
        Matcher matcher = null;
        boolean isValid = false;

        System.out.println("1. Website Address Validation");
        String website = scan.nextLine();

        pattern = Pattern.compile("www\\.[a-zA-z 0-9]+\\.com");
        matcher = pattern.matcher(website);
        isValid = matcher.matches();

        if (isValid) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }

        System.out.println("2. 24 hour time (HH:MM:SS) Validation");

        String time = scan.nextLine();


        pattern = Pattern.compile("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");

        matcher = pattern.matcher(time);

        isValid = matcher.matches();

        if (isValid) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }

        System.out.println("3. Finding specific files.");

        String myfiles = "myfile.txt, thesis.xlsx, this is not a file, picture.jpg, selfie.png";
        
    
        pattern = Pattern.compile("(myfile.txt)|(thesis.xlsx)|(this is not a file)|(picture.jpg)|(selfie.png)");
        matcher = pattern.matcher(myfiles);

        boolean found = false;

        while (matcher.find()) {
            System.out.println("I found the text " + matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println("No files found.");

        System.out.println("4. Password Validation");

        String password = scan.nextLine();

        pattern = Pattern.compile("^([^ELIZR])(?=.*[A-Za-z])(?=.*\\d).{10,}$");
        matcher = pattern.matcher(password);

        isValid = matcher.matches();

        if (isValid) {
            System.out.println("Password is valid! ");
        } else {
            System.out.println("Password is invalid! ");
        }

        System.out.println("5. Replacing Text");
        String phonenumbers = "+6391512345456, 0917123561234, +639190011223, 0915456213461";

    
        phonenumbers = phonenumbers.replaceAll("\\+?\\b\\d{1}3?", "+63");

        System.out.println(phonenumbers);

        scan.close();
    }
    
    }

}
