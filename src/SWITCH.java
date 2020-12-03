import java.util.Scanner;

public class SWITCH {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter any number from 1-5");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");break;
            case 2:
                System.out.println("Two");break;
            case 3:
                System.out.println("Three");break;
            case 4:
                System.out.println("Four");break;
            case 5:
                System.out.println("Five");break;
            default:
                System.out.println("Invalid Number");
        }
    }
}
