package Day02;
public class Vehicle {
    public String name;
    public String models;
    public String brands;
    public int wheels;
    public Integer speed;
    public int engineCapacity;
    public String engineType;

    public void start(){
        if(this.speed != null){
            System.out.println("Kamu sudah menjalankan mobil");
        }
        else{
            this.speed = 0;
        }
    }

    public void acceleration(int speed){
        if(this.speed == null){
            System.out.println("Tidak dapat berjalan karena belum start");    
        }
        else{
            this.speed += speed;
            System.out.println("Your speed now: " + this.speed);
        }
    }

    public void brake(){
        if(this.speed == null || this.speed <= 0){
            System.out.println("Kamu tidak bisa mengerem karena belum berjalan");
        }
        else{
            this.speed -= 10;
            System.out.println("Your speed now: " + this.speed);
        }
    }

    public void stop(){
        if(this.speed != null){
            this.speed = 0;
            System.out.println("Kamu memberhentikan mobil dengan speed " + this.speed);
        }
        else{
            System.out.println("Kamu tidak bisa berhenti karena belum memulai");
        }
    }

    public void turnOff(){
        if(this.speed != null){
            this.speed = null;
            System.out.println("Kamu sudah mematikan mesin");
        }
        else{
            System.out.println("Kamu belum mulai");
        }
    }

    public void rev(){
        System.out.println("suara kendaraan");
    }
}
