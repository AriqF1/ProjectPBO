package week9;

public class Lingkaran{
    private int radius;
    private static final double Pi = 3.14;

    //KONSTRUKTOR LINGKARAN
    public Lingkaran( int radius ){
        this.radius = radius;
    }
    //METHOD LINGKARAN
    public double luas(){
        return radius*radius*Pi;
    }
    public void keliling(){
        System.out.println("Keliling Lingkarannya adalah : " + (double)(2 * Pi * radius));
    }
    //GETTER RADIUS((untuk menampilkan nilai radius)
    public int getRadius(){
        return radius;
    }
}