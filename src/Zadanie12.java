import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int kalorieCzterechCiastek = 300;
        int iloscCiastekWopakowaniu = 40;
        int iloscPorcjiWopakowaniu = 10;
        int iloscCiastekWJednejPorcji = iloscCiastekWopakowaniu / iloscPorcjiWopakowaniu;

        double kalorieJednegoCiastka = kalorieCzterechCiastek / iloscCiastekWJednejPorcji;

        System.out.println("podaj liczbe zjedzonych ciastek");
        double zjedzoneCiastka = klawiatura.nextDouble();
        double zjedzoneKalorie = kalorieJednegoCiastka * zjedzoneCiastka;
        System.out.println("zjadles " + zjedzoneKalorie + " kalorii");

    }
}
