import java.util.Scanner;

class View
{
    public View() {
    }
    View(int[][] B, int m, int n)
    {}
public void spiralView(int A[][], int m, int n)
    {
        int i, k = 0, l = 0;

        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                System.out.print(A[k][i] + " ");
            }
            k++;
            for (i = k; i < m; ++i) {
                System.out.print(A[i][n - 1] + " ");
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(A[m - 1][i] + " ");
                }
                m--;
            }
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(A[i][l] + " ");
                }
                l++;
            }
        }
    }
}
class Matrix
{

    public static void main(String[] args)
    {
        int m,n,i,j,p;
        int x;
        View v = new View();
        Scanner s = new Scanner(System.in);

        System.out.println("enter no. of rows of matrix");
        m = s.nextInt();
        System.out.println("enter no. of  columns of matrix");
        n = s.nextInt();

        int A[][]=new int[m][n];

        System.out.println("enter elements of matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j] = s.nextInt();
            }
        }
        do
        {
            v.spiralView(A,m,n);
            System.out.println("Press 1 to continue");
            x = s.nextInt();
        }while (x==1);
    }
}