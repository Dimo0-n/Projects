import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        //Numar descompus în sumă cu număr minim de termeni ai şirului lui Fibonacci

        int suma = cin.nextInt();

        int f1 = 0, f2 = 1, f3 = 0, cnt = 0, s = 0, k = 0;

        int[] fibo = new int[1000];
        int[] termeni = new int[1000];

        fibo[++cnt] = f1;
        fibo[++cnt] = f2;

        while(f3 <= suma){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            fibo[++cnt] = f3;
        }

        for (int i = cnt - 1; i >= 1; i--){
            s += fibo[i];
            termeni[++k] = fibo[i];
            if(s > suma) {
                s -= fibo[i];
                termeni[k] = 0;
            }
        }

        for (int i = 1; i <= k; i++) {
            if (termeni[i] != 0)
                System.out.print(termeni[i] + " ");
        }

    }
}