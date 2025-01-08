package Day03;

public class SegitigaSamaSisi extends BangunDatar{
    public SegitigaSamaSisi(){

    }

    public SegitigaSamaSisi(double sisi){
        setGarisDiagonal(sisi);
    }

    public SegitigaSamaSisi(double alas, double tinggi){
        setGarisHorizontal(alas);
        setGarisVertikal(tinggi);   
    }

    @Override
    public double Luas() {
        double alas = getGarisHorizontal();
        double tinggi = getGarisVertikal();
        double result = (alas * tinggi) / 2;
        return result;
    }

    public double Luas(double alas, double tinggi){
        double result = (alas * tinggi) / 2;
        return result;
    }

    @Override
    public double Keliling() {
        double sisi = getGarisDiagonal();
        double result = 3 * sisi;
        return result;
    }

    public double Keliling(double sisi){
        double result = 3 * sisi;
        return result;
    }
}
