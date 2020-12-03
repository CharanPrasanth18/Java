import java.util.Scanner;

public class detail {
    public int bp, empnumber;
    public float da, hra, pf, scf, gross, netsalary;
    public String empname, mailid;
    public long mobile;

    public void getdetail() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter name: ");
        empname = x.nextLine();
        System.out.println("Enter mail id: ");
        mailid = x.nextLine();
        System.out.println("Enter employment number: ");
        empnumber = x.nextInt();
        System.out.println("Enter mobile number: ");
        mobile = x.nextLong();
        System.out.println("Enter basic pay: ");
        bp = x.nextInt();
    }
}
    class print extends detail {
        public void calculation() {
            da = (float) ((0.97) * bp);
            hra = (float) ((0.1) * bp);
            pf = (float) ((0.12) * bp);
            scf = (float) ((0.1 / 100) * bp);
            netsalary = (bp + da + hra) - pf - scf;
            gross = (bp + da + hra + pf + scf);
        }
        public void printdetail() {
            System.out.println("Name: " + empname);
            System.out.println("Mailid: " + mailid);
            System.out.println("Employment no. : " + empnumber);
            System.out.println("Mobile : " + mobile);
            System.out.println();
            System.out.println("P A Y S L I P");
            System.out.println("BP : " + bp);
            System.out.println("DA : " + da);
            System.out.println("HRA : " + hra);
            System.out.println("PF : " + pf);
            System.out.println("Staff Club Fund : " + scf);
            System.out.println("GROSS SALARY : " + gross);
            System.out.println("NET SALARY : " + netsalary);
        }
    }
    class employees{
        public static void main(String[] args){
            print emp=new print();
            emp.getdetail();
            emp.calculation();
            emp.printdetail();
        }
    }

