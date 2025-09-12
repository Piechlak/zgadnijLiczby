import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //typu proste
        //z malej litery, tylko zmienne a nie obiekty
        //nie maja metod
        //typy calkowite
        int liczba = 23;
        long liczba2 = 12345;
        short liczba5 = 123;
        byte liczba6 = 8;
        System.out.println(liczba2);
        //typy zmiennoprzecinkowe, liczby z ułamkiem
        float lcizba3 = 12.45f; //musi byc z litera f
        double liczba4 = 3.123441241243;
        // typ znakowy
        char znak = 'a'; //znaki w apostrofach
        //typ logiczny
        boolean czyTak = true;

        //napisz program w ktorym zgadniesz liczbe
        int liczbaDoZgadywania = (int)(Math.random()*100+1);//rzutowanie na calkowite
        //wpisywanie liczby z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z zakresu od 1 do 100");
        int liczbaWpisana = scanner.nextInt();
        if(liczbaWpisana == liczbaDoZgadywania){
            System.out.println("Brawo wygrana");
        }else {
            System.out.println("niestety sie nie udalo");
        }if(liczbaWpisana>liczbaDoZgadywania){
            int roznica = liczbaWpisana - liczbaDoZgadywania;
        }else {
            int roznica = liczbaDoZgadywania - liczbaWpisana;
        }
        int roznica = liczbaWpisana > liczbaDoZgadywania ? liczbaWpisana - liczbaDoZgadywania : liczbaDoZgadywania - liczbaWpisana;
        System.out.println(roznica);

        roznica = roznica/10; // poniewaz operacja jest wykonywana na liczbach calkowutych
        System.out.println("Roznica modulo 10 = "+roznica);
        //instrukcja switch
        switch (roznica){
            case 0:
                System.out.println("bardzo blisko");
                break;
            case 1:
                System.out.println("calkiem niezle");
                break;
            case 2:
                System.out.println("troche brakowalo");
                break;
            default:
                System.out.println("moze nastepnym razem bedzie lepiej");
        }
        //wyrazenie switch - zwraca wartosc
        System.out.println(
                switch (roznica){
                    case 0 -> "bylo blisko";
                    case 1 -> "calkiem niezle";
                    case 2 -> "troche brakowalo";
                    default -> "moze innym razem";
                }
        );
        System.out.println("zgadywanie 10 razy");
        for (int i = 0; i < 10; i++) {
            System.out.println("podaj liczbe");
            liczbaWpisana = scanner.nextInt();
            if (liczbaWpisana == liczbaDoZgadywania){
                System.out.println("brawo zgadles za " +i+"razem");
                break;
            }
            else if (liczbaWpisana>liczbaDoZgadywania){
                System.out.println("wpisales za duzo");
            }
            else {
                System.out.println("wpisales za malo");
            }
        }
        System.out.println("uwga losowanie nowej liczby");
        Random random = new Random();
        int liczbaDoZgadywania2 = random.nextInt(1,101);
        System.out.println("podaj liczbe");
        liczbaWpisana = scanner.nextInt();
        while (liczbaWpisana != liczbaDoZgadywania2){
            System.out.println("podaj liczbe");
            liczbaWpisana = scanner.nextInt();
            if (liczbaWpisana>liczbaDoZgadywania2){
                System.out.println("wpisales za duzo");
            }
            else {
                System.out.println("wpisales za malo");
            }
        }
    }
}