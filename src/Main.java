import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input phone number
        System.out.print("Input your phone number : ");
        String phone = input.next();
        // submit phone number to method sum phone number
        sumPhone(phone);
    }

    private static void sumPhone(String ph) {
        if (ph == null) {
            // if there are no phone number exist
            System.out.println("Missing field phone number! (Required)");
        } else {
            int sum = 0, i;
            // get each phone number character
            for (i = 0; i < ph.length(); i++) {
                int each = Integer.parseInt(ph.substring(i, i+1));
                sum = sum + each;
                // check last index number
                if (i == (ph.length()-1)) {
                    System.out.print(each+ " = ");
                } else {
                    System.out.print(each+ " + ");
                }
            }
            // print sum result
            System.out.println(sum);
        }
    }
}