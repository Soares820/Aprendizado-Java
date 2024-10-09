public class Clients {

    String firstName;
    int age;
    int balance;
    Clients() {
       balance = 10;


    }

    void newAccount () {
        System.out.println(firstName + "Account Created!");
        System.out.println("The new balance is $" + balance);


    }

}
