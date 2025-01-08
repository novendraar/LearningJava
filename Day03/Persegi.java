package Day03;

public class Persegi extends BangunDatar {
    public Persegi(){

    }
    public Persegi(double sisi){
        setGarisHorizontal(sisi);
    }

    @Override
    public double Luas(){
        double sisi = getGarisHorizontal();
        double result = sisi * sisi;
        return result;
    }

    public double Luas(double sisi){
        double result = sisi * sisi;
        return result;
    }

    @Override
    public double Keliling(){
        double sisi = getGarisHorizontal();
        double result = 4 * sisi;
        return result;
    }

    public double Keliling(double sisi){
        double result = 4 * sisi;
        return result;
    }
}
