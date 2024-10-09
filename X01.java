// 12S24021 - Ika Maria Munurung
// 12S24034 - Immanuel Alexander Tambunan
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargaBuku, totalHarga, minimalHarga;

        totalHarga = 0;
        minimalHarga = 999;
        hargaBuku = Double.parseDouble(input.nextLine());
        while (hargaBuku != 0) {
            if (hargaBuku == 0) {
            } else {
                if (hargaBuku < minimalHarga) {
                    minimalHarga = hargaBuku;
                } else {
                    hargaBuku = hargaBuku;
                }
                totalHarga = totalHarga + hargaBuku;
            }
            hargaBuku = Double.parseDouble(input.nextLine());
        }
        if (totalHarga >= 100) {
            totalHarga = totalHarga - minimalHarga;
        } else {
            totalHarga = totalHarga;
        }
        System.out.println(toFixed(totalHarga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
