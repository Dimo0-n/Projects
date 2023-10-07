import java.util.Scanner;

public class sume_cuantice{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        long x;

        long[][] matrice= new long[1001][1001];

        while(t != 0){

            int n = cin.nextInt();
            int k = cin.nextInt();

            int cnt = 0;
            int m = 1;

            for (int i = 1; i <= n; i++){
                x = cin.nextLong();
                matrice[++cnt][m] = x;

                if (cnt == k) {
                    cnt = 0;
                    m++;
                }
            }
            long s = 0;
            for (int i = 1; i <= k; i++) {
                long maxim = matrice[i][1];
                for (int j = 1; j <= m; j++) {
                    if (matrice[i][j] > maxim)
                        maxim = matrice[i][j];
                }
                s += maxim;
            }
            t--;

            System.out.println(s);
        }
    }
}