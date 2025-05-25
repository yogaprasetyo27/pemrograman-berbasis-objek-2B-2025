public class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;
    private final int KAPASITAS_MAX = 100;
    
    public Perpustakaan() {
        this.daftarBuku = new Buku[KAPASITAS_MAX];
        this.jumlahBuku = 0;
    }
    
    public boolean tambahBuku(String judul, String penulis, int jumlahHalaman) {
        if (jumlahBuku < KAPASITAS_MAX) {
            daftarBuku[jumlahBuku] = new Buku(judul, penulis, jumlahHalaman);
            jumlahBuku++;
            System.out.println("Buku \"" + judul + "\" berhasil ditambahkan ke perpustakaan");
            return true;
        }else {
            System.out.println("Perpustakaan penuh. Tidak dapat menambahkan buku baru");
            return false;
        }
    }
    
    public Buku cariBuku(String judul) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].getJudul().equalsIgnoreCase(judul)) {
                return daftarBuku[i];
            }
        }
        return null;
    }
    
    public void tampilkanSemuaBuku() {
        if (jumlahBuku == 0) {
            System.out.println("Perpustakaan kosong. Belum ada buku yang terdaftar");
            return;
        }
        
        System.out.println("\n=== Daftar Buku ===");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println((i+1) + ". " + daftarBuku[i]);
        }
        System.out.println("===================");
    }
    
    public int getJumlahBuku() {
        return jumlahBuku;
    }
}
