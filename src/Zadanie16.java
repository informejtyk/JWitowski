import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj cene posilku");
        double cena = klawiatura.nextDouble();

        double podatek = 0.0675;

        double cenaPodatek = cena * podatek;

        double cenaZPodatkiem = cena + cenaPodatek;

        double napiwek = 0.20;

        double cenaNapiwek = cenaZPodatkiem * napiwek;

        double lacznaKwota = cenaZPodatkiem + cenaNapiwek;

        System.out.println(cena);
        System.out.println(cenaPodatek);
        System.out.println(cenaNapiwek);
        System.out.println(lacznaKwota);

    }
}
