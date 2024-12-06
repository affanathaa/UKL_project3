 import java.util.Scanner;
 public class Soalsedang1 {
    public static void main(String[] args) {
        // Membuat Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        
        // Memastikan bahwa input adalah bilangan positif
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            // Menghitung faktorial
            long faktorial = hitungFaktorial(n);
            
            // Menampilkan hasil
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }
        
        // Menutup scanner
        scanner.close();
    }

    // Method untuk menghitung faktorial
    public static long hitungFaktorial(int n) {
        long hasil = 1; // Inisialisasi hasil dengan 1
        for (int i = 1; i <= n; i++) {
            hasil *= i; // Mengalikan hasil dengan i
        }
        return hasil; // Mengembalikan nilai faktorial
    }
}

