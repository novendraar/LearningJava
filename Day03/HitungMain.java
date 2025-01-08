package Day03;

import java.util.Scanner;

public class HitungMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("Ingin Menghitung luas atau keliling?");
            String perhitungan = sc.nextLine().toLowerCase();
            System.out.println("Silahkan tulisan bangunannya? pilihan bangunan Jajar Genjang, Lingkaran, Persegi, Persegi Panjang, Segitiga Sama Sisi?");
            String bangunan = sc.nextLine().toLowerCase().replaceAll("[^A-Za-z]", "");
            if(bangunan.contains("parallelogram") || bangunan.contains("jajargenjang") || bangunan.contains("jajar genjang")){
                JajarGenjang jg = new JajarGenjang();
                switch (perhitungan) {
                    case "keliling":
                        System.out.println("Masukkan nilai A: ");
                        double nilaiA = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Masukkan nilai B: ");
                        double nilaiB = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Keliling Jajar Genjang: " + jg.Keliling(nilaiA, nilaiB));
                        break;

                    case "luas":
                        System.out.println("Masukkan nilai alas: ");
                        double alas = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Masukkan nilai tinggi: ");
                        double tinggi = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Luas Jajar Genjang: " + jg.Luas(alas, tinggi));
                        break;
                
                    default:
                        System.out.println("Perhatikan kembali tulisan anda");
                        break;
                }
            }
            else if(bangunan.contains("lingkaran") || bangunan.contains("circle")){
                Lingkaran circle = new Lingkaran();
                System.out.println("Masukkan jari - jari: ");
                double r = sc.nextDouble();
                sc.nextLine();
                switch (perhitungan) {
                    case "keliling":
                        System.out.println("Keliling Lingkaran: " + circle.Keliling(r));
                        break;
                
                    case "luas":
                        System.out.println("Luas Lingkaran : " + circle.Luas(r));
                        break;

                    default:
                        System.out.println("Perhatikan kembali tulisan anda");
                        break;
                }
            }
            else if(bangunan.contains("square") || bangunan.contains("persegi")){
                Persegi square = new Persegi();
                System.out.println("Masukkan sisi: ");
                double sisi = sc.nextDouble();
                sc.nextLine();
                switch (perhitungan) {
                    case "keliling":
                        System.out.println("Keliling Persegi: " + square.Keliling(sisi));
                        break;
                
                    case "luas":
                        System.out.println("Luas Persegi : " + square.Luas(sisi));
                        break;

                    default:
                        System.out.println("Perhatikan kembali tulisan anda");
                        break;
                }
            }
            else if(bangunan.contains("rectangle") || bangunan.contains("persegi panjang") || bangunan.contains("persegipanjang")){
                PersegiPanjang rectangle = new PersegiPanjang();
                System.out.println("Masukkan panjang: ");
                double panjang = sc.nextDouble();
                sc.nextLine();
                System.out.println("Masukkan lebar: ");
                double lebar = sc.nextDouble();
                sc.nextLine();
                switch (perhitungan) {
                    case "keliling":
                        System.out.println("Keliling Persegi Panjang: " + rectangle.Keliling(panjang, lebar));
                        break;
                
                    case "luas":
                        System.out.println("Luas Persegi Panjang: " + rectangle.Luas(panjang, lebar));
                        break;

                    default:
                        System.out.println("Perhatikan kembali tulisan anda");
                        break;
                }
            }
            else if(bangunan.contains("triangle") || bangunan.contains("segitiga")){
                SegitigaSamaSisi triangle = new SegitigaSamaSisi();
                switch (perhitungan) {
                    case "keliling":
                        System.out.println("Masukkan panjang sisi: ");
                        double sisi = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Keliling Segitiga: " + triangle.Keliling(sisi));
                        break;
                
                    case "luas":
                        System.out.println("Masukkan panjang alas: ");
                        double alas = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Masukkan panjang tinggi: ");
                        double tinggi = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Luas Segitiga: " + triangle.Luas(alas, tinggi));
                        break;

                    default:
                        System.out.println("Perhatikan kembali tulisan anda");
                        break;
                }
            }
            else{
                System.out.println("Perhatikan kembali tulisan anda");
            }

            System.out.println("Apakah ingin lanjut perhitungan? Yes / No");
            String cont = sc.nextLine().toLowerCase();
            if(cont.equals("no") || cont.contains("n")){
                lanjut = false;
            }
        }
        sc.close();

        //Hitung Luas & Keliling Persegi dengan menggunakan argumen di instance objek
        
        // Persegi persegi = new Persegi(20.0);
        // System.out.println("Hasil Luas Persegi: " + (int)persegi.Luas());
        // System.out.println("Hasil Keliling Persegi: " + (int)persegi.Keliling());

        // System.out.println();
        // //Hitung Luas & keliling persegi tanpa menggunakan argumen di instance objek
        // Persegi persegi2 = new Persegi();
        // Integer hasilLuasPersegi = (int)persegi2.Luas(30);
        // System.out.println("Hasil Luas Persegi2 : " + hasilLuasPersegi);

        // Integer hasilKelilingPersegi = (int)persegi2.Keliling(50);
        // System.out.println("Hasil Keliling Persegi2 : " + hasilKelilingPersegi);

        // System.out.println();
        // //Hitung Luas & Keliling Persegi Panjang dengan menggunakan argumen di instance objek
        // PersegiPanjang persegiPanjang = new PersegiPanjang(20, 30);
        // System.out.println("Hasil Luas Persegi Panjang: " + (int)persegiPanjang.Luas());
        // System.out.println("Hasil Kelilling Persegi Panjang: " + (int)persegiPanjang.Keliling());

        // System.out.println();
        // //Hitung Luas & Keliling Persegi Panjang tanpa menggunakan  argumen di intance objek
        // PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        // Integer hasilLuasPersegiPanjang = (int)persegiPanjang2.Luas(30, 10);
        // System.out.println("Hasil Luas Persegi Panjang2 : " + hasilLuasPersegiPanjang);

        // Integer hasilKelilingPersegiPanjang = (int)persegiPanjang2.Keliling(40, 10);
        // System.out.println("Hasil Keliling Persegi Panjang2: " + hasilKelilingPersegiPanjang);

        // System.out.println();

        // //Hitung Luas & Keliling Segitiga Sama Sisi dengan menggunakan argumen di instance 
        // SegitigaSamaSisi segitigaLuas = new SegitigaSamaSisi(20, 30);
        // System.out.println("Hasil Luas Segitiga Sama Sisi: " + segitigaLuas.Luas());

        // SegitigaSamaSisi segitigaKeliling = new SegitigaSamaSisi(30);
        // System.out.println("Hasil Keliling Segitiga Sama Sisi: " + segitigaKeliling.Keliling());

        // System.out.println();

        // //Hitung Luas & Keliling Segitiga Sama Sisi tanpa menggunakan argumen di instance
        // SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi();
        // System.out.println("Hasil Luas Segitiga Sama Sisi2: " + segitigaSamaSisi.Luas(20, 30));
        // System.out.println("Hasil Keliling Segitiga Sama Sisi2: " + segitigaSamaSisi.Keliling(30));

        // System.out.println();

        // //Hitung Luas & Keliling JajarGenjang dengan menggunakan argumen di instance 
        // JajarGenjang jajarGenjangLuas = new JajarGenjang(20, 30);
        // System.out.println("Hasil Luas Jajar Genjang: " + jajarGenjangLuas.Luas());

        // JajarGenjang jajarGenjangKeliling = new JajarGenjang(20, 30);
        // System.out.println("Hasil Keliling Jajar Genjang: " + jajarGenjangKeliling.Keliling());

        // System.out.println();

        // //Hitung Luas & Keliling JajarGenjang tanpa menggunakan argumen di instance
        // JajarGenjang jajarGenjang = new JajarGenjang();
        // System.out.println("Hasil Luas Jajar Genjang2: " + jajarGenjang.Luas(20, 30));
        // System.out.println("Hasil Keliling Jajar Genjang2: " + jajarGenjang.Keliling(20, 30));

        // System.out.println();
        
        // //Hitung Luas & Keliling JajarGenjang dengan menggunakan argumen di instance 
        // Lingkaran lingkaran = new Lingkaran(6);
        // System.out.printf("Hasil Luas Lingkaran: %.2f \n", lingkaran.Luas());
        // System.out.printf("Hasil Keliling Lingkaran: %.2f \n", lingkaran.Keliling());

        // System.out.println();

        // //Hitung Luas & Keliling JajarGenjang tanpa menggunakan argumen di instance
        // Lingkaran lingkaran2 = new Lingkaran();
        // System.out.println("Hasil Luas Lingkaran2: " + lingkaran2.Luas(6));
        // System.out.println("Hasil Keliling Lingkaran2: " + lingkaran2.Keliling(6));

        // System.out.println();
   }
}
