import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int contor = 0;

        int[] vec1 = new int[1001];

        System.out.println();

        for (int i = 1; i <= n; i++){
            vec1[i] = cin.nextInt();
        }
g
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                for (int l = 1; l <= n; l++) {
                    if ((vec1[i] % 5 == 0 || vec1[j] % 5 == 0 || vec1[l] % 5 == 0) && l > j && j > i)
                        contor++;
                }

            System.out.print(" " + contor);

    }
}
