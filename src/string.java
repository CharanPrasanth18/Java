import java.util.Scanner;

public class string {
    static String s1,s2;

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        System.out.println("ENTER FIRST STRING  : ");
        s1 = d.nextLine();
        System.out.println("ENTER SECOND STRING : ");
        s2 = d.nextLine();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("STRING MANIPULATION");
        System.out.println(" ");
        System.out.println(" ");
        int len1,len2,a;
        len1=s1.length();
        len2=s2.length();
        System.out.println("LENGTH " + "\n" + "First String : " + len1+ "\n" +"Second String : "+ len2);
        System.out.println(" ");
        System.out.println("COMPARE");
        if(s1.equals(s2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
        System.out.println(" ");
        System.out.println("INDEX");
        System.out.println("Enter a character to find its position in the given strings : ");
        String x = d.next();
        System.out.println("In First String");
        int i=s1.indexOf(x);
        if(i>0){
            System.out.println("Index Position"+ ++i);
        }
        else{
            System.out.println("Index not found");
        }
        System.out.println("In Second String");
        int j=s2.indexOf(x);
        if(j>0){
            System.out.println("Index Position"+ ++i);
        }
        else{
            System.out.println("Index not found");
        }
        System.out.println(" ");
        System.out.println("CONCATENATION");
        String s3=s1.concat(s2);
        System.out.println("Concatenated String : "+ s3);
        System.out.println(" ");
        System.out.println("EXTRACTION");
        System.out.println("Enter position");
        a=d.nextInt();
        char c=s1.charAt(a-1);
        System.out.println("The Character '" +c+"' is at "+a+"th Position");
    }
}
