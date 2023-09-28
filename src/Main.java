import java.util.*;
import java.io.*;

public class conversie_b_10 {
    public static void main(String[] args) {
        try (Scanner cin = new Scanner(new File("conversie_b_10.in"));
             PrintWriter out = new PrintWriter(new File("conversie_b_10.out"))) {

            int numar, baza, cnt = 0, rezultat = 0, j = 0;
            int[] n = new int[10];

            numar = cin.nextInt();
            baza = cin.nextInt();

            while (numar != 0) {
                n[++cnt] = numar % 10;
                numar /= 10;
            }

            int[] rezerva = new int[10];

            for (int i = cnt; i >= 1; i--)
                rezerva[++j] = n[i];

            for (int i = 1; i <= j; i++)
                rezultat += rezerva[i] * Math.pow(baza, j - i);

            out.println(rezultat);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
