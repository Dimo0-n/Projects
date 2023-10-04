import java.util.Scanner;

public class BisectionMethod {
    public static double funct(double x) {
        return Math.sqrt(x + 1) - 1;
    }

    public static double bisection(double a, double b, double epsilon) {
        int cnt = 0;
        double fa = funct(a);
        double fb = funct(b);

        if (fa * fb > 0 || cnt > 100) {
            System.out.println("Da un interval corect! ))");
            System.exit(0);
        }

        double c;
        double fc;

        do {
            c = (a + b) / 2;
            fc = funct(c);

            if (fc == 0.0 || (b - a) < epsilon) {
                return c;
            }

            if (fa * fc < 0.0) {
                b = c;
            } else {
                a = c;
            }

            cnt++;
        } while (cnt <= 100);

        System.out.println("Nu s-a găsit o rădăcină în " + cnt + " iterații.");
        return Double.NaN;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, epsilon;

        System.out.print("Introduceti a: ");
        a = scanner.nextDouble();

        System.out.print("Introduceti b: ");
        b = scanner.nextDouble();

        System.out.print("Introduceti epsilon: ");
        epsilon = scanner.nextDouble();

        if (a > b)
            System.out.println("Intervalul nu este corect!");
        else {
            double result = bisection(a, b, epsilon);
            System.out.println("Rădăcina aproximativă: " + result);
        }
    }
}
