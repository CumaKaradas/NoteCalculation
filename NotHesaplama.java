import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan not bilgilerini alma
        System.out.println("Vize notunu giriniz: ");
        double vize = scanner.nextDouble();

        System.out.println("Final notunu giriniz: ");
        double finalNot = scanner.nextDouble();

        System.out.println("Proje notunu giriniz: ");
        double proje = scanner.nextDouble();

        // Not ortalamasını hesaplama
        double notOrtalamasi = (vize * 0.3) + (finalNot * 0.5) + (proje * 0.2);

        // Not ortalamasına göre harf notunu belirleme
        String harfNotu;
        if (notOrtalamasi >= 90) {
            harfNotu = "AA";
        } else if (notOrtalamasi >= 85) {
            harfNotu = "BA";
        } else if (notOrtalamasi >= 80) {
            harfNotu = "BB";
        } else if (notOrtalamasi >= 75) {
            harfNotu = "CB";
        } else if (notOrtalamasi >= 70) {
            harfNotu = "CC";
        } else if (notOrtalamasi >= 65) {
            harfNotu = "DC";
        } else if (notOrtalamasi >= 60) {
            harfNotu = "DD";
        } else if (notOrtalamasi >= 55) {
            harfNotu = "FD";
        } else {
            harfNotu = "FF";
        }

        // Sonucu ekrana yazdırma
        System.out.println("Not Ortalaması: " + notOrtalamasi);
        System.out.println("Harf Notu: " + harfNotu);

        scanner.close();
    }
}
