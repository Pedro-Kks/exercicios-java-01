package enqua;

import java.util.Scanner;

public class AlturaPeso {
    public static void Pesoalto(){
        //Pegando altura e peso da pessoa
        Scanner sc = new Scanner(System.in);

        //Altura da pessoa
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        //Peso da pessoa
        System.out.print("Digite sua peso: ");
        double peso = sc.nextDouble();

        var imc = peso/(altura * altura); //calculo do IMC

        //Condições
        if(imc <= 18.5 ){
            System.out.printf("Seu IMC é de: %.2f. E portanto está Abaixo do peso.\n", imc);
        }
        else if (imc >= 18.6 && imc <= 24.9){
            System.out.printf("Seu IMC é de: %.2f. E portanto está no Peso ideal.\n", imc);
        }
        else if (imc >= 25.0 && imc <= 29.9){
            System.out.printf("Seu IMC é de: %.2f. E portanto está Levemente acima do peso.\n", imc);
        }
        else if (imc >= 30.0 && imc <= 39.9){
            System.out.printf("Seu IMC é de: %.2f. E portanto está na Obesidade Grau entre I e II.\n", imc);
        }
        else if (imc >= 40.0){
            System.out.printf("Seu IMC é de: %.2f. E portanto está na Obesidade III (Mórbida).\n", imc);
        }
    }
}
