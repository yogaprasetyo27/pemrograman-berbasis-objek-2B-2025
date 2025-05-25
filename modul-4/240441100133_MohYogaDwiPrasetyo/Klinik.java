public class Klinik {
    private Pasien[] daftarPasien;
    private int jumlahPasien;
    private final int KAPASITAS_MAX = 100;
    
    public Klinik() {
        this.daftarPasien = new Pasien[KAPASITAS_MAX];
        this.jumlahPasien = 0;
    }
    
    public boolean tambahPasien(String nama, int umur, String keluhan) {
        if (jumlahPasien < KAPASITAS_MAX) {
            daftarPasien[jumlahPasien] = new Pasien(nama, umur, keluhan);
            jumlahPasien++;
            System.out.println("Pasien atas nama " + nama + " berhasil ditambahkan ke klinik");
            return true;
        }else {
            System.out.println("Kapasitas penuh. Tidak dapat mendaftarkan pasien baru");
            return false;
        }
    }
    
    public Pasien cariPasien(String nama) {
        for (int i = 0; i < jumlahPasien; i++) {
            if (daftarPasien[i].getNama().equalsIgnoreCase(nama)) {
                return daftarPasien[i];
            }
        }
        return null;
    }
    
    public void tampilkanSemuaPasien() {
        if (jumlahPasien == 0) {
            System.out.println("Belum ada pasien yang terdaftar di klinik");
            return;
        }
        
        System.out.println("\n=== Daftar Pasien ===");
        for (int i = 0; i < jumlahPasien; i++) {
            System.out.println((i+1) + ". " + daftarPasien[i]);
        }
        System.out.println("=====================");
    }
    
    public int getJumlahPasien() {
        return jumlahPasien;
    }
}
