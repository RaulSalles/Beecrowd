import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Problema_1002 {

    public static void main(String[] args) throws IOException {

        // Defino o locale para US
        Locale.setDefault(Locale.US);

        // Declaro as variáveis necessárias
        double pi = 3.14159;
        double raio;
        double area;

        // Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        raio = scanner.nextDouble();

        area = pi * raio * raio;

        // Print
        System.out.printf("A=%.4f\n", area);

    }
}
