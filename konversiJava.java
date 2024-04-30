import java.util.Scanner;

public class konversiJava {
    public static void main(String[] args) {
        int i, j;
        char[][] a = new char[2][4];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Input array ke [" + (i + 1) + "][" + (j + 1) + "]");
                Scanner sc = new Scanner(System.in);
                char c = sc.next().charAt(0);

                a[i][j] = c;
            }
        }
        System.out.println("--------------------------------------------");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}