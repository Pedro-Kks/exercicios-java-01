package enqua;

import java.util.Scanner;

public class AreaRetangulo {
    public static void retangulo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a base do retângulo: ");
        double base = scan.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scan.nextDouble();

        //calculando a área
        double area = (base * altura);
        System.out.printf("A área do retângulo é: %.2f.\n", area);
    }
}