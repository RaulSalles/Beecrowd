import java.util.Scanner;

public class Problema_1253 {

    public static String cifra_cesar(int desloc, String criptografada){

        // String a ser formada
        String descriptografada = "";

        // Deixo tudo em uppercase
        criptografada = criptografada.toUpperCase();

        // Número inteiro equivalente
        int numero_eq = 0;


        for(int c = 0; c < criptografada.length(); c++){

            char letra = criptografada.charAt(c);

            if(letra >= 'A' && letra <= 'Z') {
                // Converte para 0–25, aplica deslocamento e volta para A–Z
                char eq = (char) ('A' + (letra - 'A' - desloc + 26) % 26);
                descriptografada += eq;
            } else {
                // Mantém espaços e símbolos
                descriptografada += letra;
            }
        }

        return descriptografada;

    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String  descriptografada = "";

        int casos = 0;

        // Recebo o número de casos
        casos = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer

        for(int i = 0; i < casos; i++){

            // Obtenho a palavra
            String criptografada = scanner.nextLine();

            // Obtenho o deslocamento
            int desloc = scanner.nextInt();

            // Executo a cifra de cesar
            descriptografada = cifra_cesar(desloc, criptografada);

            scanner.nextLine(); // Limpa o buffer

            System.out.println(descriptografada);

        }



    }
}
