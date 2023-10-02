import java.util.*;

public class Exper {
    static boolean este_prim(int x){

        boolean ok = true;

        for (int i = 2; i*i <= x; i++)
            if (x % i == 0) {
                ok = false;
                break;
            }
        return ok;
    }

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        int numere_prime = 0, y, cnt = 0;

        for (int i = 1; i <= n; i++) {
            y = cin.nextInt();
            if (este_prim(y)) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
