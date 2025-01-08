package Day03;

public class Lingkaran extends BangunDatar{
    public Lingkaran(){

    }

    public Lingkaran(double r){
        setJariJari(r);
    }

    @Override
    public double Luas() {
        double jariJari = getJariJari();
        double result = Math.PI * Math.pow(jariJari, 2);
        return result;
    }

    public double Luas(double jariJari){
        double result = Math.PI * Math.pow(jariJari, 2);
        return result;
    }

    @Override
    public double Keliling() {
        double jariJari = getJariJari();
        double result = 2 * Math.PI * jariJari;
        return result;
    }

    public double Keliling(double jariJari){
        double result = 2 * Math.PI * jariJari;
        return result;
    }

}
