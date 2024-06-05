package week9;

public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void luas(){
        System.out.println("Alas segitiga adalah : " + getAlas());
        System.out.println("Tinggi segitiga adalah : " + getTinggi());
        System.out.println("Luasnya adalah : " + (alas*tinggi)/2);
    }

    public void keliling(){
        System.out.println("Keliling segitiga adalah : " + (int)Math.sqrt(alas*alas + tinggi*tinggi));
    }
    public int getTinggi(){ 
        return tinggi;
    }
    public int getAlas(){
        return alas;
    }
}