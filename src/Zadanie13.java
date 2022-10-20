import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj wynik pierwszego testu");
        double pierwszyTest = klawiatura.nextDouble();

        System.out.println("podaj wynik drugiego testu");
        double drugiTest = klawiatura.nextDouble();

        System.out.println("podaj wynik trzeciego testu");
        double trzeciTest = klawiatura.nextDouble();

        double suma = pierwszyTest + drugiTest + trzeciTest;

        double iloscTestow = 3;

        double srednia = suma / iloscTestow;

        System.out.println(srednia);





    }
}
