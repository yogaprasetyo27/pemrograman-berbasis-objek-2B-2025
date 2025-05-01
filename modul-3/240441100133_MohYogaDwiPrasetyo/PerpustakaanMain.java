import java.util.Scanner;

public class PerpustakaanMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        boolean lanjutkan = true;
        
        System.out.println("===== SISTEM MANAJEMEN PERPUSTAKAAN =====");
        
        for (int i = 0; lanjutkan; i++) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah buku fiksi");
            System.out.println("2. Tambah buku non-fiksi");
            System.out.println("3. Tampilkan koleksi buku");
            System.out.println("4. Keluar");
            System.out.print("\nPilih menu (1-4): ");
            
            // input pilihan menu
            String pilihan = input.nextLine();
            
            if (pilihan.equals("1")) {
                // input buku fiksi
                System.out.println("\n--- TAMBAH BUKU FIKSI ---");
                System.out.print("Judul: ");
                String judulFiksi = input.nextLine();
                System.out.print("Penulis: ");
                String penulisFiksi = input.nextLine();
                System.out.print("Genre: ");
                String genre = input.nextLine();
                
                BukuFiksi bukuFiksi = new BukuFiksi(judulFiksi, penulisFiksi, genre);
                perpus.tambahBukuFiksi(bukuFiksi);
            } 
            if (pilihan.equals("2")) {
                System.out.println("\n--- TAMBAH BUKU NON-FIKSI ---");
                System.out.print("Judul: ");
                String judulNonFiksi = input.nextLine();
                System.out.print("Penulis: ");
                String penulisNonFiksi = input.nextLine();
                System.out.print("Topik: ");
                String topik = input.nextLine();
                
                BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(judulNonFiksi, penulisNonFiksi, topik);
                perpus.tambahBukuNonFiksi(bukuNonFiksi);
            } 
            if (pilihan.equals("3")) {
                perpus.tampilkanKoleksi();
            } 
            if (pilihan.equals("4")) {
                System.out.println("\nTerima kasih telah menggunakan sistem manajemen perpustakaan!");
                lanjutkan = false;
            } 
            else {
                System.out.println("\nPilihan tidak valid. Silakan pilih menu 1-4.");
            }
        }
        
        input.close();
    }
}