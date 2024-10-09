
// Criando um int array
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] valores = {10, 20, 30, 40};
        Arrays.sort(valores); //Aqui ele vai organizar de forma numerica
        System.out.println(Arrays.toString(valores));
        System.out.println(valores.length); // ele vai dar qual o tamanho do array

    }
}
// Criando uma String Array
public class Main {
    public static void main(String[] args) {
        String[] cars = {"bmw","tesla","fox", "fiat",}; //Array em formato de string
        cars[2] = "ferrari"; // Aqui eu troco o nome da posição
        System.out.println(Arrays.toString(cars));
        // fazer a impressão de um item
        System.out.println(cars[2]);
    }

// Arrays Multidimensionais (Organizar em linhas e colunas)
    public class Main {
        public static void main(String[] args) {
            String[][] cars = {{"bmw","tesla"},{"fox", "fiat",}};
            System.out.println(Arrays.toString(cars));
        }

        }

   //Aplicando Costantes
    public class Main {
        public static void main(String[] args) {
            final double taxaJuros = 11.92; //final significa que ela é uma constante
            System.out.println(taxaJuros);


        }
        // Operadores logicos

       public class Main {
           public static void main(String[] args) {
               int a = 4 * 2;
               a++; // Encremento de 1 ou subtração de um
               System.out.println(a);
               // Divisão
               double b = (double) 4 /  (double)3; // fazer um casting (fusao) sempre quando quero transformar double em int
               System.out.println();
           }


          // Convertando String em integers
           public class Main {
               public static void main(String[] args) {
               String valorProduto = "10";
               int valorTotal = Integer.parseInt(valorProduto )+ 2;
                   System.out.println(valorProduto);

               }

     // Classe Math
     public class Main {
         public static void main(String[] args) {
             double value = Math.round(10.2); //Arrendodar valor
             System.out.println(value);
             // Criar numeros rondomincos
             double value2 = Math.round(Math.random() * 100); //Criar numeros rondomicos coloquei 1oo pra me dar numros de 0 a 100 e também coloquei a aplicacao pra arrendodar
             System.out.println(value2);
         }


// Desafio
public class Main {
    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        //Array 1
        System.out.println("Array 1 - Original: " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Array 1 - Ordem: " + Arrays.toString(my_array1));
        // Array 2
        System.out.println("Array 2 - Original: " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Array 2 - Ordem: " + Arrays.toString(my_array2));
    }
}