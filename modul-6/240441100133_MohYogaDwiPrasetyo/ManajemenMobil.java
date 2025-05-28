import java.util.ArrayList;

public class ManajemenMobil {
    private ArrayList<Mobil> daftarMobil; //dk

    public ManajemenMobil() {
        this.daftarMobil = new ArrayList<>(); //buat list ksong
    }

    public void tambah_mobil(Mobil mobil) { // 1 prmeter mobil tipe Mobil
        daftarMobil.add(mobil);
        System.out.println("Mobil berhasil ditambahkan ke manajemen.");
    }

    public void operasikan_semua_mobil() {
        System.out.println("\n=== Mengoperasikan Semua Mobil ===");

        for (int i = 0; i < daftarMobil.size(); i++) {
            System.out.println("\n--- Mobil " + (i + 1) + " ---");
            Mobil mobil = daftarMobil.get(i);
            mobil.nyalakan_mesin();
            mobil.matikan_mesin();
        }
    }
}
