package Day03;

public class JajarGenjang extends BangunDatar{
    public JajarGenjang(){

    }

    public JajarGenjang(double a, double b){
        setGarisHorizontal(a);
        setGarisVertikal(b);
    }

    @Override
    public double Luas() {
        double alas = getGarisHorizontal();
        double tinggi = getGarisVertikal();
        double result = alas * tinggi;
        return result;
    }

    public double Luas(double alas, double tinggi){
        double result = alas * tinggi;
        return result;
    }

    @Override
    public double Keliling() {
        double atas = getGarisHorizontal();
        double bawah = getGarisVertikal();
        double result = 2 * (atas + bawah);
        return result;
    }

    public double Keliling(double atas, double bawah){
        double result = 2 * (atas + bawah);
        return result;
    }
}
