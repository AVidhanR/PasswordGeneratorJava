import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length of the password that to be generated : ");
        System.out.println(PasswordGeneratorMethod(sc.nextInt()));
        sc.close();
    }

    /*
     * This our Password generating method
     * We will be using static here, so that we need not to
     * make any object for it
     */
    static char[] PasswordGeneratorMethod(int LengthOfPWD) {
        System.out.println("<--- Generating password --->");
        System.out.print("Your new password is : ");
        /*
         * A Strong password contains Capital Letters, Small Letters, Numbers,
         * and Special Symbols
         */
        String CapitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String SmallChars = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "0123456789";
        String SpecialSymbols = "!@#$%^&*_=+-/.?<>)(";

        String Values = CapitalChars + SmallChars + Numbers + SpecialSymbols;
        // Using Random method
        Random RandomMethod = new Random();
        char[] Password = new char[LengthOfPWD];

        for (int i = 0; i < LengthOfPWD; i++) {
            Password[i] = Values.charAt(RandomMethod.nextInt(Values.length()));
        }
        return Password;
    }
}
