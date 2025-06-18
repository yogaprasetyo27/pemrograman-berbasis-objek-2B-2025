import java.util.ArrayList;

public class SistemPerpustakaan {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            buku.info();
            System.out.println("Status: " + (buku.isTersedia() ? "Tersedia" : "Dipinjam") + "\n");
        }
    }
}
