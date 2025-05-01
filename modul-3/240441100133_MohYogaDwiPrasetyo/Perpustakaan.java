import java.util.ArrayList;

class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi;
    ArrayList<BukuNonFiksi> koleksiNonFiksi;
    
    public Perpustakaan() {
        this.koleksiFiksi = new ArrayList<>();
        this.koleksiNonFiksi = new ArrayList<>();
    }
    
    public void tambahBukuFiksi(BukuFiksi buku) {
        koleksiFiksi.add(buku);
        System.out.println("Buku fiksi berhasil ditambahkan ke koleksi.");
    }
    
    public void tambahBukuNonFiksi(BukuNonFiksi buku) {
        koleksiNonFiksi.add(buku);
        System.out.println("Buku non-fiksi berhasil ditambahkan ke koleksi.");
    }
    
    public void tampilkanKoleksi() {
        System.out.println("\n========== KOLEKSI BUKU PERPUSTAKAAN ==========");
        if (koleksiFiksi.isEmpty() && koleksiNonFiksi.isEmpty()) {
            System.out.println("Perpustakaan tidak memiliki koleksi buku.");
            return;
        }
        
        // tampil koleksi buku fiksi
        if (!koleksiFiksi.isEmpty()) {
            System.out.println("\n===== KOLEKSI BUKU FIKSI =====");
            for (BukuFiksi buku : koleksiFiksi) {
                buku.infoFiksi();
            }
        } else {
            System.out.println("\nTidak ada buku fiksi dalam koleksi.");
        }
        
        // tampil koleksi buku non-fiksi
        if (!koleksiNonFiksi.isEmpty()) {
            System.out.println("\n===== KOLEKSI BUKU NON-FIKSI =====");
            for (BukuNonFiksi buku : koleksiNonFiksi) {
                buku.infoNonFiksi();
            }
        } else {
            System.out.println("\nTidak ada buku non-fiksi dalam koleksi.");
        }
        
        System.out.println("\n==============================================");
    }
}