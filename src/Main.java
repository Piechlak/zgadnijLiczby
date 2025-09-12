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
    }
}