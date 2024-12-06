import java.util.Scanner;

public class Soalsulit1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();
        
        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0;
        
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai siswa ke-" + (i + 1) + ": ");
            nilaiSiswa[i] = scanner.nextDouble();
            totalNilai += nilaiSiswa[i];
        }
        
        double rataRata = totalNilai / jumlahSiswa;
        
        System.out.println("\nRata-rata nilai ujian seluruh siswa adalah: " + rataRata);
        
    }
}
