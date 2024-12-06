import java.util.Scanner;

public class Soalmudah1 {
    public static void main(String[] args) {
        Scanner wel = new Scanner(System.in);

        //input data

        System.out.println("Masukkan jarak tempuh (km): ");
        Double jarak = wel.nextDouble();

        System.out.println("Masukkan panjang paket (cm): ");
        Double panjang = wel.nextDouble();

        System.out.println("Masukkan lebar paket (cm): ");
        Double lebar = wel.nextDouble();

        System.out.println("Masukkan tinggi paket (cm): ");
        Double tinggi = wel.nextDouble();

        //Hitung volume
        double volume = panjang*lebar*tinggi;

        //Hitung biaya pengiriman 
        System.out.println("Berapa jauhnya ?  \n 1.kurang dari 10  \n 2. lebih dari 10 dan kurang dari 20");
int pilihan = wel.nextInt();
System.out.println("Masukkan berat paket (kg): ");
Double berat = wel.nextDouble();//menginput data
switch (pilihan) {
    case 1: 
    double biaya = 4250 * berat; 
    if ( volume > 100){
        biaya+=50000;
    } System.out.println("total biaya pengiriman: Rp " + biaya); 
    System.out.println("volume paket: " +volume + "cm^3");           
        break;
    case 2:
    biaya = 6000 * berat;
    if ( volume >100){
        biaya+=50000;
    }System.out.println("total biaya pengiriman: Rp " + biaya);
    System.out.println("volume paket: " +volume + "cm^3");
    case 3:
    biaya = 6000 * berat;
    if ( volume >200){
        biaya+=100000;
    }System.out.println("total biaya pengiriman: Rp " + biaya);
    System.out.println("volume paket: " +volume + "cm^3");
    break;
    default:
       System.out.println("masukkan inputan yang valid");
    }
        }
        
    }

