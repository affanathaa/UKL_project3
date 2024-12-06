import java.util.Scanner;
public class Soalsedang3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    int[][] soal = {
            {2, '*', 6},
            {8, '/', 4},
            {5, '%', 3},
            {1, '*' ,5},
            {15, '/' ,5},
            {8, '%' ,2}
    };

    int benar = 0, salah = 0, i = 0;

    while (true) {
        if (i == soal.length) {
            System.out.println("SELESAI");
            System.out.println("True: " + benar + ", False: " + salah);
            break;
        }

        int num1 = soal[i][0];
        char operator = (char) soal[i][1];
        int num2 = soal[i][2];

        System.out.print(num1 + " " + operator + " " + num2 + " = ");
        int jawabanBenar = hitung(num1, num2, operator);
        int jawabanUser = scanner.nextInt();

        if (jawabanUser == jawabanBenar) {
            System.out.println("Jawaban Anda Benar");
            benar++;
        } else {
            System.out.println("Jawaban Anda Salah: " + jawabanBenar);
            salah++;
        }

        // Tambahkan bagian untuk menanyakan apakah ingin melanjutkan
        System.out.print("Apakah Mau Lanjut (y/n): ");
        String lanjut = scanner.next();

        if (lanjut.equalsIgnoreCase("n")) {
            System.out.println("TERIMAKASIH");
            break;
        }

        i++;
    }

    scanner.close();
}

static int hitung(int num1, int num2, char operator) {
    switch (operator) {
        case '*':
            return num1 * num2;
        case '/':
            return num1 / num2;
        case '%':
            return num1 % num2;
        default:
            return 0;
    }
}}