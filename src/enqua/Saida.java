package enqua;

import java.util.Scanner;

public class Saida {
    public static void Enquanto(){
        Scanner sc = new Scanner(System.in);
        String nome = " ";

        //Enquanto
        while(!nome.equalsIgnoreCase("exit")) {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();

            if(nome.equalsIgnoreCase("exit") ){
                System.out.printf("Você escreveu %s\n", nome);
            }
        }
        System.out.println("PROGRAMA ENCERRADO!");
    }
}
