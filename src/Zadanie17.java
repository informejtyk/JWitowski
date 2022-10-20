import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double iloscAkcji = 600;

        double cenaAkcji = 21.77;

        double prowizja = 0.02;

        double prowizja1 = cenaAkcji * prowizja;

        double akcjaProwizja = prowizja1 + cenaAkcji;

        double bezProwizji = iloscAkcji * cenaAkcji;

        double lacznaCena = akcjaProwizja * iloscAkcji;

        System.out.println(bezProwizji + "zl");
        System.out.println(prowizja1 + "zl");
        System.out.println(lacznaCena + "zl");
    }
}
