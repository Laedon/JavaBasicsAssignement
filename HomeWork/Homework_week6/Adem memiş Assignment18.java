import java.util.Scanner;
//2311502230 Adem memiş
public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bölünen sayiyi giriniz:");
        int bölünen = scan.nextInt();
        System.out.println("Bölen sayiyi giriniz:");
        int bölen = scan.nextInt();
        if(bölen != 0){
            int sonuc = bölme(bölünen, bölen);
            System.out.println("Sonuç: " + sonuc);
        } else {
                System.out.println("Hata 0 ile bölünmeye izin verilmemektedir");
        }
    }
    public static int bölme(int bölünen, int bölen) {
        if (bölen == 0) {
        }
        return bölünen / bölen;
    }
}
