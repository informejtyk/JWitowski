import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj cene produktu");
        double cena = klawiatura.nextDouble();

        double podStanowy = 0.04;
        System.out.println("podatek stanowy wynosi " + podStanowy);

        double podLokalny = 0.02;
        System.out.println("podatek lokalny wynosi " + podLokalny);

        double cenazpodatkiemstanowym = cena * podStanowy;

        double podatki = cenazpodatkiemstanowym * podLokalny;

        double lacznaCena = cena - podatki;

        System.out.println("laczna cena wynosi: " + lacznaCena + " zlotych");
    }
}
