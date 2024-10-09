import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Utilizando Switch (Ela cria os casos dentro do Switch)
public class Main {
    public static void main(String[] args) {
     // Coletar o nome do produto

        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
     String nomeProduto = s.next().toLowerCase();
    //  Retornar o valor do produto

        switch (nomeProduto) {
            case "banana":
                System.out.println("R$9,50");
                break;
            case "manga":
                System.out.println("R$12,80");
                break;
            case "abacate":
                System.out.println("R$22,80");
        }
// FOR LOOP (Criado pra gerar dentro de uma sequencia

        for (int i= 0; i <= 10; i++)
            System.out.println(i + " ");

// For Loops com Arrays
        String[] cars = {"bmw","fiat","tesla"};

        for(int i = 0; i < cars.length; i++)
            System.out.println(cars[i]);

// Nested Loops (for loop dentro do outro) criando matrizes dentro de um for loop
    for (int i = 0; i < 2; i++)
       for (int j = 0; j < 3; j++)
           System.out.println(i + " " + j);

// While Loops (defini a variavel antes e depois entra no while)
        int i = 0;
        while (i < 5) {
            System.out.println(i + " - HI");
            i++;
        }


    }
}


