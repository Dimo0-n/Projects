import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int numar, baza, cnt = 0, rezultat = 0, j = 0;

        int[] n = new int[10];

        numar = cin.nextInt();
        baza = cin.nextInt();

        while(numar != 0){
            n[++cnt] = numar % 10;
            numar /= 10;
        }

        //Baze de numeratie

        int[] rezerva = new int[10];

        for (int i = cnt; i >= 1; i--)
            rezerva[++j] = n[i];

        for (int i = 1; i <= j; i++)
            rezultat += rezerva[i] * Math.pow(baza, j - i);

        System.out.println(rezultat);

    }
}
