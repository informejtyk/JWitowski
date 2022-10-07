import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj liczbe przejechanych kilometrow");
        double kilometry = klawiatura.nextDouble();

        System.out.println("podal liczbe zuzytych litrow paliwa");
        double litry = klawiatura.nextDouble();

        double kiloNaLitry = kilometry / litry;
        System.out.println("na litrze przejechano " + kiloNaLitry + " kilometrow100");
    }
}
