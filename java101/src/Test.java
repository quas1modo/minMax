import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenler oluşturuldu, Koşulların sağlanması için minimum sayıya maksimum, maksimum sayıya ise minimum sayı atandı.
        int count, number1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();

        //Döngüde eğer girilen sayı minimum sayıdan küçükse yeni minimum sayı o oldu.
        //Aynı şekilde maksimum sayı için de.
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number1 = input.nextInt();

            if (number1 < min) {
                min = number1;
            }
            if (number1 > max) {
                max = number1;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}

