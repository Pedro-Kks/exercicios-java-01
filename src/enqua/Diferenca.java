package enqua;

import java.util.Scanner;

public class Diferenca {
    public static void diferente(){
        //Nomes das pessoas
        Scanner scan = new Scanner(System.in);
        //Nome da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nomeUm = scan.nextLine();

        //Idade da primeira pessoa
        System.out.print("Digite a idade: ");
        int idadeUm = scan.nextInt();
        scan.nextLine();

        //Nome da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nomeDois = scan.nextLine();

        //Idade da segunda pessoa
        System.out.print("Digite a idade: ");
        int idadeDois = scan.nextInt();

        //Diferença de idade entre as duas
        int diferencaIdade = (idadeUm - idadeDois);
        System.out.printf("A diferença de idade entre %s e %s é de: %d",nomeUm, nomeDois, diferencaIdade);
    }
}