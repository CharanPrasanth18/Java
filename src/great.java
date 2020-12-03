import java.util.Scanner;

public class great {
    public static void main(String args[]) {
        int a, b, c;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a number");
        a = x.nextInt();
        System.out.println("Enter another number");
        b = x.nextInt();
        System.out.println("Enter one more number");
        c = x.nextInt();

        if (a>b && a>c) {
            System.out.print(a+" is the  biggest number");
        }
        else if (b>c) {
            System.out.print(b+" is the  biggest number");
        }
        else {
            System.out.print(c+" is the  biggest number");
        }
    }
}


