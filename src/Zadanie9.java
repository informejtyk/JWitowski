import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj swoje pierwsze imie");
        String firstName = klawiatura.nextLine();

        System.out.println("podaj swoje drugie imie");
        String middleName = klawiatura.nextLine();

        System.out.println("podaj swoje nazwisko");
        String lastName = klawiatura.nextLine();

        char firstInitial, middleInitial, lastInitial;
        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial = lastName.charAt(0);

        System.out.println("twoje inicjaly to: " + firstInitial + middleInitial + lastInitial);


    }
}
