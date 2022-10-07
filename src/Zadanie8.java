import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj swoje imie");
        String name = klawiatura.nextLine();
        System.out.println("podaj swoj wiek");
        int age = klawiatura.nextInt();
        System.out.println("podaj swoj oczekiwany roczny dochod");
        double annualPay = klawiatura.nextDouble();
        System.out.println("Nazywam sie " + name + " mam " + age + " lat i chce zarabiac " + annualPay + " zlotych rocznie");

    }
}
