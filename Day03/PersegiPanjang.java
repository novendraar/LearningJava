package Day03;

public class PersegiPanjang extends BangunDatar{
    public PersegiPanjang(){

    }
    public PersegiPanjang(double panjang, double lebar){
        setGarisHorizontal(panjang);
        setGarisVertikal(lebar);
    }
    @Override
    public double Luas() {
        double panjang = getGarisHorizontal();
        double lebar = getGarisVertikal();
        double result = panjang * lebar;
        return result;
    }

    public double Luas(double panjang, double lebar){
        double result = panjang * lebar;
        return result;
    }
    @Override
    public double Keliling() {
        double panjang = getGarisHorizontal();
        double lebar = getGarisVertikal();
        double result = 2 * (panjang + lebar);
        return result;
    }

    public double Keliling(double panjang, double lebar){
        double result = 2 * (panjang + lebar);
        return result;
    }
}
