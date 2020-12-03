import java.io.IOException;

public class transpose {
    public static void main(String args[]){
        int[][] a = {{1, 2, 3}, {4, 5, 6},{7,8,9}};
        int[][] t = new int[3][3];
        int i, j;
        //transposing
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                t[i][j] = a[j][i];
            }
        }
        //before transposing
        System.out.println("Before Transposing");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //after transposing
        System.out.println("After Transposing");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }}
