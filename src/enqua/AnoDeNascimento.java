package enqua;

import java.util.Scanner;

public class AnoDeNascimento{
    public static void data(){
        //Nome da pessoa
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        //Ano de nascimento
        String nome = scan.nextLine();
        System.out.print("Digite sua data de nascimento: ");
        int anos = scan.nextInt();

        //Calculando idade
        int anoAtual = 2025;
        int idadeAtual = (anoAtual- anos);
        System.out.printf("Olá, %s! Sua idade atual é %d anos.\n", nome, idadeAtual);
    }
}