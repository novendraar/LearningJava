package Day03;

public class HitungMain {
    public static void main(String[] args) {
        //Hitung Luas & Keliling Persegi dengan menggunakan argumen di instance objek
        Persegi persegi = new Persegi(20.0);
        System.out.println("Hasil Luas Persegi: " + (int)persegi.Luas());
        System.out.println("Hasil Keliling Persegi: " + (int)persegi.Keliling());

        System.out.println();
        //Hitung Luas & keliling persegi tanpa menggunakan argumen di instance objek
        Persegi persegi2 = new Persegi();
        Integer hasilLuasPersegi = (int)persegi2.Luas(30);
        System.out.println("Hasil Luas Persegi2 : " + hasilLuasPersegi);

        Integer hasilKelilingPersegi = (int)persegi2.Keliling(50);
        System.out.println("Hasil Keliling Persegi2 : " + hasilKelilingPersegi);

        System.out.println();
        //Hitung Luas & Keliling Persegi Panjang dengan menggunakan argumen di instance objek
        PersegiPanjang persegiPanjang = new PersegiPanjang(20, 30);
        System.out.println("Hasil Luas Persegi Panjang: " + (int)persegiPanjang.Luas());
        System.out.println("Hasil Kelilling Persegi Panjang: " + (int)persegiPanjang.Keliling());

        System.out.println();
        //Hitung Luas & Keliling Persegi Panjang tanpa menggunakan  argumen di intance objek
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        Integer hasilLuasPersegiPanjang = (int)persegiPanjang2.Luas(30, 10);
        System.out.println("Hasil Luas Persegi Panjang2 : " + hasilLuasPersegiPanjang);

        Integer hasilKelilingPersegiPanjang = (int)persegiPanjang2.Keliling(40, 10);
        System.out.println("Hasil Keliling Persegi Panjang2: " + hasilKelilingPersegiPanjang);

        System.out.println();

        //Hitung Luas & Keliling Segitiga Sama Sisi dengan menggunakan argumen di instance 
        SegitigaSamaSisi segitigaLuas = new SegitigaSamaSisi(20, 30);
        System.out.println("Hasil Luas Segitiga Sama Sisi: " + segitigaLuas.Luas());

        SegitigaSamaSisi segitigaKeliling = new SegitigaSamaSisi(30);
        System.out.println("Hasil Keliling Segitiga Sama Sisi: " + segitigaKeliling.Keliling());

        System.out.println();

        //Hitung Luas & Keliling Segitiga Sama Sisi tanpa menggunakan argumen di instance
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi();
        System.out.println("Hasil Luas Segitiga Sama Sisi2: " + segitigaSamaSisi.Luas(20, 30));
        System.out.println("Hasil Keliling Segitiga Sama Sisi2: " + segitigaSamaSisi.Keliling(30));

        System.out.println();

        //Hitung Luas & Keliling JajarGenjang dengan menggunakan argumen di instance 
        JajarGenjang jajarGenjangLuas = new JajarGenjang(20, 30);
        System.out.println("Hasil Luas Jajar Genjang: " + jajarGenjangLuas.Luas());

        JajarGenjang jajarGenjangKeliling = new JajarGenjang(20, 30);
        System.out.println("Hasil Keliling Jajar Genjang: " + jajarGenjangKeliling.Keliling());

        System.out.println();

        //Hitung Luas & Keliling JajarGenjang tanpa menggunakan argumen di instance
        JajarGenjang jajarGenjang = new JajarGenjang();
        System.out.println("Hasil Luas Jajar Genjang2: " + jajarGenjang.Luas(20, 30));
        System.out.println("Hasil Keliling Jajar Genjang2: " + jajarGenjang.Keliling(20, 30));

        System.out.println();
        
        //Hitung Luas & Keliling JajarGenjang dengan menggunakan argumen di instance 
        Lingkaran lingkaran = new Lingkaran(6);
        System.out.printf("Hasil Luas Lingkaran: %.2f \n", lingkaran.Luas());
        System.out.printf("Hasil Keliling Lingkaran: %.2f \n", lingkaran.Keliling());

        System.out.println();

        //Hitung Luas & Keliling JajarGenjang tanpa menggunakan argumen di instance
        Lingkaran lingkaran2 = new Lingkaran();
        System.out.println("Hasil Luas Lingkaran2: " + lingkaran2.Luas(6));
        System.out.println("Hasil Keliling Lingkaran2: " + lingkaran2.Keliling(6));

        System.out.println();
   }
}
