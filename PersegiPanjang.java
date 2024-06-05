package week9;

public class PersegiPanjang extends BangunDatar{
    private int panjang;
    private int lebar;

    PersegiPanjang(int panjang,int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void luas(){
        System.out.println("Luas Persegi Panjang adalah : " + (panjang*lebar));
    }
    public void keliling(){
        System.out.println("Keliling Persegi Panjang Adalah : " + 2 * (panjang + lebar));
    }

    //GETTER
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }

}