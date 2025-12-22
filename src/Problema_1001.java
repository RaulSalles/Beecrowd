import java.io.IOException;
import java.util.Scanner;

public class Problema_1001 {

    public static void main(String[] args) throws IOException {

        // Declaro as variáveis necessárias
        int A = 0;
        int B = 0;
        int X = 0;

        // Declaro meu scanner
        Scanner scanner = new Scanner(System.in);

        // Lê as entradas do usuário
        A = scanner.nextInt();
        B = scanner.nextInt();
        scanner.close();

        // Executa a soma
        X = A + B;

        // Mostro o resultado final
        System.out.println("X = " + X);


    }
}
