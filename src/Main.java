public class Main {
    public static void main(String[] args) {
        int wynik = sumaLiczb(2, 3);
        System.out.println("test metody" + wynik);
    }

    private static int sumaLiczb(int a , int b){
        return a+b;
    }

    private static void wypiszLiczbyDwucyfroweParezyste(){
        System.out.println("liczby dwucyfrowe parzyste");
        for (int i = 10; i <100 ; i= i+2){
            System.out.println(i+ ", ");
        }
    }
}
