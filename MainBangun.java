package week9;
import java.util.Scanner;

public class MainBangun{
     public static void main(String[] args){
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Sisi Persegi : ");
        int sisi = scanner.nextInt();
        Persegi persegi = new Persegi (sisi);
        persegi.keliling();
        //END PERSEGI
        
        System.out.println("Masukkan Alas Segitiga : ");
        int alas = scanner.nextInt();
        System.out.println("Masukkan Tinggi Segitiga : ");
        int tinggi = scanner.nextInt();
        Segitiga segitiga = new Segitiga (alas , tinggi);
        segitiga.keliling();
        //END SEGITIGA

        System.out.println("Masukkan Radius Lingkaran : ");
        int radius = scanner.nextInt();
        Lingkaran lingkaran = new Lingkaran(radius);
        lingkaran.keliling();
        //END LINGKARAN

        System.out.println("Masukkan Panjang PersegiPanjang : ");
        int panjang = scanner.nextInt();
        System.out.println("Masukkan Lebar PersegiPanjang : ");
        int lebar = scanner.nextInt();
        PersegiPanjang pp = new PersegiPanjang(panjang , lebar );
        pp.keliling();
        //END PERSEGI PANJANG

        scanner.close();
    }
}