package enqua;

import java.util.Scanner;

public class Tabuada {
    public static void Tabua(){
        //Pegando o número
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número para ser multiplicado: ");
        int numero = scan.nextInt();

        //Tabuada
        for (int i = 0; i < 11 ; i++) {
            System.out.printf("Tabuada: A multiplicação de: %d x %d = %d\n", numero, i, numero * i);
        }
    }
}
