import java.util.Random;
import java.util.Scanner;


// RANDOM PASSWORD GENERATOR
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number of characters in Your password (max 50): ");
        String lower = "qwertyuioplkjhgfdsazxcvbnm";
        String upper = "QWERTYUIOPLKJHGFDSAZXCVBNM";
        String num = "0123456789";
        String special = "!@#$^&*()_+{}|:<>?=-][';/.,";
        String comb = upper + lower + special + num;
        int len = scanner.nextInt();
        while (len > 50){

            System.out.println("Max number is 50! Try again:");
            len = scanner.nextInt();
        }
        char[] password = new char[len];
        Random r = new Random();
        for (int i = 0; i < len; i++) {
            password[i] = comb.charAt(r.nextInt(comb.length()));
        }

        System.out.println("Generated password is: " + new String(password));


    }
}