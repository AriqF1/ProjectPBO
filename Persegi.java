package week9;

public class Persegi extends BangunDatar{

    private int sisi;
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    public void luas(){
        System.out.println("Luas Perseginya Adalah : " + (sisi * sisi));
    }
    public void keliling(){
        System.out.println("keliling Perseginya adalah : " + (sisi * 4));
    }
    public int getSisi(){
        return sisi;
    }
    
}