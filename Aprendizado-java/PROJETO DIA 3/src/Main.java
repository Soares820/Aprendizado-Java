import java.text.NumberFormat;
import java.util.Scanner;

// Formatando Numeros em Java
public class Main {
    public static void main(String[] args) {
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(120.80);

        System.out.println(productValue);

//Operador de Comparação

        int a = 4;
        int b = 5;
        System.out.println(a != b); // ! quer dizer que é é diferente

// Operador Logico AND

        // priceProduct = $20
        // Comprar somente entre $10 e $15
        int priceProduct = 20;
        boolean buy = priceProduct >=10 && priceProduct <= 15; // && (and) || (or)
        System.out.println(buy);

// Operador Logico OR


      boolean temEmprego = true;
      boolean temEmpresa =true;
      boolean tem50k = true;
      boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k;
        System.out.println(podeFinanciar);

// IF e ELSE if = Se, else =Senao  else if é "senao se "
        int valorCarro = 100_000;
        if (valorCarro > 100_000)
        System.out.println("nao comprar. Acima da tabela");
        else if (valorCarro >= 90_000 && valorCarro <=100_000)
            System.out.println("comprar o carro");
        else
            System.out.println("nao comprar. valor abaixo da tabela");
        // sempre começar com if e sempre terminar o else

// Operador ternario
        int ingresso = 800;
        String terAcesso = ingresso >= 500 ? "VIP" : "Pista";
       // ? interregocaçao é um operador ternario
        System.out.println(terAcesso);

   // desafio
        // O Input
        Scanner lerNumeros = new Scanner(System.in);
        System.out.println("digite um numero");
        int num = lerNumeros.nextInt();
        // O Codigo
        if(num<9 && num>=1) {
            System.out.println("Este numero tem 1 digito");
        }
        else if (num<100 && num>10) {
            System.out.println("Este Numero tem 2 digitos");

        }
        else if (num<1000 && num>100) {
            System.out.println("Este Numero tem 3 digitos");
        }

        else if (num<10000 && num>1000) {
            System.out.println("Este Numero tem 4 digitos");
        }
        else if (num<100000 && num>10000) {
            System.out.println("Este Numero tem 5 digitos");
        }
    }
    }
