import java.util.Scanner;

public class Problema_1168 {

    public static int leds(int numero){
        switch (numero) {

            case 1:
                return 2;

            case 2, 3, 5:
                return 5;

            case 4:
                return 4;

            case 6, 0, 9:
                return 6;

            case 7:
                return 3;

            case 8:
                return 7;

        }
        return 0;
    }

    public static int somar(int num_1, int num_2){
        return num_1 + num_2;
    }


    public static void main(String[] args){

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Obter o numero de casos
        int casos = scanner.nextInt();

        // Declaro o vetor
        int v[] = new int[casos];

        // Limpa o buffer
        scanner.nextLine();

        for(int j = 0; j < casos; j++) {

            String numero;
            int soma = 0;
            int n = 0;

            numero = scanner.nextLine();

            // Vejo qual caracter está na posição da string e faço a soma dos leds
            for (int i = 0; i < numero.length(); i++) {
                n = Integer.parseInt(String.valueOf(numero.charAt(i)));
                soma = somar(leds(n), soma);
            }

            v[j] = soma;

        }

        for(int j = 0; j < casos; j++) {
            System.out.println(v[j] + " leds");
        }

        scanner.close();
    }

}
