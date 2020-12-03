import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        int i,j,temp;
        System.out.println("Enter no. of terms: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] num = new int[count];
        System.out.println("Enter elements: ");
        for(i=0;i<count;i++) num[i] = scan.nextInt();
        scan.close();
        for(i=0;i<count;i++) {
            for(j=i+1;j<count;j++){
                if(num[i]>num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
             System.out.println("Sorted order: ");
        for(i=0;i<count-1;i++){
            System.out.print(num[i]+",");
        }
        System.out.print(num[count-1]);
    }
}
