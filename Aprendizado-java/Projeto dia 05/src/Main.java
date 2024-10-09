public class Main {
    public static void main(String[] args) {
productList("laranja", 12);
productList("banana", 20);

    }
    public static void productList(String productName, Integer productValue ){
        System.out.println(productName + "-" + productValue);

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Listar os numeros pares de 0 a 20");
        evenNumbers(20);
    }%
    public static void evenNumbers(int numbers) {
        for (int i = 6; i <= numbers; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}
