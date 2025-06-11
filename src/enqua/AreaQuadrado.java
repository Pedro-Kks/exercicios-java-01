package enqua;

import java.util.Scanner;

public class AreaQuadrado {
    public static void areaq(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o tamanho do lado do quadrado: ");
        int lado = scan.nextInt();
        //calculando area
        int area = (lado * lado);
        System.out.printf("A área do quadrado é: %d.\n", area);
    }
}
