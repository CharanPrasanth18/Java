import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n, f1=-1, f2=1, f3;
        System.out.print("Number of terms");
        Scanner x = new Scanner(System.in);
        n = x.nextInt();
        System.out.println("FIBONACCI SERIES");
        for (int i = 0; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
        }
    }
}

