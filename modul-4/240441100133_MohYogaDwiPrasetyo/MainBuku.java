public class MainBuku {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        perpus.tambahBuku("Laskar Pelangi", "Andrea Hirata", 200);
        perpus.tambahBuku("Bumi Manusia", "Pramoedya Ananta Toer", 150);
        perpus.tambahBuku("Filosofi Teras", "Henry Manampiring", 350);
        perpus.tambahBuku("Atomic Habits", "James Clear", 320);
        perpus.tambahBuku("Sapiens", "Yuval Noah Harari", 500);
        
        perpus.tampilkanSemuaBuku(); //tampil semua buku
        
        // cari buku dan tampilkan infone
        System.out.println("Mencari buku \"Filosofi Teras\":");
        Buku bukuDicari = perpus.cariBuku("Filosofi Teras");
        if (bukuDicari != null) {
            System.out.println("Buku ditemukan!");
            System.out.println(bukuDicari);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
        
        // cari buku sg gaada
        System.out.println("\nMencari buku \"Harry Potter\":");
        Buku bukuTidakAda = perpus.cariBuku("Harry Potter");
        if (bukuTidakAda != null) {
            System.out.println("Buku ditemukan!");
            System.out.println(bukuTidakAda);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
        
        // tampilkan jmlh buku di perpus
        System.out.println("\nJumlah buku di perpustakaan: " + perpus.getJumlahBuku());
    }
    
}
