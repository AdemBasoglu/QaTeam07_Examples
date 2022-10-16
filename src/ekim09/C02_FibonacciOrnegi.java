package ekim09;

public class C02_FibonacciOrnegi {
    public static void main(String[] args) {
        // 1-2-3-5-8-13-21-34-55-89

        // Kullanicidan bir sayi alin ve o sayidan kucuk, en buyuk fibonacci sayisini bulun.

        System.out.println("Fibonacci Sayıları ");

        int sayi = 4000;
        int birinci = 0;
        int ikinci = 1;
        int ucuncu = 1;

        for (int i = ucuncu; i < sayi; i=birinci+ikinci) {
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;
        }
        System.out.println(ikinci);
    }
}
