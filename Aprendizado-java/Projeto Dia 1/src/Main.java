//Package jAVA.util

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        System.out.print("Digite o primeiro numero1:");
        double numero1 = calculadora.nextDouble();
        System.out.print("Digite o segundo numero2:");
        double numero2 = calculadora.nextDouble();
        System.out.print("Resultado:");
        System.out.print( numero1 + numero2 );
    }
}
