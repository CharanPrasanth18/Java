import java.util.Scanner;

class biggest {
 public static void main(String args[]) {
     int a, b, c;
     System.out.println("Enter a number");
     Scanner x = new Scanner(System.in);
     a = x.nextInt();
     System.out.println("Enter another number");
     Scanner y = new Scanner(System.in);
     b = y.nextInt();
     System.out.println("Enter one more number");
     Scanner z = new Scanner(System.in);
     c = z.nextInt();

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
