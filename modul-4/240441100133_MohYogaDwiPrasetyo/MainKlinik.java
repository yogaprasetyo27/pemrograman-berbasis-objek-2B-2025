public class MainKlinik {
    public static void main(String[] args) {
        Klinik klinikSehat = new Klinik();
        
        // tambah pasien
        klinikSehat.tambahPasien("Agus", 35, "Demam dan batuk");
        klinikSehat.tambahPasien("Herman", 28, "Sakit kepala");
        klinikSehat.tambahPasien("Siti", 42, "Gagal ginjal");
        klinikSehat.tambahPasien("Nur", 19, "Pegel linu");
        
        // tampilkan pasien
        klinikSehat.tampilkanSemuaPasien();
        
        // cari pasien dan perbarui keluhan
        System.out.println("Mencari pasien Nur:");
        Pasien pasienDicari = klinikSehat.cariPasien("Nur");
        if (pasienDicari != null) {
            System.out.println("Pasien ditemukan!");
            System.out.println(pasienDicari);
            
            // perbarui keluhan
            System.out.println("\nMemperbarui keluhan pasien Nur");
            pasienDicari.updateKeluhan("Mencret");
        } else {
            System.out.println("Pasien tidak ditemukan.");
        }
        
        // cari pasien yg tidak terdaftar
        System.out.println("\nMencari pasien Budi:");
        Pasien pasienTidakAda = klinikSehat.cariPasien("Budi");
        if (pasienTidakAda != null) {
            System.out.println("Pasien ditemukan!");
            System.out.println(pasienTidakAda);
        } else {
            System.out.println("Pasien tidak ditemukan.");
        }
        
        // tampilkan daftar pasien setelah pembaruan
        System.out.println("\nDaftar pasien setelah pembaruan:");
        klinikSehat.tampilkanSemuaPasien();
        
        // tampilkan jumlah pasien di klinik
        System.out.println("Jumlah pasien di klinik: " + klinikSehat.getJumlahPasien());
    }
    
}
