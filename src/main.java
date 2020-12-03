import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class main
{
    public static void main (String[]args)
            throws IOException {
        int cons_no,prev_read,cur_read;
        double total=0;
        Scanner a=new Scanner (System.in);
        BufferedReader in=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter consumer no");
        cons_no=a.nextInt();
        System.out.println("Enter consumer name");
        String name=in.readLine();
        System.out.println("Enter prev month reading");
        prev_read=a.nextInt();
        System.out.println("Enter curent month reading");
        cur_read=a.nextInt();
        System.out.println("Enter the type of EB bill");
        String type=in.readLine();
        if(cur_read<=100)
        {
            System.out.println("No amount to be paid");
        }
        else if(cur_read>=100&&cur_read<=500)
        {
            cur_read=cur_read-100;
            total=cur_read*1.5+20;
            System.out.println("Bill to pay"+total);
        }
        else if(cur_read>500&&cur_read<750)
        {
            cur_read=cur_read-100;
            total=cur_read*2.5+30;
            System.out.println("Bill to pay"+total);
        }
        else
        {
            cur_read=cur_read-100;
            total=cur_read*3.5+50;
            System.out.println("Bill to pay"+total);
        }
        System.out.println("Consumer no"+cons_no);
        System.out.println("Consumer name"+name);
        System.out.println("previous month reading"+prev_read);
        System.out.println("Current month reading"+cur_read);
        System.out.println("Type of EB connection"+type);
        System.out.println("TOTAL AMOUNT TO BE PAID"+total);
    }
}

